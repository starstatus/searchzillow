//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.22 at 10:18:23 AM EDT 
//


package com.searchzillow.model.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerseAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerseAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="st" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="et" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="la" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerseAddress", propOrder = {
    "st",
    "zc",
    "cy",
    "et",
    "la",
    "lo"
})
public class TerseAddress {

    @XmlElement(required = true)
    protected String st;
    @XmlElement(required = true)
    protected String zc;
    @XmlElement(required = true)
    protected String cy;
    @XmlElement(required = true)
    protected String et;
    @XmlElement(required = true)
    protected BigDecimal la;
    @XmlElement(required = true)
    protected BigDecimal lo;

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the zc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZc() {
        return zc;
    }

    /**
     * Sets the value of the zc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZc(String value) {
        this.zc = value;
    }

    /**
     * Gets the value of the cy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCy() {
        return cy;
    }

    /**
     * Sets the value of the cy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCy(String value) {
        this.cy = value;
    }

    /**
     * Gets the value of the et property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEt() {
        return et;
    }

    /**
     * Sets the value of the et property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEt(String value) {
        this.et = value;
    }

    /**
     * Gets the value of the la property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLa() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLa(BigDecimal value) {
        this.la = value;
    }

    /**
     * Gets the value of the lo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLo() {
        return lo;
    }

    /**
     * Sets the value of the lo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLo(BigDecimal value) {
        this.lo = value;
    }

}
