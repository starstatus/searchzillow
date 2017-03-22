//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.22 at 10:18:23 AM EDT 
//


package com.searchzillow.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalRealEstate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalRealEstate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="region" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zindexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zindexOneYearChange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="links">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="forSaleByOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="forSale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalRealEstate", propOrder = {
    "region"
})
public class LocalRealEstate {

    @XmlElement(required = true)
    protected List<LocalRealEstate.Region> region;

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalRealEstate.Region }
     * 
     * 
     */
    public List<LocalRealEstate.Region> getRegion() {
        if (region == null) {
            region = new ArrayList<LocalRealEstate.Region>();
        }
        return this.region;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="zindexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="zindexOneYearChange" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="links">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="forSaleByOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="forSale" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zindexValue",
        "zindexOneYearChange",
        "links"
    })
    public static class Region {

        @XmlElement(required = true)
        protected String zindexValue;
        @XmlElement(required = true)
        protected String zindexOneYearChange;
        @XmlElement(required = true)
        protected LocalRealEstate.Region.Links links;
        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "id", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long id;

        /**
         * Gets the value of the zindexValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZindexValue() {
            return zindexValue;
        }

        /**
         * Sets the value of the zindexValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZindexValue(String value) {
            this.zindexValue = value;
        }

        /**
         * Gets the value of the zindexOneYearChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZindexOneYearChange() {
            return zindexOneYearChange;
        }

        /**
         * Sets the value of the zindexOneYearChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZindexOneYearChange(String value) {
            this.zindexOneYearChange = value;
        }

        /**
         * Gets the value of the links property.
         * 
         * @return
         *     possible object is
         *     {@link LocalRealEstate.Region.Links }
         *     
         */
        public LocalRealEstate.Region.Links getLinks() {
            return links;
        }

        /**
         * Sets the value of the links property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocalRealEstate.Region.Links }
         *     
         */
        public void setLinks(LocalRealEstate.Region.Links value) {
            this.links = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the id property.
         * 
         */
        public long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(long value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="forSaleByOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="forSale" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "overview",
            "forSaleByOwner",
            "forSale"
        })
        public static class Links {

            @XmlElement(required = true)
            protected String overview;
            @XmlElement(required = true)
            protected String forSaleByOwner;
            @XmlElement(required = true)
            protected String forSale;

            /**
             * Gets the value of the overview property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverview() {
                return overview;
            }

            /**
             * Sets the value of the overview property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverview(String value) {
                this.overview = value;
            }

            /**
             * Gets the value of the forSaleByOwner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForSaleByOwner() {
                return forSaleByOwner;
            }

            /**
             * Sets the value of the forSaleByOwner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForSaleByOwner(String value) {
                this.forSaleByOwner = value;
            }

            /**
             * Gets the value of the forSale property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForSale() {
                return forSale;
            }

            /**
             * Sets the value of the forSale property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForSale(String value) {
                this.forSale = value;
            }

        }

    }

}