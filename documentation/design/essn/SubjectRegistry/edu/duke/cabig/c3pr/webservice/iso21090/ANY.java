
package edu.duke.cabig.c3pr.webservice.iso21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import edu.duke.cabig.c3pr.webservice.subjectregistry.COLLAdvanceSearchCriterionParameter;
import edu.duke.cabig.c3pr.webservice.subjectregistry.COLLPerformedStudySubjectMilestone;
import edu.duke.cabig.c3pr.webservice.subjectregistry.COLLPerson;
import edu.duke.cabig.c3pr.webservice.subjectregistry.COLLStudySubject;
import edu.duke.cabig.c3pr.webservice.subjectregistry.COLLStudySubjectConsentVersion;


/**
 * <p>Java class for ANY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANY">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}HXIT">
 *       &lt;attribute name="nullFlavor" type="{uri:iso.org:21090}NullFlavor" />
 *       &lt;attribute name="flavorId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateMode" type="{uri:iso.org:21090}UpdateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANY")
@XmlSeeAlso({
    COLLPerson.class,
    COLLAdvanceSearchCriterionParameter.class,
    COLLStudySubject.class,
    COLLPerformedStudySubjectMilestone.class,
    COLLStudySubjectConsentVersion.class,
    NPPDCO.class,
    NPPDTSBirth.class,
    UVPINTNonNeg.class,
    NPPDTELPerson.class,
    UVPPQTime.class,
    SLISTTSBirth.class,
    SLISTTSDateTimeFull.class,
    GLISTINT.class,
    NPPDTELEmail.class,
    NPPDEDImage.class,
    LISTTSDateTime.class,
    NPPDEDDoc.class,
    NPPDTS.class,
    CS.class,
    SLISTTSDate.class,
    UVPENPN.class,
    NPPDCS.class,
    AD.class,
    NPPDCDCV.class,
    UVPSTNT.class,
    NPPDAD.class,
    UVPINT.class,
    UVPED.class,
    NPPDCDCENone.class,
    SLISTREAL.class,
    UVPCDCV.class,
    NPPDTSDate.class,
    UVPCO.class,
    NPPDEDDocInline.class,
    NPPDCDCE.class,
    NPPDTSDateFull.class,
    NPPDBL.class,
    UVPINTPositive.class,
    NPPDEDSignature.class,
    UVPEDNarrative.class,
    NPPDINTNonNeg.class,
    SLISTINTNonNeg.class,
    LISTPQ.class,
    NPPDPQTime.class,
    UVPEDDoc.class,
    UVPTSDate.class,
    NPPDTEL.class,
    UVPST.class,
    SLISTPQ.class,
    COLLEN.class,
    GLISTPQTime.class,
    GLISTTSDateTimeFull.class,
    UVPENTN.class,
    UVPTELPhone.class,
    UVPEDText.class,
    UVPCD.class,
    NPPDTELUrl.class,
    UVPTEL.class,
    SLISTCO.class,
    NPPDREAL.class,
    UVPTSDateTime.class,
    GLISTCO.class,
    LISTEN.class,
    NPPDTELPhone.class,
    GLISTMO.class,
    COLLSC.class,
    COLLENON.class,
    NPPDENTN.class,
    COLLCDCV.class,
    NPPDRTO.class,
    LISTEDText.class,
    UVPCS.class,
    NPPDENPN.class,
    EN.class,
    NPPDCD.class,
    SLISTINTPositive.class,
    NPPDEN.class,
    UVPEDDocInline.class,
    BL.class,
    LISTTSBirth.class,
    LISTTEL.class,
    COLLMO.class,
    NPPDEDDocRef.class,
    NPPDINT.class,
    LISTEDSignature.class,
    LISTCDCENone.class,
    LISTENPN.class,
    COLLEDImage.class,
    LISTEDDoc.class,
    UVPEDImage.class,
    LISTREAL.class,
    UVPENON.class,
    LISTENTN.class,
    NPPDINTPositive.class,
    COLLTSDateTime.class,
    COLLCDCE.class,
    LISTST.class,
    COLLTSDateFull.class,
    NPPDTSDateTime.class,
    UVPCDCE.class,
    UVPTELEmail.class,
    UVPRTO.class,
    LISTPQTime.class,
    UVPTELUrl.class,
    LISTCDCE.class,
    COLLREAL.class,
    LISTEDDocInline.class,
    LISTTSDateFull.class,
    UVPEDSignature.class,
    LISTINTNonNeg.class,
    LISTSTNT.class,
    NPPDTSDateTimeFull.class,
    COLLPQTime.class,
    NPPDPQ.class,
    GLISTTSDateTime.class,
    UVPTSDateTimeFull.class,
    NPPDENON.class,
    UVPEN.class,
    NPPDII.class,
    NPPDSTNT.class,
    COLLCO.class,
    II.class,
    LISTBLNonNull.class,
    LISTTELPhone.class,
    COLLEDText.class,
    COLLEDSignature.class,
    LISTEDDocRef.class,
    LISTINTPositive.class,
    UVPMO.class,
    SLISTPQTime.class,
    NPPDED.class,
    UVPII.class,
    COLLRTO.class,
    LISTENON.class,
    URL.class,
    LISTCS.class,
    QTY.class,
    LISTTELUrl.class,
    NPPDEDText.class,
    NPPDEDNarrative.class,
    NPPDSC.class,
    UVPBLNonNull.class,
    SLISTTS.class,
    UVPCDCENone.class,
    UVPSCNT.class,
    LISTCD.class,
    GLISTINTNonNeg.class,
    COLLEDDocRef.class,
    COLLII.class,
    UVPTELPerson.class,
    LISTTS.class,
    UVPSC.class,
    LISTEDNarrative.class,
    SLISTTSDateFull.class,
    COLLTEL.class,
    COLLTELUrl.class,
    NPPDMO.class,
    COLLTELPerson.class,
    COLLENTN.class,
    GLISTINTPositive.class,
    UVPTSBirth.class,
    SLISTRTO.class,
    LISTTELPerson.class,
    ED.class,
    COLLINTPositive.class,
    COLLTSDate.class,
    UVPTSDateFull.class,
    GLISTREAL.class,
    UVPEDDocRef.class,
    COLLAD.class,
    COLLCDCENone.class,
    LISTII.class,
    LISTTSDateTimeFull.class,
    COLLST.class,
    COLLSTNT.class,
    UVPTS.class,
    COLLEDDocInline.class,
    SLISTMO.class,
    NPPDSCNT.class,
    ST.class,
    COLLEDDoc.class,
    COLLTS.class,
    LISTSC.class,
    LISTINT.class,
    UVPAD.class,
    UVPREAL.class,
    QSETRTO.class,
    LISTMO.class,
    LISTED.class,
    QSETCO.class,
    COLLINT.class,
    COLLCS.class,
    COLLTELEmail.class,
    GLISTTS.class,
    LISTBL.class,
    COLLCD.class,
    GLISTTSBirth.class,
    GLISTTSDate.class,
    QSETPQTime.class,
    GLISTPQ.class,
    QSETINTPositive.class,
    LISTSCNT.class,
    COLLSCNT.class,
    UVPBL.class,
    NPPDBLNonNull.class,
    CD.class,
    QSETREAL.class,
    QSETMO.class,
    QSETTSDateFull.class,
    QSETTSDate.class,
    LISTAD.class,
    SLISTTSDateTime.class,
    COLLED.class,
    SLISTINT.class,
    GLISTRTO.class,
    LISTCO.class,
    COLLPQ.class,
    LISTRTO.class,
    QSETTSBirth.class,
    UVPPQ.class,
    QSETTSDateTimeFull.class,
    COLLEDNarrative.class,
    COLLBLNonNull.class,
    COLLTSBirth.class,
    LISTEDImage.class,
    NPPDST.class,
    LISTCDCV.class,
    QSETTSDateTime.class,
    COLLENPN.class,
    QSETTS.class,
    COLLBL.class,
    COLLTSDateTimeFull.class,
    COLLTELPhone.class,
    LISTTELEmail.class,
    QSETINTNonNeg.class,
    QSETINT.class,
    QSETPQ.class,
    COLLINTNonNeg.class,
    LISTTSDate.class,
    GLISTTSDateFull.class
})
public abstract class ANY
    extends HXIT
{

    @XmlAttribute
    protected NullFlavor nullFlavor;
    @XmlAttribute
    protected String flavorId;
    @XmlAttribute
    protected UpdateMode updateMode;

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavor }
     *     
     */
    public NullFlavor getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavor }
     *     
     */
    public void setNullFlavor(NullFlavor value) {
        this.nullFlavor = value;
    }

    /**
     * Gets the value of the flavorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavorId() {
        return flavorId;
    }

    /**
     * Sets the value of the flavorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavorId(String value) {
        this.flavorId = value;
    }

    /**
     * Gets the value of the updateMode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMode }
     *     
     */
    public UpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Sets the value of the updateMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMode }
     *     
     */
    public void setUpdateMode(UpdateMode value) {
        this.updateMode = value;
    }

}
