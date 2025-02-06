
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
 *         &lt;element name="LanguageISOCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "languageISOCodeResult"
})
@XmlRootElement(name = "LanguageISOCodeResponse")
public class LanguageISOCodeResponse {

    @XmlElement(name = "LanguageISOCodeResult", required = true)
    protected String languageISOCodeResult;

    /**
     * Recupera il valore della proprietà languageISOCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageISOCodeResult() {
        return languageISOCodeResult;
    }

    /**
     * Imposta il valore della proprietà languageISOCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageISOCodeResult(String value) {
        this.languageISOCodeResult = value;
    }

}
