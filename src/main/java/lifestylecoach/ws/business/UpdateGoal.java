
package lifestylecoach.ws.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateGoal complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="updateGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goal" type="{http://webservice.localdb.lifecoach/}goal" minOccurs="0" form="qualified"/>
 *         &lt;element name="oldTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateGoal", propOrder = {
        "personId",
        "goal",
        "oldTitle"
})
public class UpdateGoal {

    protected int personId;
    @XmlElement(namespace = "http://webservice.business.lifecoach/")
    protected Goal goal;
    protected String oldTitle;

    /**
     * Recupera il valore della proprietà personId.
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     */
    public void setPersonId(int value) {
        this.personId = value;
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

    /**
     * Recupera il valore della proprietà oldTitle.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOldTitle() {
        return oldTitle;
    }

    /**
     * Imposta il valore della proprietà oldTitle.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOldTitle(String value) {
        this.oldTitle = value;
    }

}
