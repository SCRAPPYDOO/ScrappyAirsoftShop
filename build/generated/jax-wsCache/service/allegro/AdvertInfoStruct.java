
package allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvertInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemIsAdvert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemAdvertId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvertInfoStruct", propOrder = {

})
public class AdvertInfoStruct {

    protected int itemIsAdvert;
    @XmlElement(required = true)
    protected String itemAdvertId;

    /**
     * Gets the value of the itemIsAdvert property.
     * 
     */
    public int getItemIsAdvert() {
        return itemIsAdvert;
    }

    /**
     * Sets the value of the itemIsAdvert property.
     * 
     */
    public void setItemIsAdvert(int value) {
        this.itemIsAdvert = value;
    }

    /**
     * Gets the value of the itemAdvertId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAdvertId() {
        return itemAdvertId;
    }

    /**
     * Sets the value of the itemAdvertId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAdvertId(String value) {
        this.itemAdvertId = value;
    }

}
