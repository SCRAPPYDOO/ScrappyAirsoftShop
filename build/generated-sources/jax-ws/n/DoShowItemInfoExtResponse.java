
package n;

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
 *         &lt;element name="itemListInfoExt" type="{urn:SandboxWebApi}ItemInfoExt"/>
 *         &lt;element name="itemCatPath" type="{urn:SandboxWebApi}ArrayOfItemcatlist" minOccurs="0"/>
 *         &lt;element name="itemImgList" type="{urn:SandboxWebApi}ArrayOfItemimagelist" minOccurs="0"/>
 *         &lt;element name="itemAttribList" type="{urn:SandboxWebApi}ArrayOfAttribstruct" minOccurs="0"/>
 *         &lt;element name="itemPostageOptions" type="{urn:SandboxWebApi}ArrayOfPostagestruct" minOccurs="0"/>
 *         &lt;element name="itemPaymentOptions" type="{urn:SandboxWebApi}ItemPaymentOptions"/>
 *         &lt;element name="itemCompanyInfo" type="{urn:SandboxWebApi}CompanyInfoStruct"/>
 *         &lt;element name="itemProductInfo" type="{urn:SandboxWebApi}ProductStruct"/>
 *         &lt;element name="itemVariants" type="{urn:SandboxWebApi}ArrayOfItemvariantstruct" minOccurs="0"/>
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
    "itemListInfoExt",
    "itemCatPath",
    "itemImgList",
    "itemAttribList",
    "itemPostageOptions",
    "itemPaymentOptions",
    "itemCompanyInfo",
    "itemProductInfo",
    "itemVariants"
})
@XmlRootElement(name = "doShowItemInfoExtResponse")
public class DoShowItemInfoExtResponse {

    @XmlElement(required = true)
    protected ItemInfoExt itemListInfoExt;
    protected ArrayOfItemcatlist itemCatPath;
    protected ArrayOfItemimagelist itemImgList;
    protected ArrayOfAttribstruct itemAttribList;
    protected ArrayOfPostagestruct itemPostageOptions;
    @XmlElement(required = true)
    protected ItemPaymentOptions itemPaymentOptions;
    @XmlElement(required = true)
    protected CompanyInfoStruct itemCompanyInfo;
    @XmlElement(required = true)
    protected ProductStruct itemProductInfo;
    protected ArrayOfItemvariantstruct itemVariants;

    /**
     * Gets the value of the itemListInfoExt property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfoExt }
     *     
     */
    public ItemInfoExt getItemListInfoExt() {
        return itemListInfoExt;
    }

    /**
     * Sets the value of the itemListInfoExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfoExt }
     *     
     */
    public void setItemListInfoExt(ItemInfoExt value) {
        this.itemListInfoExt = value;
    }

    /**
     * Gets the value of the itemCatPath property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemcatlist }
     *     
     */
    public ArrayOfItemcatlist getItemCatPath() {
        return itemCatPath;
    }

    /**
     * Sets the value of the itemCatPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemcatlist }
     *     
     */
    public void setItemCatPath(ArrayOfItemcatlist value) {
        this.itemCatPath = value;
    }

    /**
     * Gets the value of the itemImgList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemimagelist }
     *     
     */
    public ArrayOfItemimagelist getItemImgList() {
        return itemImgList;
    }

    /**
     * Sets the value of the itemImgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemimagelist }
     *     
     */
    public void setItemImgList(ArrayOfItemimagelist value) {
        this.itemImgList = value;
    }

    /**
     * Gets the value of the itemAttribList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribstruct }
     *     
     */
    public ArrayOfAttribstruct getItemAttribList() {
        return itemAttribList;
    }

    /**
     * Sets the value of the itemAttribList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribstruct }
     *     
     */
    public void setItemAttribList(ArrayOfAttribstruct value) {
        this.itemAttribList = value;
    }

    /**
     * Gets the value of the itemPostageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostagestruct }
     *     
     */
    public ArrayOfPostagestruct getItemPostageOptions() {
        return itemPostageOptions;
    }

    /**
     * Sets the value of the itemPostageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostagestruct }
     *     
     */
    public void setItemPostageOptions(ArrayOfPostagestruct value) {
        this.itemPostageOptions = value;
    }

    /**
     * Gets the value of the itemPaymentOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPaymentOptions }
     *     
     */
    public ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }

    /**
     * Sets the value of the itemPaymentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPaymentOptions }
     *     
     */
    public void setItemPaymentOptions(ItemPaymentOptions value) {
        this.itemPaymentOptions = value;
    }

    /**
     * Gets the value of the itemCompanyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfoStruct }
     *     
     */
    public CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }

    /**
     * Sets the value of the itemCompanyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoStruct }
     *     
     */
    public void setItemCompanyInfo(CompanyInfoStruct value) {
        this.itemCompanyInfo = value;
    }

    /**
     * Gets the value of the itemProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStruct }
     *     
     */
    public ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }

    /**
     * Sets the value of the itemProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStruct }
     *     
     */
    public void setItemProductInfo(ProductStruct value) {
        this.itemProductInfo = value;
    }

    /**
     * Gets the value of the itemVariants property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemvariantstruct }
     *     
     */
    public ArrayOfItemvariantstruct getItemVariants() {
        return itemVariants;
    }

    /**
     * Sets the value of the itemVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemvariantstruct }
     *     
     */
    public void setItemVariants(ArrayOfItemvariantstruct value) {
        this.itemVariants = value;
    }

}
