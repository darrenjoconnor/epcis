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

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;


/**
 * <p>Java class for EPCISHeaderExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISHeaderExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EPCISMasterData" type="{urn:epcglobal:epcis:xsd:1}EPCISMasterDataType" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}EPCISHeaderExtension2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


@Namespace(reference="urn:epcglobal:epcis:xsd:1", prefix = "epcis")
@Root(strict=false)
@Order(elements={"epcisMasterData","extension", "ext"})
public class EPCISHeaderExtensionType {

    @Element(name = "EPCISMasterData")
    private EPCISMasterDataType epcisMasterData;

    @Element(required=false)
    private EPCISHeaderExtension2Type extension;

    @Element(name = "ext", required = false)
    @Namespace(reference="http://ns.enfoll.com/ext")
    private HeaderExt ext;

//    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the epcisMasterData property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISMasterDataType }
     *     
     */
    public EPCISMasterDataType getEPCISMasterData() {
        return epcisMasterData;
    }

    /**
     * Sets the value of the epcisMasterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISMasterDataType }
     *     
     */
    public void setEPCISMasterData(EPCISMasterDataType value) {
        this.epcisMasterData = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link EPCISHeaderExtension2Type }
     *     
     */
    public EPCISHeaderExtension2Type getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPCISHeaderExtension2Type }
     *     
     */
    public void setExtension(EPCISHeaderExtension2Type value) {
        this.extension = value;
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