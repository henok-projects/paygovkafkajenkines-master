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
 * <p>Java class for AckCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="SuccessWithWarning"/>
 *     &lt;enumeration value="FailureWithWarning"/>
 *     &lt;enumeration value="PartialSuccess"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AckCodeType")
@XmlEnum
public enum AckCodeType {


    /**
     * 
     *                         Request processing succeeded.
     *                     
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     *                         Request processing failed.
     *                     
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     *                         Request processing completed with warning information
     *                         being included in the response message.
     *                     
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     *                         Request processing completed successful with some
     *                         with some warning information that could be useful for
     *                         the requesting application to process and/or record.
     *                     
     * 
     */
    @XmlEnumValue("SuccessWithWarning")
    SUCCESS_WITH_WARNING("SuccessWithWarning"),

    /**
     * 
     *                         Request processing failed with some error and warnining
     *                         information that requesting application should process to
     *                         determine cause(s) of failure.
     *                     
     * 
     */
    @XmlEnumValue("FailureWithWarning")
    FAILURE_WITH_WARNING("FailureWithWarning"),

    /**
     * 
     *                         Request processing completed with Partial Success.
     *                     
     * 
     */
    @XmlEnumValue("PartialSuccess")
    PARTIAL_SUCCESS("PartialSuccess"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AckCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckCodeType fromValue(String v) {
        for (AckCodeType c: AckCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
