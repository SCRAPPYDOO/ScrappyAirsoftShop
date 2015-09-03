
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
 *         &lt;element name="catParentArray" type="{urn:SandboxWebApi}ArrayOfInfocatlist" minOccurs="0"/>
 *         &lt;element name="catChildArray" type="{urn:SandboxWebApi}ArrayOfInfocatlist" minOccurs="0"/>
 *         &lt;element name="catSisterArray" type="{urn:SandboxWebApi}ArrayOfInfocatlist" minOccurs="0"/>
 *         &lt;element name="catItemsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="catItemsCountFeatured" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="catItemsArray" type="{urn:SandboxWebApi}ArrayOfSearchresponsetype" minOccurs="0"/>
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
    "catParentArray",
    "catChildArray",
    "catSisterArray",
    "catItemsCount",
    "catItemsCountFeatured",
    "catItemsArray"
})
@XmlRootElement(name = "doShowCatResponse")
public class DoShowCatResponse {

    protected ArrayOfInfocatlist catParentArray;
    protected ArrayOfInfocatlist catChildArray;
    protected ArrayOfInfocatlist catSisterArray;
    protected int catItemsCount;
    protected int catItemsCountFeatured;
    protected ArrayOfSearchresponsetype catItemsArray;

    /**
     * Gets the value of the catParentArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfocatlist }
     *     
     */
    public ArrayOfInfocatlist getCatParentArray() {
        return catParentArray;
    }

    /**
     * Sets the value of the catParentArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfocatlist }
     *     
     */
    public void setCatParentArray(ArrayOfInfocatlist value) {
        this.catParentArray = value;
    }

    /**
     * Gets the value of the catChildArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfocatlist }
     *     
     */
    public ArrayOfInfocatlist getCatChildArray() {
        return catChildArray;
    }

    /**
     * Sets the value of the catChildArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfocatlist }
     *     
     */
    public void setCatChildArray(ArrayOfInfocatlist value) {
        this.catChildArray = value;
    }

    /**
     * Gets the value of the catSisterArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfocatlist }
     *     
     */
    public ArrayOfInfocatlist getCatSisterArray() {
        return catSisterArray;
    }

    /**
     * Sets the value of the catSisterArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfocatlist }
     *     
     */
    public void setCatSisterArray(ArrayOfInfocatlist value) {
        this.catSisterArray = value;
    }

    /**
     * Gets the value of the catItemsCount property.
     * 
     */
    public int getCatItemsCount() {
        return catItemsCount;
    }

    /**
     * Sets the value of the catItemsCount property.
     * 
     */
    public void setCatItemsCount(int value) {
        this.catItemsCount = value;
    }

    /**
     * Gets the value of the catItemsCountFeatured property.
     * 
     */
    public int getCatItemsCountFeatured() {
        return catItemsCountFeatured;
    }

    /**
     * Sets the value of the catItemsCountFeatured property.
     * 
     */
    public void setCatItemsCountFeatured(int value) {
        this.catItemsCountFeatured = value;
    }

    /**
     * Gets the value of the catItemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchresponsetype }
     *     
     */
    public ArrayOfSearchresponsetype getCatItemsArray() {
        return catItemsArray;
    }

    /**
     * Sets the value of the catItemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchresponsetype }
     *     
     */
    public void setCatItemsArray(ArrayOfSearchresponsetype value) {
        this.catItemsArray = value;
    }

}
