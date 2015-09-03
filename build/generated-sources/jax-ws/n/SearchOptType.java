
package n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchOrderType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchCountry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchPriceFrom" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="searchPriceTo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="searchLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchOrderFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptType", propOrder = {

})
public class SearchOptType {

    @XmlElement(required = true)
    protected String searchString;
    protected Integer searchOptions;
    protected Integer searchOrder;
    protected Integer searchOrderType;
    protected Integer searchCountry;
    protected Integer searchCategory;
    protected Integer searchOffset;
    protected String searchCity;
    protected Integer searchState;
    protected Float searchPriceFrom;
    protected Float searchPriceTo;
    protected Integer searchLimit;
    protected Integer searchOrderFulfillmentTime;
    protected Integer searchUser;

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchOptions(Integer value) {
        this.searchOptions = value;
    }

    /**
     * Gets the value of the searchOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchOrder() {
        return searchOrder;
    }

    /**
     * Sets the value of the searchOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchOrder(Integer value) {
        this.searchOrder = value;
    }

    /**
     * Gets the value of the searchOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchOrderType() {
        return searchOrderType;
    }

    /**
     * Sets the value of the searchOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchOrderType(Integer value) {
        this.searchOrderType = value;
    }

    /**
     * Gets the value of the searchCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchCountry() {
        return searchCountry;
    }

    /**
     * Sets the value of the searchCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchCountry(Integer value) {
        this.searchCountry = value;
    }

    /**
     * Gets the value of the searchCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchCategory() {
        return searchCategory;
    }

    /**
     * Sets the value of the searchCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchCategory(Integer value) {
        this.searchCategory = value;
    }

    /**
     * Gets the value of the searchOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchOffset() {
        return searchOffset;
    }

    /**
     * Sets the value of the searchOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchOffset(Integer value) {
        this.searchOffset = value;
    }

    /**
     * Gets the value of the searchCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCity() {
        return searchCity;
    }

    /**
     * Sets the value of the searchCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCity(String value) {
        this.searchCity = value;
    }

    /**
     * Gets the value of the searchState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchState() {
        return searchState;
    }

    /**
     * Sets the value of the searchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchState(Integer value) {
        this.searchState = value;
    }

    /**
     * Gets the value of the searchPriceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSearchPriceFrom() {
        return searchPriceFrom;
    }

    /**
     * Sets the value of the searchPriceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSearchPriceFrom(Float value) {
        this.searchPriceFrom = value;
    }

    /**
     * Gets the value of the searchPriceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSearchPriceTo() {
        return searchPriceTo;
    }

    /**
     * Sets the value of the searchPriceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSearchPriceTo(Float value) {
        this.searchPriceTo = value;
    }

    /**
     * Gets the value of the searchLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchLimit() {
        return searchLimit;
    }

    /**
     * Sets the value of the searchLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchLimit(Integer value) {
        this.searchLimit = value;
    }

    /**
     * Gets the value of the searchOrderFulfillmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchOrderFulfillmentTime() {
        return searchOrderFulfillmentTime;
    }

    /**
     * Sets the value of the searchOrderFulfillmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchOrderFulfillmentTime(Integer value) {
        this.searchOrderFulfillmentTime = value;
    }

    /**
     * Gets the value of the searchUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchUser() {
        return searchUser;
    }

    /**
     * Sets the value of the searchUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchUser(Integer value) {
        this.searchUser = value;
    }

}
