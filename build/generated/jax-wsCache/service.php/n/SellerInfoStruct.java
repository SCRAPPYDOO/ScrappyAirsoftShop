
package n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellerRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellerInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerInfoStruct", propOrder = {

})
public class SellerInfoStruct {

    protected int sellerId;
    @XmlElement(required = true)
    protected String sellerName;
    protected int sellerRating;
    protected int sellerInfo;

    /**
     * Gets the value of the sellerId property.
     * 
     */
    public int getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     */
    public void setSellerId(int value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the sellerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Sets the value of the sellerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerName(String value) {
        this.sellerName = value;
    }

    /**
     * Gets the value of the sellerRating property.
     * 
     */
    public int getSellerRating() {
        return sellerRating;
    }

    /**
     * Sets the value of the sellerRating property.
     * 
     */
    public void setSellerRating(int value) {
        this.sellerRating = value;
    }

    /**
     * Gets the value of the sellerInfo property.
     * 
     */
    public int getSellerInfo() {
        return sellerInfo;
    }

    /**
     * Sets the value of the sellerInfo property.
     * 
     */
    public void setSellerInfo(int value) {
        this.sellerInfo = value;
    }

}
