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
 * <p>Java class for CompleteRecoupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteRecoupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:EnhancedDataTypes}EnhancedCompleteRecoupResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteRecoupResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "enhancedCompleteRecoupResponseDetails"
})
public class CompleteRecoupResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "EnhancedCompleteRecoupResponseDetails", namespace = "urn:ebay:apis:EnhancedDataTypes", required = true)
    protected EnhancedCompleteRecoupResponseDetailsType enhancedCompleteRecoupResponseDetails;

    /**
     * Gets the value of the enhancedCompleteRecoupResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCompleteRecoupResponseDetailsType }
     *     
     */
    public EnhancedCompleteRecoupResponseDetailsType getEnhancedCompleteRecoupResponseDetails() {
        return enhancedCompleteRecoupResponseDetails;
    }

    /**
     * Sets the value of the enhancedCompleteRecoupResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCompleteRecoupResponseDetailsType }
     *     
     */
    public void setEnhancedCompleteRecoupResponseDetails(EnhancedCompleteRecoupResponseDetailsType value) {
        this.enhancedCompleteRecoupResponseDetails = value;
    }

}
