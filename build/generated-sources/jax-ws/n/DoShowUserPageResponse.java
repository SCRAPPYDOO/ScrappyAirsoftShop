
package n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userPageContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPagePharmacyPermit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPageAlcoholPermit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userPageContent",
    "userPagePharmacyPermit",
    "userPageAlcoholPermit"
})
@XmlRootElement(name = "doShowUserPageResponse")
public class DoShowUserPageResponse {

    @XmlElement(required = true)
    protected String userPageContent;
    @XmlElement(required = true)
    protected String userPagePharmacyPermit;
    @XmlElement(required = true)
    protected String userPageAlcoholPermit;

    /**
     * Gets the value of the userPageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPageContent() {
        return userPageContent;
    }

    /**
     * Sets the value of the userPageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPageContent(String value) {
        this.userPageContent = value;
    }

    /**
     * Gets the value of the userPagePharmacyPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPagePharmacyPermit() {
        return userPagePharmacyPermit;
    }

    /**
     * Sets the value of the userPagePharmacyPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPagePharmacyPermit(String value) {
        this.userPagePharmacyPermit = value;
    }

    /**
     * Gets the value of the userPageAlcoholPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPageAlcoholPermit() {
        return userPageAlcoholPermit;
    }

    /**
     * Sets the value of the userPageAlcoholPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPageAlcoholPermit(String value) {
        this.userPageAlcoholPermit = value;
    }

}
