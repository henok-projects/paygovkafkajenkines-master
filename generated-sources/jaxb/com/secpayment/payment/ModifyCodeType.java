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
 * <p>Java class for ModifyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Dropped"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModifyCodeType")
@XmlEnum
public enum ModifyCodeType {


    /**
     * Indicate filed is to be dropped.
     * 
     */
    @XmlEnumValue("Dropped")
    DROPPED("Dropped"),

    /**
     * Indicate filed is to be modified.
     * 
     */
    @XmlEnumValue("Modify")
    MODIFY("Modify"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ModifyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModifyCodeType fromValue(String v) {
        for (ModifyCodeType c: ModifyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
