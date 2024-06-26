//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.02 at 06:25:02 PM EAT 
//


package com.secpayment.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncentiveBucketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveBucketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{urn:ebay:apis:eBLBaseComponents}IncentiveItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BucketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalSellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BucketSubtotalAmt" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="BucketShippingAmt" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="BucketInsuranceAmt" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="BucketSalesTaxAmt" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="BucketTotalAmt" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveBucketType", propOrder = {
    "items",
    "bucketId",
    "sellerId",
    "externalSellerId",
    "bucketSubtotalAmt",
    "bucketShippingAmt",
    "bucketInsuranceAmt",
    "bucketSalesTaxAmt",
    "bucketTotalAmt"
})
public class IncentiveBucketType {

    @XmlElement(name = "Items")
    protected List<IncentiveItemType> items;
    @XmlElement(name = "BucketId")
    protected String bucketId;
    @XmlElement(name = "SellerId")
    protected String sellerId;
    @XmlElement(name = "ExternalSellerId")
    protected String externalSellerId;
    @XmlElement(name = "BucketSubtotalAmt")
    protected BasicAmountType bucketSubtotalAmt;
    @XmlElement(name = "BucketShippingAmt")
    protected BasicAmountType bucketShippingAmt;
    @XmlElement(name = "BucketInsuranceAmt")
    protected BasicAmountType bucketInsuranceAmt;
    @XmlElement(name = "BucketSalesTaxAmt")
    protected BasicAmountType bucketSalesTaxAmt;
    @XmlElement(name = "BucketTotalAmt")
    protected BasicAmountType bucketTotalAmt;

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveItemType }
     * 
     * 
     */
    public List<IncentiveItemType> getItems() {
        if (items == null) {
            items = new ArrayList<IncentiveItemType>();
        }
        return this.items;
    }

    /**
     * Gets the value of the bucketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketId() {
        return bucketId;
    }

    /**
     * Sets the value of the bucketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketId(String value) {
        this.bucketId = value;
    }

    /**
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the externalSellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSellerId() {
        return externalSellerId;
    }

    /**
     * Sets the value of the externalSellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSellerId(String value) {
        this.externalSellerId = value;
    }

    /**
     * Gets the value of the bucketSubtotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getBucketSubtotalAmt() {
        return bucketSubtotalAmt;
    }

    /**
     * Sets the value of the bucketSubtotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setBucketSubtotalAmt(BasicAmountType value) {
        this.bucketSubtotalAmt = value;
    }

    /**
     * Gets the value of the bucketShippingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getBucketShippingAmt() {
        return bucketShippingAmt;
    }

    /**
     * Sets the value of the bucketShippingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setBucketShippingAmt(BasicAmountType value) {
        this.bucketShippingAmt = value;
    }

    /**
     * Gets the value of the bucketInsuranceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getBucketInsuranceAmt() {
        return bucketInsuranceAmt;
    }

    /**
     * Sets the value of the bucketInsuranceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setBucketInsuranceAmt(BasicAmountType value) {
        this.bucketInsuranceAmt = value;
    }

    /**
     * Gets the value of the bucketSalesTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getBucketSalesTaxAmt() {
        return bucketSalesTaxAmt;
    }

    /**
     * Sets the value of the bucketSalesTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setBucketSalesTaxAmt(BasicAmountType value) {
        this.bucketSalesTaxAmt = value;
    }

    /**
     * Gets the value of the bucketTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getBucketTotalAmt() {
        return bucketTotalAmt;
    }

    /**
     * Sets the value of the bucketTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setBucketTotalAmt(BasicAmountType value) {
        this.bucketTotalAmt = value;
    }

}
