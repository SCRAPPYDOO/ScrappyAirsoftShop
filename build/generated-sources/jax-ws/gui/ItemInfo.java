
package gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itBidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itEndingTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itSellerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itSellerLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itSellerRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itStartingTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itStartingPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itFotoCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itReservePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itBuyNowPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itBuyNowActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itHighBidder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itHighBidderLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itOptions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsEco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itHitCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itVatInvoice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itBankAccount1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itBankAccount2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itStartingQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsForGuests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itHasProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itOrderFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itEndingInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsAllegroStandard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsNewUsed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsBrandZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="itDurationInfo" type="{urn:SandboxWebApi}DurationInfoStruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfo", propOrder = {

})
public class ItemInfo {

    protected long itId;
    protected int itCountry;
    @XmlElement(required = true)
    protected String itName;
    protected float itPrice;
    protected int itBidCount;
    protected long itEndingTime;
    protected long itSellerId;
    @XmlElement(required = true)
    protected String itSellerLogin;
    protected int itSellerRating;
    protected long itStartingTime;
    protected float itStartingPrice;
    protected int itQuantity;
    protected int itFotoCount;
    protected float itReservePrice;
    @XmlElement(required = true)
    protected String itLocation;
    protected float itBuyNowPrice;
    protected int itBuyNowActive;
    protected int itHighBidder;
    @XmlElement(required = true)
    protected String itHighBidderLogin;
    @XmlElement(required = true)
    protected String itDescription;
    protected int itOptions;
    protected int itState;
    protected int itIsEco;
    protected long itHitCount;
    @XmlElement(required = true)
    protected String itPostcode;
    protected int itVatInvoice;
    @XmlElement(required = true)
    protected String itBankAccount1;
    @XmlElement(required = true)
    protected String itBankAccount2;
    protected int itStartingQuantity;
    protected int itIsForGuests;
    protected int itHasProduct;
    protected int itOrderFulfillmentTime;
    protected int itEndingInfo;
    protected int itIsAllegroStandard;
    protected int itIsNewUsed;
    protected Integer itIsBrandZone;
    protected DurationInfoStruct itDurationInfo;

    /**
     * Gets the value of the itId property.
     * 
     */
    public long getItId() {
        return itId;
    }

    /**
     * Sets the value of the itId property.
     * 
     */
    public void setItId(long value) {
        this.itId = value;
    }

    /**
     * Gets the value of the itCountry property.
     * 
     */
    public int getItCountry() {
        return itCountry;
    }

    /**
     * Sets the value of the itCountry property.
     * 
     */
    public void setItCountry(int value) {
        this.itCountry = value;
    }

    /**
     * Gets the value of the itName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItName() {
        return itName;
    }

    /**
     * Sets the value of the itName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItName(String value) {
        this.itName = value;
    }

    /**
     * Gets the value of the itPrice property.
     * 
     */
    public float getItPrice() {
        return itPrice;
    }

    /**
     * Sets the value of the itPrice property.
     * 
     */
    public void setItPrice(float value) {
        this.itPrice = value;
    }

    /**
     * Gets the value of the itBidCount property.
     * 
     */
    public int getItBidCount() {
        return itBidCount;
    }

    /**
     * Sets the value of the itBidCount property.
     * 
     */
    public void setItBidCount(int value) {
        this.itBidCount = value;
    }

    /**
     * Gets the value of the itEndingTime property.
     * 
     */
    public long getItEndingTime() {
        return itEndingTime;
    }

    /**
     * Sets the value of the itEndingTime property.
     * 
     */
    public void setItEndingTime(long value) {
        this.itEndingTime = value;
    }

    /**
     * Gets the value of the itSellerId property.
     * 
     */
    public long getItSellerId() {
        return itSellerId;
    }

    /**
     * Sets the value of the itSellerId property.
     * 
     */
    public void setItSellerId(long value) {
        this.itSellerId = value;
    }

    /**
     * Gets the value of the itSellerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItSellerLogin() {
        return itSellerLogin;
    }

    /**
     * Sets the value of the itSellerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItSellerLogin(String value) {
        this.itSellerLogin = value;
    }

    /**
     * Gets the value of the itSellerRating property.
     * 
     */
    public int getItSellerRating() {
        return itSellerRating;
    }

    /**
     * Sets the value of the itSellerRating property.
     * 
     */
    public void setItSellerRating(int value) {
        this.itSellerRating = value;
    }

    /**
     * Gets the value of the itStartingTime property.
     * 
     */
    public long getItStartingTime() {
        return itStartingTime;
    }

    /**
     * Sets the value of the itStartingTime property.
     * 
     */
    public void setItStartingTime(long value) {
        this.itStartingTime = value;
    }

    /**
     * Gets the value of the itStartingPrice property.
     * 
     */
    public float getItStartingPrice() {
        return itStartingPrice;
    }

    /**
     * Sets the value of the itStartingPrice property.
     * 
     */
    public void setItStartingPrice(float value) {
        this.itStartingPrice = value;
    }

    /**
     * Gets the value of the itQuantity property.
     * 
     */
    public int getItQuantity() {
        return itQuantity;
    }

    /**
     * Sets the value of the itQuantity property.
     * 
     */
    public void setItQuantity(int value) {
        this.itQuantity = value;
    }

    /**
     * Gets the value of the itFotoCount property.
     * 
     */
    public int getItFotoCount() {
        return itFotoCount;
    }

    /**
     * Sets the value of the itFotoCount property.
     * 
     */
    public void setItFotoCount(int value) {
        this.itFotoCount = value;
    }

    /**
     * Gets the value of the itReservePrice property.
     * 
     */
    public float getItReservePrice() {
        return itReservePrice;
    }

    /**
     * Sets the value of the itReservePrice property.
     * 
     */
    public void setItReservePrice(float value) {
        this.itReservePrice = value;
    }

    /**
     * Gets the value of the itLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItLocation() {
        return itLocation;
    }

    /**
     * Sets the value of the itLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItLocation(String value) {
        this.itLocation = value;
    }

    /**
     * Gets the value of the itBuyNowPrice property.
     * 
     */
    public float getItBuyNowPrice() {
        return itBuyNowPrice;
    }

    /**
     * Sets the value of the itBuyNowPrice property.
     * 
     */
    public void setItBuyNowPrice(float value) {
        this.itBuyNowPrice = value;
    }

    /**
     * Gets the value of the itBuyNowActive property.
     * 
     */
    public int getItBuyNowActive() {
        return itBuyNowActive;
    }

    /**
     * Sets the value of the itBuyNowActive property.
     * 
     */
    public void setItBuyNowActive(int value) {
        this.itBuyNowActive = value;
    }

    /**
     * Gets the value of the itHighBidder property.
     * 
     */
    public int getItHighBidder() {
        return itHighBidder;
    }

    /**
     * Sets the value of the itHighBidder property.
     * 
     */
    public void setItHighBidder(int value) {
        this.itHighBidder = value;
    }

    /**
     * Gets the value of the itHighBidderLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItHighBidderLogin() {
        return itHighBidderLogin;
    }

    /**
     * Sets the value of the itHighBidderLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItHighBidderLogin(String value) {
        this.itHighBidderLogin = value;
    }

    /**
     * Gets the value of the itDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItDescription() {
        return itDescription;
    }

    /**
     * Sets the value of the itDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItDescription(String value) {
        this.itDescription = value;
    }

    /**
     * Gets the value of the itOptions property.
     * 
     */
    public int getItOptions() {
        return itOptions;
    }

    /**
     * Sets the value of the itOptions property.
     * 
     */
    public void setItOptions(int value) {
        this.itOptions = value;
    }

    /**
     * Gets the value of the itState property.
     * 
     */
    public int getItState() {
        return itState;
    }

    /**
     * Sets the value of the itState property.
     * 
     */
    public void setItState(int value) {
        this.itState = value;
    }

    /**
     * Gets the value of the itIsEco property.
     * 
     */
    public int getItIsEco() {
        return itIsEco;
    }

    /**
     * Sets the value of the itIsEco property.
     * 
     */
    public void setItIsEco(int value) {
        this.itIsEco = value;
    }

    /**
     * Gets the value of the itHitCount property.
     * 
     */
    public long getItHitCount() {
        return itHitCount;
    }

    /**
     * Sets the value of the itHitCount property.
     * 
     */
    public void setItHitCount(long value) {
        this.itHitCount = value;
    }

    /**
     * Gets the value of the itPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItPostcode() {
        return itPostcode;
    }

    /**
     * Sets the value of the itPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItPostcode(String value) {
        this.itPostcode = value;
    }

    /**
     * Gets the value of the itVatInvoice property.
     * 
     */
    public int getItVatInvoice() {
        return itVatInvoice;
    }

    /**
     * Sets the value of the itVatInvoice property.
     * 
     */
    public void setItVatInvoice(int value) {
        this.itVatInvoice = value;
    }

    /**
     * Gets the value of the itBankAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItBankAccount1() {
        return itBankAccount1;
    }

    /**
     * Sets the value of the itBankAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItBankAccount1(String value) {
        this.itBankAccount1 = value;
    }

    /**
     * Gets the value of the itBankAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItBankAccount2() {
        return itBankAccount2;
    }

    /**
     * Sets the value of the itBankAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItBankAccount2(String value) {
        this.itBankAccount2 = value;
    }

    /**
     * Gets the value of the itStartingQuantity property.
     * 
     */
    public int getItStartingQuantity() {
        return itStartingQuantity;
    }

    /**
     * Sets the value of the itStartingQuantity property.
     * 
     */
    public void setItStartingQuantity(int value) {
        this.itStartingQuantity = value;
    }

    /**
     * Gets the value of the itIsForGuests property.
     * 
     */
    public int getItIsForGuests() {
        return itIsForGuests;
    }

    /**
     * Sets the value of the itIsForGuests property.
     * 
     */
    public void setItIsForGuests(int value) {
        this.itIsForGuests = value;
    }

    /**
     * Gets the value of the itHasProduct property.
     * 
     */
    public int getItHasProduct() {
        return itHasProduct;
    }

    /**
     * Sets the value of the itHasProduct property.
     * 
     */
    public void setItHasProduct(int value) {
        this.itHasProduct = value;
    }

    /**
     * Gets the value of the itOrderFulfillmentTime property.
     * 
     */
    public int getItOrderFulfillmentTime() {
        return itOrderFulfillmentTime;
    }

    /**
     * Sets the value of the itOrderFulfillmentTime property.
     * 
     */
    public void setItOrderFulfillmentTime(int value) {
        this.itOrderFulfillmentTime = value;
    }

    /**
     * Gets the value of the itEndingInfo property.
     * 
     */
    public int getItEndingInfo() {
        return itEndingInfo;
    }

    /**
     * Sets the value of the itEndingInfo property.
     * 
     */
    public void setItEndingInfo(int value) {
        this.itEndingInfo = value;
    }

    /**
     * Gets the value of the itIsAllegroStandard property.
     * 
     */
    public int getItIsAllegroStandard() {
        return itIsAllegroStandard;
    }

    /**
     * Sets the value of the itIsAllegroStandard property.
     * 
     */
    public void setItIsAllegroStandard(int value) {
        this.itIsAllegroStandard = value;
    }

    /**
     * Gets the value of the itIsNewUsed property.
     * 
     */
    public int getItIsNewUsed() {
        return itIsNewUsed;
    }

    /**
     * Sets the value of the itIsNewUsed property.
     * 
     */
    public void setItIsNewUsed(int value) {
        this.itIsNewUsed = value;
    }

    /**
     * Gets the value of the itIsBrandZone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItIsBrandZone() {
        return itIsBrandZone;
    }

    /**
     * Sets the value of the itIsBrandZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItIsBrandZone(Integer value) {
        this.itIsBrandZone = value;
    }

    /**
     * Gets the value of the itDurationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DurationInfoStruct }
     *     
     */
    public DurationInfoStruct getItDurationInfo() {
        return itDurationInfo;
    }

    /**
     * Sets the value of the itDurationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationInfoStruct }
     *     
     */
    public void setItDurationInfo(DurationInfoStruct value) {
        this.itDurationInfo = value;
    }

}
