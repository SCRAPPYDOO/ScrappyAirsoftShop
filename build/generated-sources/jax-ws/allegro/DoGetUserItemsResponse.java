
package allegro;

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
 *         &lt;element name="userItemList" type="{urn:SandboxWebApi}ArrayOfUseritemlist" minOccurs="0"/>
 *         &lt;element name="userItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "userItemList",
    "userItemCount"
})
@XmlRootElement(name = "doGetUserItemsResponse")
public class DoGetUserItemsResponse {

    protected ArrayOfUseritemlist userItemList;
    protected int userItemCount;

    /**
     * Gets the value of the userItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUseritemlist }
     *     
     */
    public ArrayOfUseritemlist getUserItemList() {
        return userItemList;
    }

    /**
     * Sets the value of the userItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUseritemlist }
     *     
     */
    public void setUserItemList(ArrayOfUseritemlist value) {
        this.userItemList = value;
    }

    /**
     * Gets the value of the userItemCount property.
     * 
     */
    public int getUserItemCount() {
        return userItemCount;
    }

    /**
     * Sets the value of the userItemCount property.
     * 
     */
    public void setUserItemCount(int value) {
        this.userItemCount = value;
    }

}
