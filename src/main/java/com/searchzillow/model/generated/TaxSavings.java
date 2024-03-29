//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.22 at 10:18:23 AM EDT 
//


package com.searchzillow.model.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxSavings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSavings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthlyPrincipalAndInterest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="taxSavings" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amortizationSchedule" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}TaxSavingsAmortizationSchedule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSavings", propOrder = {
    "monthlyPrincipalAndInterest",
    "taxSavings",
    "result",
    "amortizationSchedule"
})
public class TaxSavings {

    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterest;
    @XmlElement(required = true)
    protected BigInteger taxSavings;
    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected List<TaxSavingsAmortizationSchedule> amortizationSchedule;

    /**
     * Gets the value of the monthlyPrincipalAndInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterest(BigInteger value) {
        this.monthlyPrincipalAndInterest = value;
    }

    /**
     * Gets the value of the taxSavings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxSavings() {
        return taxSavings;
    }

    /**
     * Sets the value of the taxSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxSavings(BigInteger value) {
        this.taxSavings = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the amortizationSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amortizationSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmortizationSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSavingsAmortizationSchedule }
     * 
     * 
     */
    public List<TaxSavingsAmortizationSchedule> getAmortizationSchedule() {
        if (amortizationSchedule == null) {
            amortizationSchedule = new ArrayList<TaxSavingsAmortizationSchedule>();
        }
        return this.amortizationSchedule;
    }

}
