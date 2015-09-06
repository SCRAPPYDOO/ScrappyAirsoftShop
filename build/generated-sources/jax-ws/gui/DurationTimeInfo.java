
package gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationTimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurationTimeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="durationOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurationTimeInfo", propOrder = {

})
public class DurationTimeInfo {

    protected int durationOption;
    protected int durationValue;

    /**
     * Gets the value of the durationOption property.
     * 
     */
    public int getDurationOption() {
        return durationOption;
    }

    /**
     * Sets the value of the durationOption property.
     * 
     */
    public void setDurationOption(int value) {
        this.durationOption = value;
    }

    /**
     * Gets the value of the durationValue property.
     * 
     */
    public int getDurationValue() {
        return durationValue;
    }

    /**
     * Sets the value of the durationValue property.
     * 
     */
    public void setDurationValue(int value) {
        this.durationValue = value;
    }

}
