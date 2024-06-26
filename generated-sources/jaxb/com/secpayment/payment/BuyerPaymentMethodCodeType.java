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
 * <p>Java class for BuyerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MOCC"/>
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="PaymentSeeDescription"/>
 *     &lt;enumeration value="CCAccepted"/>
 *     &lt;enumeration value="PersonalCheck"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="VisaMC"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="CashOnPickup"/>
 *     &lt;enumeration value="MoneyXferAccepted"/>
 *     &lt;enumeration value="MoneyXferAcceptedinCheckout"/>
 *     &lt;enumeration value="OtherOnlinePayments"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum BuyerPaymentMethodCodeType {


    /**
     * 
     *                         No payment method specified
     *                     
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     *                         Money order/cashiers check
     *                     
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     *                         American Express
     *                     
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     *                         Payment See Description
     *                     
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     *                         American Express
     *                     
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     *                         Personal check
     *                     
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     *                         COD
     *                     
     * 
     */
    COD("COD"),

    /**
     * 
     *                         Visa/Mastercard
     *                     
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     *                         Other forms of payment.
     *                         Some custom method is accepted by seller
     *                         as payment method in the transaction. For
     *                         Motors vehicle items, this field refers to the
     *                         Deposit payment method.
     *                     
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     *                         PayPal
     *                     
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     *                         Discover
     *                     
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     *                         Payment on delivery acceptable payment term.
     *                     
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     *                         Direct transfer of money acceptable payment term.
     *                     
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     *                         If the seller has bank account information on file,
     *                         and MoneyXferAcceptedinCheckout = true, then
     *                         the bank account information will be displayed in
     *                         Checkout. Applicable to German site only.
     *                     
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedinCheckout")
    MONEY_XFER_ACCEPTEDIN_CHECKOUT("MoneyXferAcceptedinCheckout"),

    /**
     * 
     *                         Online Escrow paid for by seller.
     *                     
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),

    /**
     * 
     *                         Reserved for internal or future use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentMethodCodeType fromValue(String v) {
        for (BuyerPaymentMethodCodeType c: BuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
