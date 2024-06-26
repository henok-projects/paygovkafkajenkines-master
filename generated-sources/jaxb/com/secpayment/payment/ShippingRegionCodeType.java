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
 * <p>Java class for ShippingRegionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingRegionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Africa"/>
 *     &lt;enumeration value="Asia"/>
 *     &lt;enumeration value="Caribbean"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="LatinAmerica"/>
 *     &lt;enumeration value="MiddleEast"/>
 *     &lt;enumeration value="NorthAmerica"/>
 *     &lt;enumeration value="Oceania"/>
 *     &lt;enumeration value="SouthAmerica"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingRegionCodeType")
@XmlEnum
public enum ShippingRegionCodeType {


    /**
     * 
     *                         Africa
     *                     
     * 
     */
    @XmlEnumValue("Africa")
    AFRICA("Africa"),

    /**
     * 
     *                         Asia
     *                     
     * 
     */
    @XmlEnumValue("Asia")
    ASIA("Asia"),

    /**
     * 
     *                         Carribbean
     *                     
     * 
     */
    @XmlEnumValue("Caribbean")
    CARIBBEAN("Caribbean"),

    /**
     * 
     *                         Europe
     *                     
     * 
     */
    @XmlEnumValue("Europe")
    EUROPE("Europe"),

    /**
     * 
     *                         LatinAmerica
     *                     
     * 
     */
    @XmlEnumValue("LatinAmerica")
    LATIN_AMERICA("LatinAmerica"),

    /**
     * 
     *                         MiddleEast
     *                     
     * 
     */
    @XmlEnumValue("MiddleEast")
    MIDDLE_EAST("MiddleEast"),

    /**
     * 
     *                         NorthAmerica
     *                     
     * 
     */
    @XmlEnumValue("NorthAmerica")
    NORTH_AMERICA("NorthAmerica"),

    /**
     * 
     *                         Oceania (i.e., Pacific region other than Asia)
     *                     
     * 
     */
    @XmlEnumValue("Oceania")
    OCEANIA("Oceania"),

    /**
     * 
     *                         SouthAmerica
     *                     
     * 
     */
    @XmlEnumValue("SouthAmerica")
    SOUTH_AMERICA("SouthAmerica"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingRegionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingRegionCodeType fromValue(String v) {
        for (ShippingRegionCodeType c: ShippingRegionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
