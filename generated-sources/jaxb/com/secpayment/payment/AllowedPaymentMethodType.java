//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.02 at 06:25:02 PM EAT 
//


package com.secpayment.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowedPaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllowedPaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="InstantPaymentOnly"/>
 *     &lt;enumeration value="AnyFundingSource"/>
 *     &lt;enumeration value="InstantFundingSource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllowedPaymentMethodType")
@XmlEnum
public enum AllowedPaymentMethodType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("InstantPaymentOnly")
    INSTANT_PAYMENT_ONLY("InstantPaymentOnly"),
    @XmlEnumValue("AnyFundingSource")
    ANY_FUNDING_SOURCE("AnyFundingSource"),
    @XmlEnumValue("InstantFundingSource")
    INSTANT_FUNDING_SOURCE("InstantFundingSource");
    private final String value;

    AllowedPaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllowedPaymentMethodType fromValue(String v) {
        for (AllowedPaymentMethodType c: AllowedPaymentMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
