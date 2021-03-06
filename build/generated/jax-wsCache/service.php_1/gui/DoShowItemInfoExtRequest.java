
package gui;

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
 *         &lt;element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="getDesc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getImageUrl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getAttribs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getPostageOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getCompanyInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getProductInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionHandle",
    "itemId",
    "getDesc",
    "getImageUrl",
    "getAttribs",
    "getPostageOptions",
    "getCompanyInfo",
    "getProductInfo"
})
@XmlRootElement(name = "DoShowItemInfoExtRequest")
public class DoShowItemInfoExtRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected long itemId;
    protected Integer getDesc;
    protected Integer getImageUrl;
    protected Integer getAttribs;
    protected Integer getPostageOptions;
    protected Integer getCompanyInfo;
    protected Integer getProductInfo;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

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
     * Gets the value of the getDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetDesc() {
        return getDesc;
    }

    /**
     * Sets the value of the getDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetDesc(Integer value) {
        this.getDesc = value;
    }

    /**
     * Gets the value of the getImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetImageUrl() {
        return getImageUrl;
    }

    /**
     * Sets the value of the getImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetImageUrl(Integer value) {
        this.getImageUrl = value;
    }

    /**
     * Gets the value of the getAttribs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAttribs() {
        return getAttribs;
    }

    /**
     * Sets the value of the getAttribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAttribs(Integer value) {
        this.getAttribs = value;
    }

    /**
     * Gets the value of the getPostageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetPostageOptions() {
        return getPostageOptions;
    }

    /**
     * Sets the value of the getPostageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetPostageOptions(Integer value) {
        this.getPostageOptions = value;
    }

    /**
     * Gets the value of the getCompanyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetCompanyInfo() {
        return getCompanyInfo;
    }

    /**
     * Sets the value of the getCompanyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetCompanyInfo(Integer value) {
        this.getCompanyInfo = value;
    }

    /**
     * Gets the value of the getProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetProductInfo() {
        return getProductInfo;
    }

    /**
     * Sets the value of the getProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetProductInfo(Integer value) {
        this.getProductInfo = value;
    }

}
