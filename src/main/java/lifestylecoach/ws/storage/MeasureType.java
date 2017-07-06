
package lifestylecoach.ws.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per measureType complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="measureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measureType", namespace = "http://webservice.localdb.lifecoach/", propOrder = {
        "idMeasureType",
        "type"
})
public class MeasureType {

    protected int idMeasureType;
    protected String type;

    /**
     * Recupera il valore della proprietà idMeasureType.
     */
    public int getIdMeasureType() {
        return idMeasureType;
    }

    /**
     * Imposta il valore della proprietà idMeasureType.
     */
    public void setIdMeasureType(int value) {
        this.idMeasureType = value;
    }

    /**
     * Recupera il valore della proprietà type.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
