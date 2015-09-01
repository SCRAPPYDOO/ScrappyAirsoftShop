
package allegro;

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
 *         &lt;element name="sSpecialList" type="{urn:SandboxWebApi}ArrayOfSpecialauctionstruct" minOccurs="0"/>
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
    "sSpecialList"
})
@XmlRootElement(name = "doGetSpecialItemsResponse")
public class DoGetSpecialItemsResponse {

    protected ArrayOfSpecialauctionstruct sSpecialList;

    /**
     * Gets the value of the sSpecialList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialauctionstruct }
     *     
     */
    public ArrayOfSpecialauctionstruct getSSpecialList() {
        return sSpecialList;
    }

    /**
     * Sets the value of the sSpecialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialauctionstruct }
     *     
     */
    public void setSSpecialList(ArrayOfSpecialauctionstruct value) {
        this.sSpecialList = value;
    }

}
