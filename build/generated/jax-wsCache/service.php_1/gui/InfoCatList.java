
package gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoCatList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoCatList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="catId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="catName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="catItemsCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoCatList", propOrder = {

})
public class InfoCatList {

    protected long catId;
    @XmlElement(required = true)
    protected String catName;
    protected long catItemsCount;

    /**
     * Gets the value of the catId property.
     * 
     */
    public long getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     */
    public void setCatId(long value) {
        this.catId = value;
    }

    /**
     * Gets the value of the catName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatName() {
        return catName;
    }

    /**
     * Sets the value of the catName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatName(String value) {
        this.catName = value;
    }

    /**
     * Gets the value of the catItemsCount property.
     * 
     */
    public long getCatItemsCount() {
        return catItemsCount;
    }

    /**
     * Sets the value of the catItemsCount property.
     * 
     */
    public void setCatItemsCount(long value) {
        this.catItemsCount = value;
    }

}
