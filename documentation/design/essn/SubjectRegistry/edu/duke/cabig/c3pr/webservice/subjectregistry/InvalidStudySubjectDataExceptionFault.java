
package edu.duke.cabig.c3pr.webservice.subjectregistry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidStudySubjectDataExceptionFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidStudySubjectDataExceptionFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://enterpriseservices.nci.nih.gov/SubjectRegistryService}SubjectRegistryFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidStudySubjectDataExceptionFault", namespace = "http://enterpriseservices.nci.nih.gov/SubjectRegistryService")
public class InvalidStudySubjectDataExceptionFault
    extends SubjectRegistryFault
{


}