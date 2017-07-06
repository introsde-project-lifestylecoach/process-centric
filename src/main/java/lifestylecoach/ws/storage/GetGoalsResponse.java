
package lifestylecoach.ws.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java per getGoalsResponse complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="getGoalsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goalList" type="{http://webservice.localdb.lifecoach/}goal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalsResponse", propOrder = {
        "goalList"
})
public class GetGoalsResponse {

    protected List<Goal> goalList;

    /**
     * Gets the value of the goalList property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalList property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalList().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     */
    public List<Goal> getGoalList() {
        if (goalList == null) {
            goalList = new ArrayList<Goal>();
        }
        return this.goalList;
    }

}