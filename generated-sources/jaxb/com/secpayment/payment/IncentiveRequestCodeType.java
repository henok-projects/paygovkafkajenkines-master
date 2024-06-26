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
 * <p>Java class for IncentiveRequestCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncentiveRequestCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="InCheckout"/>
 *     &lt;enumeration value="PreCheckout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncentiveRequestCodeType")
@XmlEnum
public enum IncentiveRequestCodeType {

    @XmlEnumValue("InCheckout")
    IN_CHECKOUT("InCheckout"),
    @XmlEnumValue("PreCheckout")
    PRE_CHECKOUT("PreCheckout");
    private final String value;

    IncentiveRequestCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncentiveRequestCodeType fromValue(String v) {
        for (IncentiveRequestCodeType c: IncentiveRequestCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
