//
// Generated By:JAX-WS RI 2.2.4-b01 (JAXB RI IBM 2.2.4-2)
//


package pw.ee.mgr.ebanking.weryfikator;

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
 *         &lt;element name="wynikWeryfikacjiZleceniaPrzelewu" type="{http://Main/ServicesSpecification/}WynikWeryfikacjiZleceniaPrzelewu"/>
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
    "wynikWeryfikacjiZleceniaPrzelewu"
})
@XmlRootElement(name = "weryfikujZleceniePrzelewuMiedzynarodowegoResponse", namespace = "http://Main/ServicesIdentification/KontrolaPrzeplywowFinansowych/")
public class WeryfikujZleceniePrzelewuMiedzynarodowegoResponse {

    @XmlElement(required = true)
    protected WynikWeryfikacjiZleceniaPrzelewu wynikWeryfikacjiZleceniaPrzelewu;

    /**
     * Gets the value of the wynikWeryfikacjiZleceniaPrzelewu property.
     * 
     * @return
     *     possible object is
     *     {@link WynikWeryfikacjiZleceniaPrzelewu }
     *     
     */
    public WynikWeryfikacjiZleceniaPrzelewu getWynikWeryfikacjiZleceniaPrzelewu() {
        return wynikWeryfikacjiZleceniaPrzelewu;
    }

    /**
     * Sets the value of the wynikWeryfikacjiZleceniaPrzelewu property.
     * 
     * @param value
     *     allowed object is
     *     {@link WynikWeryfikacjiZleceniaPrzelewu }
     *     
     */
    public void setWynikWeryfikacjiZleceniaPrzelewu(WynikWeryfikacjiZleceniaPrzelewu value) {
        this.wynikWeryfikacjiZleceniaPrzelewu = value;
    }

}