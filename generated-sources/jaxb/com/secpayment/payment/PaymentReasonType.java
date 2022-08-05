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
 * <p>Java class for PaymentReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="ReturnShipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentReasonType")
@XmlEnum
public enum PaymentReasonType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * 
     *                         Identifies a BA flow for return shipment
     *                     
     * 
     */
    @XmlEnumValue("ReturnShipment")
    RETURN_SHIPMENT("ReturnShipment");
    private final String value;

    PaymentReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentReasonType fromValue(String v) {
        for (PaymentReasonType c: PaymentReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
