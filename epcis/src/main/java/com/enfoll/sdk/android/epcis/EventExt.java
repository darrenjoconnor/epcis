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
// Generated on: 2018.02.12 at 10:08:27 PM AEDT 
//


package com.enfoll.sdk.android.epcis;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;


/**
 * <p>Java class for EventExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="acceptedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pod" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://ns.enfoll.com/ext}Reason" minOccurs="0"/>
 *         &lt;element name="rejectedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Root(strict=false)
@Order(elements = {"acceptedBy", "pod", "rejectedBy", "signedBy", "Reason"})
@Namespace(reference="http://ns.enfoll.com/ext")
public class EventExt {

    @Element(name="acceptedBy", required=false)
    protected String acceptedBy;

    @Element(name="pod", required=false)
    protected String pod;

    @Element(name="Reason", required=false)
    protected Reason reason;

    @Element(name="rejectedBy", required=false)
    protected String rejectedBy;

    @Element(name="signedBy", required=false)
    protected String signedBy;

    /**
     * Gets the value of the acceptedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedBy() {
        return acceptedBy;
    }

    /**
     * Sets the value of the acceptedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedBy(String value) {
        this.rejectedBy = null;
        this.signedBy = null;
        this.acceptedBy = value;
    }

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod(String value) {
        this.pod = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link Reason }
     *     
     */
    public Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason }
     *     
     */
    public void setReason(Reason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the rejectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectedBy() {
        return rejectedBy;
    }

    /**
     * Sets the value of the rejectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectedBy(String value) {

        this.signedBy  = null;
        this.acceptedBy = null;
        this.rejectedBy = value;
    }

    /**
     * Gets the value of the signedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedBy() {
        return signedBy;
    }

    /**
     * Sets the value of the signedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedBy(String value) {

        this.acceptedBy = null;
        this.rejectedBy = null;
        this.signedBy = value;
    }

}
