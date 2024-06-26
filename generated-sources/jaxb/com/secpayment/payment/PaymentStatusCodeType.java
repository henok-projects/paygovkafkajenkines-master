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
 * <p>Java class for PaymentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Reversed"/>
 *     &lt;enumeration value="Canceled-Reversal"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Partially-Refunded"/>
 *     &lt;enumeration value="Voided"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="In-Progress"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Completed-Funds-Held"/>
 *     &lt;enumeration value="Instant"/>
 *     &lt;enumeration value="Delayed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusCodeType")
@XmlEnum
public enum PaymentStatusCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Reversed")
    REVERSED("Reversed"),
    @XmlEnumValue("Canceled-Reversal")
    CANCELED_REVERSAL("Canceled-Reversal"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Partially-Refunded")
    PARTIALLY_REFUNDED("Partially-Refunded"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("In-Progress")
    IN_PROGRESS("In-Progress"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Completed-Funds-Held")
    COMPLETED_FUNDS_HELD("Completed-Funds-Held"),
    @XmlEnumValue("Instant")
    INSTANT("Instant"),
    @XmlEnumValue("Delayed")
    DELAYED("Delayed");
    private final String value;

    PaymentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusCodeType fromValue(String v) {
        for (PaymentStatusCodeType c: PaymentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
