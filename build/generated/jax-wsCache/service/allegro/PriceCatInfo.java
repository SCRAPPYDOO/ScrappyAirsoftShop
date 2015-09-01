
package allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceCatInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceCatInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="priceMin" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="priceMax" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceCatInfo", propOrder = {

})
public class PriceCatInfo {

    protected float priceMin;
    protected float priceMax;

    /**
     * Gets the value of the priceMin property.
     * 
     */
    public float getPriceMin() {
        return priceMin;
    }

    /**
     * Sets the value of the priceMin property.
     * 
     */
    public void setPriceMin(float value) {
        this.priceMin = value;
    }

    /**
     * Gets the value of the priceMax property.
     * 
     */
    public float getPriceMax() {
        return priceMax;
    }

    /**
     * Sets the value of the priceMax property.
     * 
     */
    public void setPriceMax(float value) {
        this.priceMax = value;
    }

}
