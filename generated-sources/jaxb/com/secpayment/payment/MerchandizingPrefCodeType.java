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
 * <p>Java class for MerchandizingPrefCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchandizingPrefCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OptIn"/>
 *     &lt;enumeration value="OptOut"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MerchandizingPrefCodeType")
@XmlEnum
public enum MerchandizingPrefCodeType {


    /**
     * 
     *                         OptIn
     *                     
     * 
     */
    @XmlEnumValue("OptIn")
    OPT_IN("OptIn"),

    /**
     * 
     *                         OptOut
     *                     
     * 
     */
    @XmlEnumValue("OptOut")
    OPT_OUT("OptOut"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MerchandizingPrefCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchandizingPrefCodeType fromValue(String v) {
        for (MerchandizingPrefCodeType c: MerchandizingPrefCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
