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
 * <p>Java class for DisplayControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayControlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InContextPaymentButtonImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayControlDetailsType", propOrder = {
    "inContextPaymentButtonImage"
})
public class DisplayControlDetailsType {

    @XmlElement(name = "InContextPaymentButtonImage")
    protected String inContextPaymentButtonImage;

    /**
     * Gets the value of the inContextPaymentButtonImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContextPaymentButtonImage() {
        return inContextPaymentButtonImage;
    }

    /**
     * Sets the value of the inContextPaymentButtonImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContextPaymentButtonImage(String value) {
        this.inContextPaymentButtonImage = value;
    }

}
