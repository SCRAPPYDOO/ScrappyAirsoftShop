
package allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemReminderStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReminderStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="reminderType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reminderTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReminderStruct", propOrder = {

})
public class ItemReminderStruct {

    protected int reminderType;
    protected int reminderTime;

    /**
     * Gets the value of the reminderType property.
     * 
     */
    public int getReminderType() {
        return reminderType;
    }

    /**
     * Sets the value of the reminderType property.
     * 
     */
    public void setReminderType(int value) {
        this.reminderType = value;
    }

    /**
     * Gets the value of the reminderTime property.
     * 
     */
    public int getReminderTime() {
        return reminderTime;
    }

    /**
     * Sets the value of the reminderTime property.
     * 
     */
    public void setReminderTime(int value) {
        this.reminderTime = value;
    }

}
