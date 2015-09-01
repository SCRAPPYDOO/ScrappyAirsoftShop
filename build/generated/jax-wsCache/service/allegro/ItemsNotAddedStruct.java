
package allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemsNotAddedStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemsNotAddedStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemsNotAddedStruct", propOrder = {

})
public class ItemsNotAddedStruct {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemErrorCode;
    @XmlElement(required = true)
    protected String itemErrorDescription;

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemErrorCode() {
        return itemErrorCode;
    }

    /**
     * Sets the value of the itemErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemErrorCode(String value) {
        this.itemErrorCode = value;
    }

    /**
     * Gets the value of the itemErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemErrorDescription() {
        return itemErrorDescription;
    }

    /**
     * Sets the value of the itemErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemErrorDescription(String value) {
        this.itemErrorDescription = value;
    }

}
