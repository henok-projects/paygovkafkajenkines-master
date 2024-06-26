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
 * <p>Java class for GeneralPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Echeck"/>
 *     &lt;enumeration value="ACH"/>
 *     &lt;enumeration value="Creditcard"/>
 *     &lt;enumeration value="PayPalBalance"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneralPaymentMethodCodeType")
@XmlEnum
public enum GeneralPaymentMethodCodeType {


    /**
     * Custom Code
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Electronic check.
     * 
     */
    @XmlEnumValue("Echeck")
    ECHECK("Echeck"),

    /**
     *  ACH.
     * 
     */
    ACH("ACH"),

    /**
     * 
     *                         Credit-card.
     *                     
     * 
     */
    @XmlEnumValue("Creditcard")
    CREDITCARD("Creditcard"),

    /**
     * 
     *                         Pay balance.
     *                     
     * 
     */
    @XmlEnumValue("PayPalBalance")
    PAY_PAL_BALANCE("PayPalBalance"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GeneralPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralPaymentMethodCodeType fromValue(String v) {
        for (GeneralPaymentMethodCodeType c: GeneralPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
