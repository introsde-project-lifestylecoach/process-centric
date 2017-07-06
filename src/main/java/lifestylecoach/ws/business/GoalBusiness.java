
package lifestylecoach.ws.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per goalBusiness complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="goalBusiness">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="done" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="goal" type="{http://webservice.localdb.lifecoach/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goalBusiness", propOrder = {
        "done",
        "goal"
})
public class GoalBusiness {

    protected boolean done;
    protected Goal goal;

    /**
     * Recupera il valore della proprietà done.
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Imposta il valore della proprietà done.
     */
    public void setDone(boolean value) {
        this.done = value;
    }

    /**
     * Recupera il valore della proprietà goal.
     *
     * @return possible object is
     * {@link Goal }
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * Imposta il valore della proprietà goal.
     *
     * @param value allowed object is
     *              {@link Goal }
     */
    public void setGoal(Goal value) {
        this.goal = value;
    }

}
