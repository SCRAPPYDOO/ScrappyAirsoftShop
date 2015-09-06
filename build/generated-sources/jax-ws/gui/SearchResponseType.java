
package gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sItName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sItPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sItStartingPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sItIsBuyNow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItBuyNowPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sItBidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItFotoCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItStartingTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sItEndingTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sItTimeLeft" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sItCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sItState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItFeatured" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItThumbUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sItThumb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItPostage" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sItIsForGuests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItIsTablicaAdvert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItIsAllegroStandard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItHasFreeShipping" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItInstallmentsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItOrderFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItAdvertInfo" type="{urn:SandboxWebApi}AdvertInfoStruct"/>
 *         &lt;element name="sItSellerInfo" type="{urn:SandboxWebApi}SellerInfoStruct"/>
 *         &lt;element name="sItAttribsList" type="{urn:SandboxWebApi}ArrayOfAttribstruct" minOccurs="0"/>
 *         &lt;element name="sItFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponseType", propOrder = {

})
public class SearchResponseType {

    protected long sItId;
    @XmlElement(required = true)
    protected String sItName;
    protected float sItPrice;
    protected float sItStartingPrice;
    protected int sItIsBuyNow;
    protected float sItBuyNowPrice;
    protected int sItBidCount;
    protected int sItFotoCount;
    protected long sItStartingTime;
    protected long sItEndingTime;
    protected long sItTimeLeft;
    @XmlElement(required = true)
    protected String sItCity;
    protected int sItState;
    protected int sItCountry;
    protected int sItCategoryId;
    protected int sItFeatured;
    @XmlElement(required = true)
    protected String sItThumbUrl;
    protected int sItThumb;
    protected float sItPostage;
    protected int sItIsForGuests;
    protected int sItIsTablicaAdvert;
    protected int sItIsAllegroStandard;
    protected int sItHasFreeShipping;
    protected int sItInstallmentsAvailable;
    protected int sItOrderFulfillmentTime;
    @XmlElement(required = true)
    protected AdvertInfoStruct sItAdvertInfo;
    @XmlElement(required = true)
    protected SellerInfoStruct sItSellerInfo;
    protected ArrayOfAttribstruct sItAttribsList;
    protected int sItFulfillmentTime;

    /**
     * Gets the value of the sItId property.
     * 
     */
    public long getSItId() {
        return sItId;
    }

    /**
     * Sets the value of the sItId property.
     * 
     */
    public void setSItId(long value) {
        this.sItId = value;
    }

    /**
     * Gets the value of the sItName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItName() {
        return sItName;
    }

    /**
     * Sets the value of the sItName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItName(String value) {
        this.sItName = value;
    }

    /**
     * Gets the value of the sItPrice property.
     * 
     */
    public float getSItPrice() {
        return sItPrice;
    }

    /**
     * Sets the value of the sItPrice property.
     * 
     */
    public void setSItPrice(float value) {
        this.sItPrice = value;
    }

    /**
     * Gets the value of the sItStartingPrice property.
     * 
     */
    public float getSItStartingPrice() {
        return sItStartingPrice;
    }

    /**
     * Sets the value of the sItStartingPrice property.
     * 
     */
    public void setSItStartingPrice(float value) {
        this.sItStartingPrice = value;
    }

    /**
     * Gets the value of the sItIsBuyNow property.
     * 
     */
    public int getSItIsBuyNow() {
        return sItIsBuyNow;
    }

    /**
     * Sets the value of the sItIsBuyNow property.
     * 
     */
    public void setSItIsBuyNow(int value) {
        this.sItIsBuyNow = value;
    }

    /**
     * Gets the value of the sItBuyNowPrice property.
     * 
     */
    public float getSItBuyNowPrice() {
        return sItBuyNowPrice;
    }

    /**
     * Sets the value of the sItBuyNowPrice property.
     * 
     */
    public void setSItBuyNowPrice(float value) {
        this.sItBuyNowPrice = value;
    }

    /**
     * Gets the value of the sItBidCount property.
     * 
     */
    public int getSItBidCount() {
        return sItBidCount;
    }

    /**
     * Sets the value of the sItBidCount property.
     * 
     */
    public void setSItBidCount(int value) {
        this.sItBidCount = value;
    }

    /**
     * Gets the value of the sItFotoCount property.
     * 
     */
    public int getSItFotoCount() {
        return sItFotoCount;
    }

    /**
     * Sets the value of the sItFotoCount property.
     * 
     */
    public void setSItFotoCount(int value) {
        this.sItFotoCount = value;
    }

    /**
     * Gets the value of the sItStartingTime property.
     * 
     */
    public long getSItStartingTime() {
        return sItStartingTime;
    }

    /**
     * Sets the value of the sItStartingTime property.
     * 
     */
    public void setSItStartingTime(long value) {
        this.sItStartingTime = value;
    }

    /**
     * Gets the value of the sItEndingTime property.
     * 
     */
    public long getSItEndingTime() {
        return sItEndingTime;
    }

    /**
     * Sets the value of the sItEndingTime property.
     * 
     */
    public void setSItEndingTime(long value) {
        this.sItEndingTime = value;
    }

    /**
     * Gets the value of the sItTimeLeft property.
     * 
     */
    public long getSItTimeLeft() {
        return sItTimeLeft;
    }

    /**
     * Sets the value of the sItTimeLeft property.
     * 
     */
    public void setSItTimeLeft(long value) {
        this.sItTimeLeft = value;
    }

    /**
     * Gets the value of the sItCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItCity() {
        return sItCity;
    }

    /**
     * Sets the value of the sItCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItCity(String value) {
        this.sItCity = value;
    }

    /**
     * Gets the value of the sItState property.
     * 
     */
    public int getSItState() {
        return sItState;
    }

    /**
     * Sets the value of the sItState property.
     * 
     */
    public void setSItState(int value) {
        this.sItState = value;
    }

    /**
     * Gets the value of the sItCountry property.
     * 
     */
    public int getSItCountry() {
        return sItCountry;
    }

    /**
     * Sets the value of the sItCountry property.
     * 
     */
    public void setSItCountry(int value) {
        this.sItCountry = value;
    }

    /**
     * Gets the value of the sItCategoryId property.
     * 
     */
    public int getSItCategoryId() {
        return sItCategoryId;
    }

    /**
     * Sets the value of the sItCategoryId property.
     * 
     */
    public void setSItCategoryId(int value) {
        this.sItCategoryId = value;
    }

    /**
     * Gets the value of the sItFeatured property.
     * 
     */
    public int getSItFeatured() {
        return sItFeatured;
    }

    /**
     * Sets the value of the sItFeatured property.
     * 
     */
    public void setSItFeatured(int value) {
        this.sItFeatured = value;
    }

    /**
     * Gets the value of the sItThumbUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItThumbUrl() {
        return sItThumbUrl;
    }

    /**
     * Sets the value of the sItThumbUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItThumbUrl(String value) {
        this.sItThumbUrl = value;
    }

    /**
     * Gets the value of the sItThumb property.
     * 
     */
    public int getSItThumb() {
        return sItThumb;
    }

    /**
     * Sets the value of the sItThumb property.
     * 
     */
    public void setSItThumb(int value) {
        this.sItThumb = value;
    }

    /**
     * Gets the value of the sItPostage property.
     * 
     */
    public float getSItPostage() {
        return sItPostage;
    }

    /**
     * Sets the value of the sItPostage property.
     * 
     */
    public void setSItPostage(float value) {
        this.sItPostage = value;
    }

    /**
     * Gets the value of the sItIsForGuests property.
     * 
     */
    public int getSItIsForGuests() {
        return sItIsForGuests;
    }

    /**
     * Sets the value of the sItIsForGuests property.
     * 
     */
    public void setSItIsForGuests(int value) {
        this.sItIsForGuests = value;
    }

    /**
     * Gets the value of the sItIsTablicaAdvert property.
     * 
     */
    public int getSItIsTablicaAdvert() {
        return sItIsTablicaAdvert;
    }

    /**
     * Sets the value of the sItIsTablicaAdvert property.
     * 
     */
    public void setSItIsTablicaAdvert(int value) {
        this.sItIsTablicaAdvert = value;
    }

    /**
     * Gets the value of the sItIsAllegroStandard property.
     * 
     */
    public int getSItIsAllegroStandard() {
        return sItIsAllegroStandard;
    }

    /**
     * Sets the value of the sItIsAllegroStandard property.
     * 
     */
    public void setSItIsAllegroStandard(int value) {
        this.sItIsAllegroStandard = value;
    }

    /**
     * Gets the value of the sItHasFreeShipping property.
     * 
     */
    public int getSItHasFreeShipping() {
        return sItHasFreeShipping;
    }

    /**
     * Sets the value of the sItHasFreeShipping property.
     * 
     */
    public void setSItHasFreeShipping(int value) {
        this.sItHasFreeShipping = value;
    }

    /**
     * Gets the value of the sItInstallmentsAvailable property.
     * 
     */
    public int getSItInstallmentsAvailable() {
        return sItInstallmentsAvailable;
    }

    /**
     * Sets the value of the sItInstallmentsAvailable property.
     * 
     */
    public void setSItInstallmentsAvailable(int value) {
        this.sItInstallmentsAvailable = value;
    }

    /**
     * Gets the value of the sItOrderFulfillmentTime property.
     * 
     */
    public int getSItOrderFulfillmentTime() {
        return sItOrderFulfillmentTime;
    }

    /**
     * Sets the value of the sItOrderFulfillmentTime property.
     * 
     */
    public void setSItOrderFulfillmentTime(int value) {
        this.sItOrderFulfillmentTime = value;
    }

    /**
     * Gets the value of the sItAdvertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertInfoStruct }
     *     
     */
    public AdvertInfoStruct getSItAdvertInfo() {
        return sItAdvertInfo;
    }

    /**
     * Sets the value of the sItAdvertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertInfoStruct }
     *     
     */
    public void setSItAdvertInfo(AdvertInfoStruct value) {
        this.sItAdvertInfo = value;
    }

    /**
     * Gets the value of the sItSellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SellerInfoStruct }
     *     
     */
    public SellerInfoStruct getSItSellerInfo() {
        return sItSellerInfo;
    }

    /**
     * Sets the value of the sItSellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerInfoStruct }
     *     
     */
    public void setSItSellerInfo(SellerInfoStruct value) {
        this.sItSellerInfo = value;
    }

    /**
     * Gets the value of the sItAttribsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribstruct }
     *     
     */
    public ArrayOfAttribstruct getSItAttribsList() {
        return sItAttribsList;
    }

    /**
     * Sets the value of the sItAttribsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribstruct }
     *     
     */
    public void setSItAttribsList(ArrayOfAttribstruct value) {
        this.sItAttribsList = value;
    }

    /**
     * Gets the value of the sItFulfillmentTime property.
     * 
     */
    public int getSItFulfillmentTime() {
        return sItFulfillmentTime;
    }

    /**
     * Sets the value of the sItFulfillmentTime property.
     * 
     */
    public void setSItFulfillmentTime(int value) {
        this.sItFulfillmentTime = value;
    }

}
