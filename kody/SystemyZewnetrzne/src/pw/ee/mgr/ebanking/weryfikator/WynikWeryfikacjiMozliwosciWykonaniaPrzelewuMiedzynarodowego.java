//
// Generated By:JAX-WS RI 2.2.4-b01 (JAXB RI IBM 2.2.4-2)
//


package pw.ee.mgr.ebanking.weryfikator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="czyMozliwyPrzelewMiedzynarodowy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego", namespace = "http://Main/ServicesSpecification/", propOrder = {
    "opis",
    "czyMozliwyPrzelewMiedzynarodowy"
})
public class WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego {

    @XmlElement(required = true)
    protected String opis;
    @XmlElement(required = true)
    protected String czyMozliwyPrzelewMiedzynarodowy;

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the czyMozliwyPrzelewMiedzynarodowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCzyMozliwyPrzelewMiedzynarodowy() {
        return czyMozliwyPrzelewMiedzynarodowy;
    }

    /**
     * Sets the value of the czyMozliwyPrzelewMiedzynarodowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCzyMozliwyPrzelewMiedzynarodowy(String value) {
        this.czyMozliwyPrzelewMiedzynarodowy = value;
    }

}
