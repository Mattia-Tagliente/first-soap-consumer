
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
 *         &lt;element name="CurrencyNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "currencyNameResult"
})
@XmlRootElement(name = "CurrencyNameResponse")
public class CurrencyNameResponse {

    @XmlElement(name = "CurrencyNameResult", required = true)
    protected String currencyNameResult;

    /**
     * Recupera il valore della proprietà currencyNameResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyNameResult() {
        return currencyNameResult;
    }

    /**
     * Imposta il valore della proprietà currencyNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyNameResult(String value) {
        this.currencyNameResult = value;
    }

}
