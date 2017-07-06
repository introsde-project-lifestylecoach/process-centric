
package lifestylecoach.ws.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readPersonResponse complex type.
 * <p>
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;complexType name="readPersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person" type="{http://webservice.localdb.lifecoach/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonResponse", propOrder = {
        "person"
})
public class ReadPersonResponse {

    protected Person person;

    /**
     * Recupera il valore della proprietà person.
     *
     * @return possible object is
     * {@link Person }
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Imposta il valore della proprietà person.
     *
     * @param value allowed object is
     *              {@link Person }
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
