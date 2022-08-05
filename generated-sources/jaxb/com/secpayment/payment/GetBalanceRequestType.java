//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.02 at 06:25:02 PM EAT 
//


package com.secpayment.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBalanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ReturnAllCurrencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "returnAllCurrencies"
})
public class GetBalanceRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ReturnAllCurrencies")
    protected String returnAllCurrencies;

    /**
     * Gets the value of the returnAllCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAllCurrencies() {
        return returnAllCurrencies;
    }

    /**
     * Sets the value of the returnAllCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAllCurrencies(String value) {
        this.returnAllCurrencies = value;
    }

}
