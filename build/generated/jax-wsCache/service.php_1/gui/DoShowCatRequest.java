
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
 *         &lt;element name="catId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="catItemState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catItemOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catItemDurationOption" type="{urn:SandboxWebApi}DurationTimeInfo" minOccurs="0"/>
 *         &lt;element name="catAttribFields" type="{urn:SandboxWebApi}ArrayOfFieldsvalue" minOccurs="0"/>
 *         &lt;element name="catSortOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catItemsPrice" type="{urn:SandboxWebApi}PriceCatInfo" minOccurs="0"/>
 *         &lt;element name="catItemsOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catItemsLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catOrderFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "catId",
    "catItemState",
    "catItemOption",
    "catItemDurationOption",
    "catAttribFields",
    "catSortOptions",
    "catItemsPrice",
    "catItemsOffset",
    "catItemsLimit",
    "catOrderFulfillmentTime"
})
@XmlRootElement(name = "DoShowCatRequest")
public class DoShowCatRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected int catId;
    protected Integer catItemState;
    protected Integer catItemOption;
    protected DurationTimeInfo catItemDurationOption;
    protected ArrayOfFieldsvalue catAttribFields;
    protected Integer catSortOptions;
    protected PriceCatInfo catItemsPrice;
    protected Integer catItemsOffset;
    protected Integer catItemsLimit;
    protected Integer catOrderFulfillmentTime;

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
     * Gets the value of the catId property.
     * 
     */
    public int getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     */
    public void setCatId(int value) {
        this.catId = value;
    }

    /**
     * Gets the value of the catItemState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatItemState() {
        return catItemState;
    }

    /**
     * Sets the value of the catItemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatItemState(Integer value) {
        this.catItemState = value;
    }

    /**
     * Gets the value of the catItemOption property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatItemOption() {
        return catItemOption;
    }

    /**
     * Sets the value of the catItemOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatItemOption(Integer value) {
        this.catItemOption = value;
    }

    /**
     * Gets the value of the catItemDurationOption property.
     * 
     * @return
     *     possible object is
     *     {@link DurationTimeInfo }
     *     
     */
    public DurationTimeInfo getCatItemDurationOption() {
        return catItemDurationOption;
    }

    /**
     * Sets the value of the catItemDurationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationTimeInfo }
     *     
     */
    public void setCatItemDurationOption(DurationTimeInfo value) {
        this.catItemDurationOption = value;
    }

    /**
     * Gets the value of the catAttribFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public ArrayOfFieldsvalue getCatAttribFields() {
        return catAttribFields;
    }

    /**
     * Sets the value of the catAttribFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public void setCatAttribFields(ArrayOfFieldsvalue value) {
        this.catAttribFields = value;
    }

    /**
     * Gets the value of the catSortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatSortOptions() {
        return catSortOptions;
    }

    /**
     * Sets the value of the catSortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatSortOptions(Integer value) {
        this.catSortOptions = value;
    }

    /**
     * Gets the value of the catItemsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceCatInfo }
     *     
     */
    public PriceCatInfo getCatItemsPrice() {
        return catItemsPrice;
    }

    /**
     * Sets the value of the catItemsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCatInfo }
     *     
     */
    public void setCatItemsPrice(PriceCatInfo value) {
        this.catItemsPrice = value;
    }

    /**
     * Gets the value of the catItemsOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatItemsOffset() {
        return catItemsOffset;
    }

    /**
     * Sets the value of the catItemsOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatItemsOffset(Integer value) {
        this.catItemsOffset = value;
    }

    /**
     * Gets the value of the catItemsLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatItemsLimit() {
        return catItemsLimit;
    }

    /**
     * Sets the value of the catItemsLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatItemsLimit(Integer value) {
        this.catItemsLimit = value;
    }

    /**
     * Gets the value of the catOrderFulfillmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatOrderFulfillmentTime() {
        return catOrderFulfillmentTime;
    }

    /**
     * Sets the value of the catOrderFulfillmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatOrderFulfillmentTime(Integer value) {
        this.catOrderFulfillmentTime = value;
    }

}
