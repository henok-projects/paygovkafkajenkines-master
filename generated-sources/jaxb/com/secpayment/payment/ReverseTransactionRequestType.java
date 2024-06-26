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
 * <p>Java class for ReverseTransactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReverseTransactionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ReverseTransactionRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverseTransactionRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "reverseTransactionRequestDetails"
})
public class ReverseTransactionRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ReverseTransactionRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ReverseTransactionRequestDetailsType reverseTransactionRequestDetails;

    /**
     * Gets the value of the reverseTransactionRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseTransactionRequestDetailsType }
     *     
     */
    public ReverseTransactionRequestDetailsType getReverseTransactionRequestDetails() {
        return reverseTransactionRequestDetails;
    }

    /**
     * Sets the value of the reverseTransactionRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseTransactionRequestDetailsType }
     *     
     */
    public void setReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType value) {
        this.reverseTransactionRequestDetails = value;
    }

}
