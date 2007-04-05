package edu.duke.cabig.c3pr.xml;

import junit.framework.TestCase;
import edu.duke.cabig.c3pr.domain.*;
import edu.duke.cabig.c3pr.xml.XmlMarshaller;
import gov.nih.nci.common.exception.XMLUtilityException;

import javax.xml.parsers.DocumentBuilderFactory;
import java.util.*;
import java.io.StringReader;
import java.io.File;
import java.io.Reader;
import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Will test the XML marshalling framework
 * for c3prv2
 * @testType unit
 *
 * Created by IntelliJ IDEA.
 * User: kherm
 * Date: Mar 11, 2007
 * Time: 2:08:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLMarshallerTestCase extends TestCase {

    static final String JAXP_SCHEMA_LANGUAGE =
            "http://java.sun.com/xml/jaxp/properties/schemaLanguage";

    static final String W3C_XML_SCHEMA =
            "http://www.w3.org/2001/XMLSchema";
    static final String schemaSource = "registration.xsd";
    static final String JAXP_SCHEMA_SOURCE =
            "http://java.sun.com/xml/jaxp/properties/schemaSource";

    XmlMarshaller marshaller;

    String strValue;
    boolean boolValue;
    Date dateValue;
    String studyGridId;
    String siteGridId;


    String marshalledRegistration;

    static final SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );

    protected void setUp() throws Exception {
        marshaller = new XmlMarshaller();
        //set values for parameters
        strValue= "tempStr";
        boolValue = true;
        dateValue = sdf.parse("2009/01/20");
        studyGridId = "studyGridId";
        siteGridId = "siteGridId";

    }


    protected void runTest() throws Throwable {
        testRegistrationSeriazlier();
        testSchemaValidation();
        testDeserialization();
    }

    /**
     * Test serialization of message
     *
     */
    public void testRegistrationSeriazlier(){
        StudyParticipantAssignment registration = new StudyParticipantAssignment();
        registration.setName("testName");

        registration.setStudyParticipantIdentifier(strValue);
        registration.setInformedConsentSignedDate(dateValue);
        registration.setStartDate(dateValue);
        registration.setEligibilityIndicator(boolValue);
        registration.setIdentifiers(getIdentifiers());

        StudySite studySite = new StudySite();

        HealthcareSite site = new HealthcareSite();
        site.setGridId(siteGridId);
        studySite.setSite(site);

        Study study = new Study();
        study.setGridId(studyGridId);
        study.setIdentifiers(getIdentifiers());
        studySite.setStudy(study);
        registration.setStudySite(studySite);

        Participant patient = new Participant();
        patient.setAdministrativeGenderCode(strValue);
        patient.setBirthDate(dateValue);
        patient.setEthnicGroupCode(strValue);
        patient.setFirstName(strValue);
        patient.setLastName(strValue);
        patient.setMaritalStatusCode(strValue);
        patient.setRaceCode(strValue);
        patient.setIdentifiers(getIdentifiers());

        registration.setParticipant(patient);

        Address address = new Address();
        address.setCity(strValue);
        address.setCountryCode(strValue);
        address.setPostalCode(strValue);
        address.setStateCode(strValue);
        address.setStateCode(strValue);
        address.setStreetAddress(strValue);

        patient.setAddress(address);

        try {
            marshalledRegistration = marshaller.toXML(registration);
            System.out.println(marshalledRegistration);
            assertNotNull(marshalledRegistration);
        } catch (XMLUtilityException e) {
            fail(e.getMessage());
        }

    }

    /**
     * Tests if the message generated can be validated
     * against the schema
     */
    public void testSchemaValidation(){
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setValidating(true);
        try {
            factory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
            factory.setAttribute(JAXP_SCHEMA_SOURCE,new File(schemaSource));

            //validate the marshalled message
            byte[] messageBytes = marshalledRegistration.getBytes();
            factory.newDocumentBuilder().parse(new ByteArrayInputStream(messageBytes));
        }
        catch (Exception x) {
            fail(x.getMessage());
        }
    }


    /**
     * Deserialize the message to test
     * deserialization process
     */
    public void testDeserialization(){
        Reader messageReader = new StringReader(marshalledRegistration);
        try {
           StudyParticipantAssignment unmarshalledRegistration = (StudyParticipantAssignment) marshaller.fromXML(messageReader);
            unmarshalledRegistration = (StudyParticipantAssignment)marshaller.fromXML(new StringReader(marshalledRegistration));
            assertNotNull(unmarshalledRegistration);

            assertNotNull(unmarshalledRegistration.getParticipant());

            assertEquals(unmarshalledRegistration.getStudySite().getSite().getGridId(),siteGridId);
            assertEquals(unmarshalledRegistration.getStudySite().getStudy().getGridId(),studyGridId);

        } catch (XMLUtilityException e) {
            fail(e.getMessage());
        }
    }


    private List<Identifier> getIdentifiers(){
        java.util.List<Identifier> identifiers = new ArrayList<Identifier>();

        for(int temp=0;temp<3;temp++){
            Identifier ident = new Identifier();
            ident.setPrimaryIndicator(boolValue);
            ident.setSource(strValue+temp);
            ident.setType(strValue+temp);
            ident.setValue(strValue+temp);

            identifiers.add(ident);
        }
        return identifiers;
    }


}