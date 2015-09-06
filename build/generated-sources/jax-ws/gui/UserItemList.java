
package gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itBuyNowPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itBidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itTimeLeft" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itFotoCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsListingThumb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsBoldTitle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsBuyNow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itIsEscrow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itStartingTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itIsReservedPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itThumbUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itIsAllegroStandard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itHasFreeShipping" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itEndingTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserItemList", propOrder = {

})
public class UserItemList {

    protected long itId;
    @XmlElement(required = true)
    protected String itName;
    protected float itPrice;
    protected float itBuyNowPrice;
    protected int itBidCount;
    protected long itTimeLeft;
    protected int itFotoCount;
    protected int itIsListingThumb;
    protected int itIsBoldTitle;
    protected int itIsBuyNow;
    protected int itCountry;
    protected int itIsEscrow;
    protected long itStartingTime;
    protected int itIsReservedPrice;
    @XmlElement(required = true)
    protected String itThumbUrl;
    protected int itIsAllegroStandard;
    protected int itHasFreeShipping;
    protected Long itEndingTime;

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
     * Gets the value of the itTimeLeft property.
     * 
     */
    public long getItTimeLeft() {
        return itTimeLeft;
    }

    /**
     * Sets the value of the itTimeLeft property.
     * 
     */
    public void setItTimeLeft(long value) {
        this.itTimeLeft = value;
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
     * Gets the value of the itIsListingThumb property.
     * 
     */
    public int getItIsListingThumb() {
        return itIsListingThumb;
    }

    /**
     * Sets the value of the itIsListingThumb property.
     * 
     */
    public void setItIsListingThumb(int value) {
        this.itIsListingThumb = value;
    }

    /**
     * Gets the value of the itIsBoldTitle property.
     * 
     */
    public int getItIsBoldTitle() {
        return itIsBoldTitle;
    }

    /**
     * Sets the value of the itIsBoldTitle property.
     * 
     */
    public void setItIsBoldTitle(int value) {
        this.itIsBoldTitle = value;
    }

    /**
     * Gets the value of the itIsBuyNow property.
     * 
     */
    public int getItIsBuyNow() {
        return itIsBuyNow;
    }

    /**
     * Sets the value of the itIsBuyNow property.
     * 
     */
    public void setItIsBuyNow(int value) {
        this.itIsBuyNow = value;
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
     * Gets the value of the itIsEscrow property.
     * 
     */
    public int getItIsEscrow() {
        return itIsEscrow;
    }

    /**
     * Sets the value of the itIsEscrow property.
     * 
     */
    public void setItIsEscrow(int value) {
        this.itIsEscrow = value;
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
     * Gets the value of the itIsReservedPrice property.
     * 
     */
    public int getItIsReservedPrice() {
        return itIsReservedPrice;
    }

    /**
     * Sets the value of the itIsReservedPrice property.
     * 
     */
    public void setItIsReservedPrice(int value) {
        this.itIsReservedPrice = value;
    }

    /**
     * Gets the value of the itThumbUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItThumbUrl() {
        return itThumbUrl;
    }

    /**
     * Sets the value of the itThumbUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItThumbUrl(String value) {
        this.itThumbUrl = value;
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
     * Gets the value of the itHasFreeShipping property.
     * 
     */
    public int getItHasFreeShipping() {
        return itHasFreeShipping;
    }

    /**
     * Sets the value of the itHasFreeShipping property.
     * 
     */
    public void setItHasFreeShipping(int value) {
        this.itHasFreeShipping = value;
    }

    /**
     * Gets the value of the itEndingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItEndingTime() {
        return itEndingTime;
    }

    /**
     * Sets the value of the itEndingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItEndingTime(Long value) {
        this.itEndingTime = value;
    }

}
