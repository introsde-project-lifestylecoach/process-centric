
package lifestylecoach.ws.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readMeasureType complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="readMeasureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readMeasureType", propOrder = {
        "goalId"
})
public class ReadMeasureType {

    protected int goalId;

    /**
     * Recupera il valore della proprietà goalId.
     */
    public int getGoalId() {
        return goalId;
    }

    /**
     * Imposta il valore della proprietà goalId.
     */
    public void setGoalId(int value) {
        this.goalId = value;
    }

}