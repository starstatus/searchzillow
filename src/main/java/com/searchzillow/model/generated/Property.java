//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.22 at 10:18:23 AM EDT 
//


package com.searchzillow.model.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zpid" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="links" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Links"/>
 *         &lt;element name="address" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Address"/>
 *         &lt;element name="FIPScounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAssessmentYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAssessment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearBuilt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lotSizeSqFt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finishedSqFt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSoldDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSoldPrice" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "zpid",
    "links",
    "address",
    "fipScounty",
    "useCode",
    "taxAssessmentYear",
    "taxAssessment",
    "yearBuilt",
    "lotSizeSqFt",
    "finishedSqFt",
    "bathrooms",
    "bedrooms",
    "totalRooms",
    "lastSoldDate",
    "lastSoldPrice"
})
@XmlSeeAlso({
    SimpleProperty.class
})
public class Property {

    @XmlSchemaType(name = "unsignedInt")
    protected long zpid;
    @XmlElement(required = true)
    protected Links links;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(name = "FIPScounty")
    protected String fipScounty;
    protected String useCode;
    protected String taxAssessmentYear;
    protected String taxAssessment;
    protected String yearBuilt;
    protected String lotSizeSqFt;
    protected String finishedSqFt;
    protected String bathrooms;
    protected String bedrooms;
    protected String totalRooms;
    protected String lastSoldDate;
    protected Amount lastSoldPrice;

    /**
     * Gets the value of the zpid property.
     * 
     */
    public long getZpid() {
        return zpid;
    }

    /**
     * Sets the value of the zpid property.
     * 
     */
    public void setZpid(long value) {
        this.zpid = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the fipScounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPScounty() {
        return fipScounty;
    }

    /**
     * Sets the value of the fipScounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIPScounty(String value) {
        this.fipScounty = value;
    }

    /**
     * Gets the value of the useCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCode() {
        return useCode;
    }

    /**
     * Sets the value of the useCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCode(String value) {
        this.useCode = value;
    }

    /**
     * Gets the value of the taxAssessmentYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAssessmentYear() {
        return taxAssessmentYear;
    }

    /**
     * Sets the value of the taxAssessmentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAssessmentYear(String value) {
        this.taxAssessmentYear = value;
    }

    /**
     * Gets the value of the taxAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAssessment() {
        return taxAssessment;
    }

    /**
     * Sets the value of the taxAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAssessment(String value) {
        this.taxAssessment = value;
    }

    /**
     * Gets the value of the yearBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Sets the value of the yearBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearBuilt(String value) {
        this.yearBuilt = value;
    }

    /**
     * Gets the value of the lotSizeSqFt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotSizeSqFt() {
        return lotSizeSqFt;
    }

    /**
     * Sets the value of the lotSizeSqFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotSizeSqFt(String value) {
        this.lotSizeSqFt = value;
    }

    /**
     * Gets the value of the finishedSqFt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishedSqFt() {
        return finishedSqFt;
    }

    /**
     * Sets the value of the finishedSqFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishedSqFt(String value) {
        this.finishedSqFt = value;
    }

    /**
     * Gets the value of the bathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the value of the bathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBathrooms(String value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the bedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the value of the bedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedrooms(String value) {
        this.bedrooms = value;
    }

    /**
     * Gets the value of the totalRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRooms() {
        return totalRooms;
    }

    /**
     * Sets the value of the totalRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRooms(String value) {
        this.totalRooms = value;
    }

    /**
     * Gets the value of the lastSoldDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSoldDate() {
        return lastSoldDate;
    }

    /**
     * Sets the value of the lastSoldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSoldDate(String value) {
        this.lastSoldDate = value;
    }

    /**
     * Gets the value of the lastSoldPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLastSoldPrice() {
        return lastSoldPrice;
    }

    /**
     * Sets the value of the lastSoldPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLastSoldPrice(Amount value) {
        this.lastSoldPrice = value;
    }

}