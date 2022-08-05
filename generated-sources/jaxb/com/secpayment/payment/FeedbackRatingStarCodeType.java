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
 * <p>Java class for FeedbackRatingStarCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackRatingStarCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Turquoise"/>
 *     &lt;enumeration value="Purple"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="YellowShooting"/>
 *     &lt;enumeration value="TurquoiseShooting"/>
 *     &lt;enumeration value="PurpleShooting"/>
 *     &lt;enumeration value="RedShooting"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedbackRatingStarCodeType")
@XmlEnum
public enum FeedbackRatingStarCodeType {


    /**
     * 
     *                         No graphic displayed
     *                     
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     *                         Yellow Star
     *                     
     * 
     */
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),

    /**
     * 
     *                         Turquoise Star
     *                     
     * 
     */
    @XmlEnumValue("Turquoise")
    TURQUOISE("Turquoise"),

    /**
     * 
     *                         Purple Star
     *                     
     * 
     */
    @XmlEnumValue("Purple")
    PURPLE("Purple"),

    /**
     * 
     *                         Red Star
     *                     
     * 
     */
    @XmlEnumValue("Red")
    RED("Red"),

    /**
     * 
     *                         Green Star
     *                     
     * 
     */
    @XmlEnumValue("Green")
    GREEN("Green"),

    /**
     * 
     *                         Yellow Shooting Star
     *                     
     * 
     */
    @XmlEnumValue("YellowShooting")
    YELLOW_SHOOTING("YellowShooting"),

    /**
     * 
     *                         Turquoise Shooting Star
     *                     
     * 
     */
    @XmlEnumValue("TurquoiseShooting")
    TURQUOISE_SHOOTING("TurquoiseShooting"),

    /**
     * 
     *                         Purple Shooting Star
     *                     
     * 
     */
    @XmlEnumValue("PurpleShooting")
    PURPLE_SHOOTING("PurpleShooting"),

    /**
     * 
     *                         Red Shooting Star
     *                     
     * 
     */
    @XmlEnumValue("RedShooting")
    RED_SHOOTING("RedShooting"),

    /**
     * 
     *                         Blue Star
     *                     
     * 
     */
    @XmlEnumValue("Blue")
    BLUE("Blue"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackRatingStarCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackRatingStarCodeType fromValue(String v) {
        for (FeedbackRatingStarCodeType c: FeedbackRatingStarCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
