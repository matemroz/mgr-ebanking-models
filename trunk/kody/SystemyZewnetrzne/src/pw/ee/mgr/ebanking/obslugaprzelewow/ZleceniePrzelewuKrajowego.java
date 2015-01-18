//
// Generated By:JAX-WS RI 2.2.4-b01 (JAXB RI IBM 2.2.4-2)
//


package pw.ee.mgr.ebanking.obslugaprzelewow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZleceniePrzelewuKrajowego complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZleceniePrzelewuKrajowego">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRachNadawcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrRachOdbiorcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tytul" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kwota" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZleceniePrzelewuKrajowego", namespace = "http://Main/ServicesSpecification/", propOrder = {
    "nrRachNadawcy",
    "nrRachOdbiorcy",
    "tytul",
    "opis",
    "kwota"
})
public class ZleceniePrzelewuKrajowego {

    @XmlElement(required = true)
    protected String nrRachNadawcy;
    @XmlElement(required = true)
    protected String nrRachOdbiorcy;
    @XmlElement(required = true)
    protected String tytul;
    @XmlElement(required = true)
    protected String opis;
    @XmlElement(required = true)
    protected String kwota;

    /**
     * Gets the value of the nrRachNadawcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRachNadawcy() {
        return nrRachNadawcy;
    }

    /**
     * Sets the value of the nrRachNadawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRachNadawcy(String value) {
        this.nrRachNadawcy = value;
    }

    /**
     * Gets the value of the nrRachOdbiorcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRachOdbiorcy() {
        return nrRachOdbiorcy;
    }

    /**
     * Sets the value of the nrRachOdbiorcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRachOdbiorcy(String value) {
        this.nrRachOdbiorcy = value;
    }

    /**
     * Gets the value of the tytul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTytul() {
        return tytul;
    }

    /**
     * Sets the value of the tytul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTytul(String value) {
        this.tytul = value;
    }

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
     * Gets the value of the kwota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKwota() {
        return kwota;
    }

    /**
     * Sets the value of the kwota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKwota(String value) {
        this.kwota = value;
    }

}
