//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.02 at 06:25:02 PM EAT 
//


package com.secpayment.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionTrackingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionTrackingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionSelect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionQtyDelta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionTrackingDetailsType", propOrder = {
    "optionNumber",
    "optionQty",
    "optionSelect",
    "optionQtyDelta",
    "optionAlert",
    "optionCost"
})
public class OptionTrackingDetailsType {

    @XmlElement(name = "OptionNumber")
    protected String optionNumber;
    @XmlElement(name = "OptionQty")
    protected String optionQty;
    @XmlElement(name = "OptionSelect")
    protected String optionSelect;
    @XmlElement(name = "OptionQtyDelta")
    protected String optionQtyDelta;
    @XmlElement(name = "OptionAlert")
    protected String optionAlert;
    @XmlElement(name = "OptionCost")
    protected String optionCost;

    /**
     * Gets the value of the optionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionNumber() {
        return optionNumber;
    }

    /**
     * Sets the value of the optionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionNumber(String value) {
        this.optionNumber = value;
    }

    /**
     * Gets the value of the optionQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionQty() {
        return optionQty;
    }

    /**
     * Sets the value of the optionQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionQty(String value) {
        this.optionQty = value;
    }

    /**
     * Gets the value of the optionSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionSelect() {
        return optionSelect;
    }

    /**
     * Sets the value of the optionSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionSelect(String value) {
        this.optionSelect = value;
    }

    /**
     * Gets the value of the optionQtyDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionQtyDelta() {
        return optionQtyDelta;
    }

    /**
     * Sets the value of the optionQtyDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionQtyDelta(String value) {
        this.optionQtyDelta = value;
    }

    /**
     * Gets the value of the optionAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionAlert() {
        return optionAlert;
    }

    /**
     * Sets the value of the optionAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionAlert(String value) {
        this.optionAlert = value;
    }

    /**
     * Gets the value of the optionCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCost() {
        return optionCost;
    }

    /**
     * Sets the value of the optionCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCost(String value) {
        this.optionCost = value;
    }

}
