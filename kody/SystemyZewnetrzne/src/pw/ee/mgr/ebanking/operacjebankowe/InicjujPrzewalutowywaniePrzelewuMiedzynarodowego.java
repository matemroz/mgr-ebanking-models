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
 *         &lt;element name="zlecenie" type="{http://Main/ServicesSpecification/}ZleceniePrzelewuMiedzynarodowego"/>
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
    "zlecenie"
})
@XmlRootElement(name = "inicjujPrzewalutowywaniePrzelewuMiedzynarodowego", namespace = "http://Main/ServicesIdentification/ZarzadzanieOperacjamiBankowymi/")
public class InicjujPrzewalutowywaniePrzelewuMiedzynarodowego {

    @XmlElement(required = true)
    protected ZleceniePrzelewuMiedzynarodowego zlecenie;

    /**
     * Gets the value of the zlecenie property.
     * 
     * @return
     *     possible object is
     *     {@link ZleceniePrzelewuMiedzynarodowego }
     *     
     */
    public ZleceniePrzelewuMiedzynarodowego getZlecenie() {
        return zlecenie;
    }

    /**
     * Sets the value of the zlecenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZleceniePrzelewuMiedzynarodowego }
     *     
     */
    public void setZlecenie(ZleceniePrzelewuMiedzynarodowego value) {
        this.zlecenie = value;
    }

}
