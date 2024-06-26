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
 * <p>Java class for MobilePaymentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilePaymentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P2P"/>
 *     &lt;enumeration value="HardGoods"/>
 *     &lt;enumeration value="Donation"/>
 *     &lt;enumeration value="TopUp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilePaymentCodeType")
@XmlEnum
public enum MobilePaymentCodeType {

    @XmlEnumValue("P2P")
    P_2_P("P2P"),
    @XmlEnumValue("HardGoods")
    HARD_GOODS("HardGoods"),
    @XmlEnumValue("Donation")
    DONATION("Donation"),
    @XmlEnumValue("TopUp")
    TOP_UP("TopUp");
    private final String value;

    MobilePaymentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilePaymentCodeType fromValue(String v) {
        for (MobilePaymentCodeType c: MobilePaymentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
