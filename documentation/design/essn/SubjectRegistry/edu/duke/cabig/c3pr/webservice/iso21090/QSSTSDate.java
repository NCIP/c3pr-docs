
package edu.duke.cabig.c3pr.webservice.iso21090;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSS_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSS_TS.Date">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Date">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}TS.Date" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSS_TS.Date", propOrder = {
    "term"
})
public class QSSTSDate
    extends QSETTSDate
{

    protected List<TSDate> term;

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDate }
     * 
     * 
     */
    public List<TSDate> getTerm() {
        if (term == null) {
            term = new ArrayList<TSDate>();
        }
        return this.term;
    }

}
