
package lifestylecoach.ws.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateMeasure complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="updateMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measure" type="{http://webservice.localdb.lifecoach/}measure" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMeasure", propOrder = {
        "personId",
        "measure"
})
public class UpdateMeasure {

    protected int personId;
    @XmlElement(namespace = "http://webservice.business.lifecoach/")
    protected Measure measure;

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
     * Recupera il valore della proprietà measure.
     *
     * @return possible object is
     * {@link Measure }
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * Imposta il valore della proprietà measure.
     *
     * @param value allowed object is
     *              {@link Measure }
     */
    public void setMeasure(Measure value) {
        this.measure = value;
    }

}
