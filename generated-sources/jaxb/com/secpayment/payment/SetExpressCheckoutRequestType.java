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
 * <p>Java class for SetExpressCheckoutRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetExpressCheckoutRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}SetExpressCheckoutRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetExpressCheckoutRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "setExpressCheckoutRequestDetails"
})
public class SetExpressCheckoutRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SetExpressCheckoutRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails;

    /**
     * Gets the value of the setExpressCheckoutRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SetExpressCheckoutRequestDetailsType }
     *     
     */
    public SetExpressCheckoutRequestDetailsType getSetExpressCheckoutRequestDetails() {
        return setExpressCheckoutRequestDetails;
    }

    /**
     * Sets the value of the setExpressCheckoutRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetExpressCheckoutRequestDetailsType }
     *     
     */
    public void setSetExpressCheckoutRequestDetails(SetExpressCheckoutRequestDetailsType value) {
        this.setExpressCheckoutRequestDetails = value;
    }

}
