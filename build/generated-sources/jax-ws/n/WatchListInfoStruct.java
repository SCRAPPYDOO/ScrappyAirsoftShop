
package n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatchListInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WatchListInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemsAdded" type="{urn:SandboxWebApi}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="itemsNotAdded" type="{urn:SandboxWebApi}ArrayOfItemsnotaddedstruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatchListInfoStruct", propOrder = {

})
public class WatchListInfoStruct {

    protected ArrayOfLong itemsAdded;
    protected ArrayOfItemsnotaddedstruct itemsNotAdded;

    /**
     * Gets the value of the itemsAdded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemsAdded() {
        return itemsAdded;
    }

    /**
     * Sets the value of the itemsAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemsAdded(ArrayOfLong value) {
        this.itemsAdded = value;
    }

    /**
     * Gets the value of the itemsNotAdded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemsnotaddedstruct }
     *     
     */
    public ArrayOfItemsnotaddedstruct getItemsNotAdded() {
        return itemsNotAdded;
    }

    /**
     * Sets the value of the itemsNotAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemsnotaddedstruct }
     *     
     */
    public void setItemsNotAdded(ArrayOfItemsnotaddedstruct value) {
        this.itemsNotAdded = value;
    }

}
