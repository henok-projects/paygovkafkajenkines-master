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
 * <p>Java class for DoDirectPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoDirectPaymentRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoDirectPaymentRequestDetails"/>
 *         &lt;element name="ReturnFMFDetails" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoDirectPaymentRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "doDirectPaymentRequestDetails",
    "returnFMFDetails"
})
public class DoDirectPaymentRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "DoDirectPaymentRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails;
    @XmlElement(name = "ReturnFMFDetails")
    protected Integer returnFMFDetails;

    /**
     * Gets the value of the doDirectPaymentRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoDirectPaymentRequestDetailsType }
     *     
     */
    public DoDirectPaymentRequestDetailsType getDoDirectPaymentRequestDetails() {
        return doDirectPaymentRequestDetails;
    }

    /**
     * Sets the value of the doDirectPaymentRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoDirectPaymentRequestDetailsType }
     *     
     */
    public void setDoDirectPaymentRequestDetails(DoDirectPaymentRequestDetailsType value) {
        this.doDirectPaymentRequestDetails = value;
    }

    /**
     * Gets the value of the returnFMFDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnFMFDetails() {
        return returnFMFDetails;
    }

    /**
     * Sets the value of the returnFMFDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnFMFDetails(Integer value) {
        this.returnFMFDetails = value;
    }

}
