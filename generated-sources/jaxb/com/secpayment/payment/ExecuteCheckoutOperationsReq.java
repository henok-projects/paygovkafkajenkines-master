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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}ExecuteCheckoutOperationsRequest"/>
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
    "executeCheckoutOperationsRequest"
})
@XmlRootElement(name = "ExecuteCheckoutOperationsReq", namespace = "urn:ebay:api:PayPalAPI")
public class ExecuteCheckoutOperationsReq {

    @XmlElement(name = "ExecuteCheckoutOperationsRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest;

    /**
     * Gets the value of the executeCheckoutOperationsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteCheckoutOperationsRequestType }
     *     
     */
    public ExecuteCheckoutOperationsRequestType getExecuteCheckoutOperationsRequest() {
        return executeCheckoutOperationsRequest;
    }

    /**
     * Sets the value of the executeCheckoutOperationsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteCheckoutOperationsRequestType }
     *     
     */
    public void setExecuteCheckoutOperationsRequest(ExecuteCheckoutOperationsRequestType value) {
        this.executeCheckoutOperationsRequest = value;
    }

}
