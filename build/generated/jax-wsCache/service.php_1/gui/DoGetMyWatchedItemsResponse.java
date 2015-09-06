
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
 *         &lt;element name="watchedItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="watchedItemsList" type="{urn:SandboxWebApi}ArrayOfWatcheditemstruct" minOccurs="0"/>
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
    "watchedItemsCounter",
    "watchedItemsList"
})
@XmlRootElement(name = "doGetMyWatchedItemsResponse")
public class DoGetMyWatchedItemsResponse {

    protected int watchedItemsCounter;
    protected ArrayOfWatcheditemstruct watchedItemsList;

    /**
     * Gets the value of the watchedItemsCounter property.
     * 
     */
    public int getWatchedItemsCounter() {
        return watchedItemsCounter;
    }

    /**
     * Sets the value of the watchedItemsCounter property.
     * 
     */
    public void setWatchedItemsCounter(int value) {
        this.watchedItemsCounter = value;
    }

    /**
     * Gets the value of the watchedItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWatcheditemstruct }
     *     
     */
    public ArrayOfWatcheditemstruct getWatchedItemsList() {
        return watchedItemsList;
    }

    /**
     * Sets the value of the watchedItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWatcheditemstruct }
     *     
     */
    public void setWatchedItemsList(ArrayOfWatcheditemstruct value) {
        this.watchedItemsList = value;
    }

}
