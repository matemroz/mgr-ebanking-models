//
// Generated By:JAX-WS RI 2.2.4-b01 (JAXB RI IBM 2.2.4-2)
//


package pw.ee.mgr.ebanking.operacjebankowe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kwota" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nrKonta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kwota",
    "nrKonta"
})
@XmlRootElement(name = "wyplacPieniadzeZKonta", namespace = "http://Main/ServicesIdentification/ZarzadzanieOperacjamiBankowymi/")
public class WyplacPieniadzeZKonta {

    protected double kwota;
    @XmlElement(required = true)
    protected String nrKonta;

    /**
     * Gets the value of the kwota property.
     * 
     */
    public double getKwota() {
        return kwota;
    }

    /**
     * Sets the value of the kwota property.
     * 
     */
    public void setKwota(double value) {
        this.kwota = value;
    }

    /**
     * Gets the value of the nrKonta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrKonta() {
        return nrKonta;
    }

    /**
     * Sets the value of the nrKonta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrKonta(String value) {
        this.nrKonta = value;
    }

}
