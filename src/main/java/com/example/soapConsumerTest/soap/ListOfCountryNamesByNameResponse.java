
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
 *         &lt;element name="ListOfCountryNamesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/&gt;
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
    "listOfCountryNamesByNameResult"
})
@XmlRootElement(name = "ListOfCountryNamesByNameResponse")
public class ListOfCountryNamesByNameResponse {

    @XmlElement(name = "ListOfCountryNamesByNameResult", required = true)
    protected ArrayOftCountryCodeAndName listOfCountryNamesByNameResult;

    /**
     * Recupera il valore della proprietà listOfCountryNamesByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getListOfCountryNamesByNameResult() {
        return listOfCountryNamesByNameResult;
    }

    /**
     * Imposta il valore della proprietà listOfCountryNamesByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setListOfCountryNamesByNameResult(ArrayOftCountryCodeAndName value) {
        this.listOfCountryNamesByNameResult = value;
    }

}
