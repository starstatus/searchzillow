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
 * <p>Java class for InterstOnlyVsTraditional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterstOnlyVsTraditional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthlyPrincipalAndInterest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyPrincipalAndInterestInterestOnly" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="monthlyPrincipalAndInterestAdjusted" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalInterestPayments" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totalInterestPaymentsInterestOnly" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AmortizationSchedule" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}annualAmortizationSchedule" maxOccurs="unbounded"/>
 *         &lt;element name="InterestOnlyAmortizationSchedule" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}annualInterestOnlyAmortizationSchedule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterstOnlyVsTraditional", propOrder = {
    "monthlyPrincipalAndInterest",
    "monthlyPrincipalAndInterestInterestOnly",
    "monthlyPrincipalAndInterestAdjusted",
    "totalInterestPayments",
    "totalInterestPaymentsInterestOnly",
    "result",
    "amortizationSchedule",
    "interestOnlyAmortizationSchedule"
})
public class InterstOnlyVsTraditional {

    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterest;
    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterestInterestOnly;
    @XmlElement(required = true)
    protected BigInteger monthlyPrincipalAndInterestAdjusted;
    @XmlElement(required = true)
    protected BigInteger totalInterestPayments;
    @XmlElement(required = true)
    protected BigInteger totalInterestPaymentsInterestOnly;
    @XmlElement(required = true)
    protected String result;
    @XmlElement(name = "AmortizationSchedule", required = true)
    protected List<AnnualAmortizationSchedule> amortizationSchedule;
    @XmlElement(name = "InterestOnlyAmortizationSchedule", required = true)
    protected List<AnnualInterestOnlyAmortizationSchedule> interestOnlyAmortizationSchedule;

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
     * Gets the value of the monthlyPrincipalAndInterestInterestOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterestInterestOnly() {
        return monthlyPrincipalAndInterestInterestOnly;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterestInterestOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterestInterestOnly(BigInteger value) {
        this.monthlyPrincipalAndInterestInterestOnly = value;
    }

    /**
     * Gets the value of the monthlyPrincipalAndInterestAdjusted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyPrincipalAndInterestAdjusted() {
        return monthlyPrincipalAndInterestAdjusted;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterestAdjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyPrincipalAndInterestAdjusted(BigInteger value) {
        this.monthlyPrincipalAndInterestAdjusted = value;
    }

    /**
     * Gets the value of the totalInterestPayments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalInterestPayments() {
        return totalInterestPayments;
    }

    /**
     * Sets the value of the totalInterestPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalInterestPayments(BigInteger value) {
        this.totalInterestPayments = value;
    }

    /**
     * Gets the value of the totalInterestPaymentsInterestOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalInterestPaymentsInterestOnly() {
        return totalInterestPaymentsInterestOnly;
    }

    /**
     * Sets the value of the totalInterestPaymentsInterestOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalInterestPaymentsInterestOnly(BigInteger value) {
        this.totalInterestPaymentsInterestOnly = value;
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
     * {@link AnnualAmortizationSchedule }
     * 
     * 
     */
    public List<AnnualAmortizationSchedule> getAmortizationSchedule() {
        if (amortizationSchedule == null) {
            amortizationSchedule = new ArrayList<AnnualAmortizationSchedule>();
        }
        return this.amortizationSchedule;
    }

    /**
     * Gets the value of the interestOnlyAmortizationSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestOnlyAmortizationSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestOnlyAmortizationSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnualInterestOnlyAmortizationSchedule }
     * 
     * 
     */
    public List<AnnualInterestOnlyAmortizationSchedule> getInterestOnlyAmortizationSchedule() {
        if (interestOnlyAmortizationSchedule == null) {
            interestOnlyAmortizationSchedule = new ArrayList<AnnualInterestOnlyAmortizationSchedule>();
        }
        return this.interestOnlyAmortizationSchedule;
    }

}
