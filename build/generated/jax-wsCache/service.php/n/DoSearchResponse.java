
package n;

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
 *         &lt;element name="searchCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchCountFeatured" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchArray" type="{urn:SandboxWebApi}ArrayOfSearchresponsetype" minOccurs="0"/>
 *         &lt;element name="searchExcludedWords" type="{urn:SandboxWebApi}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="searchCategories" type="{urn:SandboxWebApi}ArrayOfCategoriesstruct" minOccurs="0"/>
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
    "searchCount",
    "searchCountFeatured",
    "searchArray",
    "searchExcludedWords",
    "searchCategories"
})
@XmlRootElement(name = "doSearchResponse")
public class DoSearchResponse {

    protected int searchCount;
    protected int searchCountFeatured;
    protected ArrayOfSearchresponsetype searchArray;
    protected ArrayOfString searchExcludedWords;
    protected ArrayOfCategoriesstruct searchCategories;

    /**
     * Gets the value of the searchCount property.
     * 
     */
    public int getSearchCount() {
        return searchCount;
    }

    /**
     * Sets the value of the searchCount property.
     * 
     */
    public void setSearchCount(int value) {
        this.searchCount = value;
    }

    /**
     * Gets the value of the searchCountFeatured property.
     * 
     */
    public int getSearchCountFeatured() {
        return searchCountFeatured;
    }

    /**
     * Sets the value of the searchCountFeatured property.
     * 
     */
    public void setSearchCountFeatured(int value) {
        this.searchCountFeatured = value;
    }

    /**
     * Gets the value of the searchArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchresponsetype }
     *     
     */
    public ArrayOfSearchresponsetype getSearchArray() {
        return searchArray;
    }

    /**
     * Sets the value of the searchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchresponsetype }
     *     
     */
    public void setSearchArray(ArrayOfSearchresponsetype value) {
        this.searchArray = value;
    }

    /**
     * Gets the value of the searchExcludedWords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSearchExcludedWords() {
        return searchExcludedWords;
    }

    /**
     * Sets the value of the searchExcludedWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSearchExcludedWords(ArrayOfString value) {
        this.searchExcludedWords = value;
    }

    /**
     * Gets the value of the searchCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoriesstruct }
     *     
     */
    public ArrayOfCategoriesstruct getSearchCategories() {
        return searchCategories;
    }

    /**
     * Sets the value of the searchCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoriesstruct }
     *     
     */
    public void setSearchCategories(ArrayOfCategoriesstruct value) {
        this.searchCategories = value;
    }

}
