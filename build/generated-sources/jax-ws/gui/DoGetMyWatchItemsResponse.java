
package gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="watchItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="watchItemsList" type="{urn:SandboxWebApi}ArrayOfWatchitemstruct" minOccurs="0"/>
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
    "watchItemsCounter",
    "watchItemsList"
})
@XmlRootElement(name = "doGetMyWatchItemsResponse")
public class DoGetMyWatchItemsResponse {

    protected int watchItemsCounter;
    protected ArrayOfWatchitemstruct watchItemsList;

    /**
     * Gets the value of the watchItemsCounter property.
     * 
     */
    public int getWatchItemsCounter() {
        return watchItemsCounter;
    }

    /**
     * Sets the value of the watchItemsCounter property.
     * 
     */
    public void setWatchItemsCounter(int value) {
        this.watchItemsCounter = value;
    }

    /**
     * Gets the value of the watchItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWatchitemstruct }
     *     
     */
    public ArrayOfWatchitemstruct getWatchItemsList() {
        return watchItemsList;
    }

    /**
     * Sets the value of the watchItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWatchitemstruct }
     *     
     */
    public void setWatchItemsList(ArrayOfWatchitemstruct value) {
        this.watchItemsList = value;
    }

}
