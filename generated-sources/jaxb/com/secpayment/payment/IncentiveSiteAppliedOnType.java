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
 * <p>Java class for IncentiveSiteAppliedOnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncentiveSiteAppliedOnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="INCENTIVE-SITE-APPLIED-ON-UNKNOWN"/>
 *     &lt;enumeration value="INCENTIVE-SITE-APPLIED-ON-MERCHANT"/>
 *     &lt;enumeration value="INCENTIVE-SITE-APPLIED-ON-PAYPAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncentiveSiteAppliedOnType")
@XmlEnum
public enum IncentiveSiteAppliedOnType {

    @XmlEnumValue("INCENTIVE-SITE-APPLIED-ON-UNKNOWN")
    INCENTIVE_SITE_APPLIED_ON_UNKNOWN("INCENTIVE-SITE-APPLIED-ON-UNKNOWN"),
    @XmlEnumValue("INCENTIVE-SITE-APPLIED-ON-MERCHANT")
    INCENTIVE_SITE_APPLIED_ON_MERCHANT("INCENTIVE-SITE-APPLIED-ON-MERCHANT"),
    @XmlEnumValue("INCENTIVE-SITE-APPLIED-ON-PAYPAL")
    INCENTIVE_SITE_APPLIED_ON_PAYPAL("INCENTIVE-SITE-APPLIED-ON-PAYPAL");
    private final String value;

    IncentiveSiteAppliedOnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncentiveSiteAppliedOnType fromValue(String v) {
        for (IncentiveSiteAppliedOnType c: IncentiveSiteAppliedOnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
