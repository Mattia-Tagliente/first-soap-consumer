
package com.example.soapConsumerTest.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryNameResult"
})
@XmlRootElement(name = "CountryNameResponse")
public class CountryNameResponse {

    @XmlElement(name = "CountryNameResult", required = true)
    protected String countryNameResult;

    /**
     * Recupera il valore della proprietà countryNameResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameResult() {
        return countryNameResult;
    }

    /**
     * Imposta il valore della proprietà countryNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameResult(String value) {
        this.countryNameResult = value;
    }

}
