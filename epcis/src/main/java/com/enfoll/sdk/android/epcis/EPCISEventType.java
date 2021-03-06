/*
 * Copyright (C) 2018. Enfoll Pty Ltd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.26 at 03:58:23 PM AEDT 
//


package com.enfoll.sdk.android.epcis;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;


/**
 * 
 *       base type for all EPCIS events.
 *       
 * 
 * <p>Java class for EPCISEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="recordTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseExtension" type="{urn:epcglobal:epcis:xsd:1}EPCISEventExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@Root(strict=false)
@Order(elements = {"eventTime", "recordTime", "eventTimeZoneOffset", "baseExtension"})
@Namespace(reference="urn:epcglobal:epcis:xsd:1", prefix = "epcis")
abstract class EPCISEventType {

    @Element
//    @XmlSchemaType(name = "dateTime")
    private Date eventTime;

//    @XmlSchemaType(name = "dateTime")
    @Element(required=false)
    private Date recordTime;

    @Element
    private String eventTimeZoneOffset;

    @Element(required = false)
    private EPCISEventExtensionType baseExtension;

//    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEventTime(Date value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the recordTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * Sets the value of the recordTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRecordTime(Date value) {
        this.recordTime = value;
    }

    /**
     * Gets the value of the eventTimeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTimeZoneOffset() {
        return eventTimeZoneOffset;
    }

    /**
     * Sets the value of the eventTimeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTimeZoneOffset(String value) {
        this.eventTimeZoneOffset = value;
    }

    /**
     * Gets the value of the baseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISEventExtensionType }
     *     
     */
    public EPCISEventExtensionType getBaseExtension() {
        return baseExtension;
    }

    /**
     * Sets the value of the baseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISEventExtensionType }
     *     
     */
    public void setBaseExtension(EPCISEventExtensionType value) {
        this.baseExtension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
