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

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enfoll.sdk.android.epcis package.
 * <p>An ObjectFactory allows you to
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
//@XmlRegistry
@Namespace(reference="urn:epcglobal:epcis:xsd:1")
@Root(strict=false)
class ObjectFactory {

    private final static QName _EPCISDocument_QNAME = new QName("urn:epcglobal:epcis:xsd:1", "EPCISDocument");
    private final static QName _CorrelationInformation_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "CorrelationInformation");
    private final static QName _BusinessService_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "BusinessService");
    private final static QName _ScopeInformation_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "ScopeInformation");
    private final static QName _StandardBusinessDocumentHeader_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "StandardBusinessDocumentHeader");
    private final static QName _StandardBusinessDocument_QNAME = new QName("http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", "StandardBusinessDocument");
    private final static QName _EventListTypeObjectEvent_QNAME = new QName("", "ObjectEvent");
    private final static QName _EventListTypeTransactionEvent_QNAME = new QName("", "TransactionEvent");
    private final static QName _EventListTypeExtension_QNAME = new QName("", "extension");
    private final static QName _EventListTypeQuantityEvent_QNAME = new QName("", "QuantityEvent");
    private final static QName _EventListTypeAggregationEvent_QNAME = new QName("", "AggregationEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enfoll.sdk.android.epcis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EPCISDocumentType }
     * 
     */
    public EPCISDocumentType createEPCISDocumentType() {
        return new EPCISDocumentType();
    }

    /**
     * Create an instance of {@link EPCListType }
     * 
     */
    public EPCListType createEPCListType() {
        return new EPCListType();
    }

    /**
     * Create an instance of {@link QuantityListType }
     * 
     */
    public QuantityListType createQuantityListType() {
        return new QuantityListType();
    }

    /**
     * Create an instance of {@link TransactionEventExtension2Type }
     * 
     */
    public TransactionEventExtension2Type createTransactionEventExtension2Type() {
        return new TransactionEventExtension2Type();
    }

    /**
     * Create an instance of {@link QuantityEventExtensionType }
     * 
     */
    public QuantityEventExtensionType createQuantityEventExtensionType() {
        return new QuantityEventExtensionType();
    }

    /**
     * Create an instance of {@link EPCISMasterDataExtensionType }
     * 
     */
    public EPCISMasterDataExtensionType createEPCISMasterDataExtensionType() {
        return new EPCISMasterDataExtensionType();
    }

    /**
     * Create an instance of {@link EPCISHeaderExtension2Type }
     * 
     */
    public EPCISHeaderExtension2Type createEPCISHeaderExtension2Type() {
        return new EPCISHeaderExtension2Type();
    }

    /**
     * Create an instance of {@link ReadPointExtensionType }
     * 
     */
    public ReadPointExtensionType createReadPointExtensionType() {
        return new ReadPointExtensionType();
    }

    /**
     * Create an instance of {@link ILMDType }
     * 
     */
    public ILMDType createILMDType() {
        return new ILMDType();
    }

    /**
     * Create an instance of {@link EPCISHeaderType }
     * 
     */
    public EPCISHeaderType createEPCISHeaderType() {
        return new EPCISHeaderType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link TransformationEventType }
     * 
     */
    public TransformationEventType createTransformationEventType() {
        return new TransformationEventType();
    }

    /**
     * Create an instance of {@link VocabularyElementType }
     * 
     */
    public VocabularyElementType createVocabularyElementType() {
        return new VocabularyElementType();
    }

    /**
     * Create an instance of {@link EPCISBodyType }
     * 
     */
    public EPCISBodyType createEPCISBodyType() {
        return new EPCISBodyType();
    }

    /**
     * Create an instance of {@link ErrorDeclarationType }
     * 
     */
    public ErrorDeclarationType createErrorDeclarationType() {
        return new ErrorDeclarationType();
    }

    /**
     * Create an instance of {@link EventListType }
     * 
     */
    public EventListType createEventListType() {
        return new EventListType();
    }

    /**
     * Create an instance of {@link IDListType }
     * 
     */
    public IDListType createIDListType() {
        return new IDListType();
    }

    /**
     * Create an instance of {@link ObjectEventExtension2Type }
     * 
     */
    public ObjectEventExtension2Type createObjectEventExtension2Type() {
        return new ObjectEventExtension2Type();
    }

    /**
     * Create an instance of {@link BusinessTransactionListType }
     * 
     */
    public BusinessTransactionListType createBusinessTransactionListType() {
        return new BusinessTransactionListType();
    }

    /**
     * Create an instance of {@link TransactionEventType }
     * 
     */
    public TransactionEventType createTransactionEventType() {
        return new TransactionEventType();
    }

    /**
     * Create an instance of {@link EPCISMasterDataType }
     * 
     */
    public EPCISMasterDataType createEPCISMasterDataType() {
        return new EPCISMasterDataType();
    }

    /**
     * Create an instance of {@link EPCISEventListExtensionType }
     * 
     */
    public EPCISEventListExtensionType createEPCISEventListExtensionType() {
        return new EPCISEventListExtensionType();
    }

    /**
     * Create an instance of {@link TransactionEventExtensionType }
     * 
     */
    public TransactionEventExtensionType createTransactionEventExtensionType() {
        return new TransactionEventExtensionType();
    }

    /**
     * Create an instance of {@link VocabularyListType }
     * 
     */
    public VocabularyListType createVocabularyListType() {
        return new VocabularyListType();
    }

    /**
     * Create an instance of {@link EPCISEventExtension2Type }
     * 
     */
    public EPCISEventExtension2Type createEPCISEventExtension2Type() {
        return new EPCISEventExtension2Type();
    }

    /**
     * Create an instance of {@link ObjectEventType }
     * 
     */
    public ObjectEventType createObjectEventType() {
        return new ObjectEventType();
    }

    /**
     * Create an instance of {@link TransformationEventExtensionType }
     * 
     */
    public TransformationEventExtensionType createTransformationEventExtensionType() {
        return new TransformationEventExtensionType();
    }

    /**
     * Create an instance of {@link AggregationEventExtension2Type }
     * 
     */
    public AggregationEventExtension2Type createAggregationEventExtension2Type() {
        return new AggregationEventExtension2Type();
    }

    /**
     * Create an instance of {@link EPCISEventExtensionType }
     * 
     */
    public EPCISEventExtensionType createEPCISEventExtensionType() {
        return new EPCISEventExtensionType();
    }

    /**
     * Create an instance of {@link QuantityEventType }
     * 
     */
    public QuantityEventType createQuantityEventType() {
        return new QuantityEventType();
    }

    /**
     * Create an instance of {@link AggregationEventExtensionType }
     * 
     */
    public AggregationEventExtensionType createAggregationEventExtensionType() {
        return new AggregationEventExtensionType();
    }

    /**
     * Create an instance of {@link EPCISEventListExtension2Type }
     * 
     */
    public EPCISEventListExtension2Type createEPCISEventListExtension2Type() {
        return new EPCISEventListExtension2Type();
    }

    /**
     * Create an instance of {@link SourceDestType }
     * 
     */
    public SourceDestType createSourceDestType() {
        return new SourceDestType();
    }

    /**
     * Create an instance of {@link VocabularyType }
     * 
     */
    public VocabularyType createVocabularyType() {
        return new VocabularyType();
    }

    /**
     * Create an instance of {@link QuantityElementType }
     * 
     */
    public QuantityElementType createQuantityElementType() {
        return new QuantityElementType();
    }

    /**
     * Create an instance of {@link DestinationListType }
     * 
     */
    public DestinationListType createDestinationListType() {
        return new DestinationListType();
    }

    /**
     * Create an instance of {@link VocabularyElementListType }
     * 
     */
    public VocabularyElementListType createVocabularyElementListType() {
        return new VocabularyElementListType();
    }

    /**
     * Create an instance of {@link BusinessTransactionType }
     * 
     */
    public BusinessTransactionType createBusinessTransactionType() {
        return new BusinessTransactionType();
    }

    /**
     * Create an instance of {@link ILMDExtensionType }
     * 
     */
    public ILMDExtensionType createILMDExtensionType() {
        return new ILMDExtensionType();
    }

    /**
     * Create an instance of {@link AggregationEventType }
     * 
     */
    public AggregationEventType createAggregationEventType() {
        return new AggregationEventType();
    }

    /**
     * Create an instance of {@link ReadPointType }
     * 
     */
    public ReadPointType createReadPointType() {
        return new ReadPointType();
    }

    /**
     * Create an instance of {@link CorrectiveEventIDsType }
     * 
     */
    public CorrectiveEventIDsType createCorrectiveEventIDsType() {
        return new CorrectiveEventIDsType();
    }

    /**
     * Create an instance of {@link BusinessLocationType }
     * 
     */
    public BusinessLocationType createBusinessLocationType() {
        return new BusinessLocationType();
    }

    /**
     * Create an instance of {@link BusinessLocationExtensionType }
     * 
     */
    public BusinessLocationExtensionType createBusinessLocationExtensionType() {
        return new BusinessLocationExtensionType();
    }

    /**
     * Create an instance of {@link EPCISDocumentExtensionType }
     * 
     */
    public EPCISDocumentExtensionType createEPCISDocumentExtensionType() {
        return new EPCISDocumentExtensionType();
    }

    /**
     * Create an instance of {@link EPCISBodyExtensionType }
     * 
     */
    public EPCISBodyExtensionType createEPCISBodyExtensionType() {
        return new EPCISBodyExtensionType();
    }

    /**
     * Create an instance of {@link VocabularyElementExtensionType }
     * 
     */
    public VocabularyElementExtensionType createVocabularyElementExtensionType() {
        return new VocabularyElementExtensionType();
    }

    /**
     * Create an instance of {@link ObjectEventExtensionType }
     * 
     */
    public ObjectEventExtensionType createObjectEventExtensionType() {
        return new ObjectEventExtensionType();
    }

    /**
     * Create an instance of {@link SourceListType }
     * 
     */
    public SourceListType createSourceListType() {
        return new SourceListType();
    }

    /**
     * Create an instance of {@link ErrorDeclarationExtensionType }
     * 
     */
    public ErrorDeclarationExtensionType createErrorDeclarationExtensionType() {
        return new ErrorDeclarationExtensionType();
    }

    /**
     * Create an instance of {@link VocabularyExtensionType }
     * 
     */
    public VocabularyExtensionType createVocabularyExtensionType() {
        return new VocabularyExtensionType();
    }

    /**
     * Create an instance of {@link EPCISHeaderExtensionType }
     * 
     */
    public EPCISHeaderExtensionType createEPCISHeaderExtensionType() {
        return new EPCISHeaderExtensionType();
    }

    /**
     * Create an instance of {@link EPC }
     * 
     */
    public EPC createEPC() {
        return new EPC();
    }

    /**
     * Create an instance of {@link BusinessService }
     * 
     */
    public BusinessService createBusinessService() {
        return new BusinessService();
    }

    /**
     * Create an instance of {@link CorrelationInformation }
     * 
     */
    public CorrelationInformation createCorrelationInformation() {
        return new CorrelationInformation();
    }

    /**
     * Create an instance of {@link StandardBusinessDocument }
     * 
     */
    public StandardBusinessDocument createStandardBusinessDocument() {
        return new StandardBusinessDocument();
    }

    /**
     * Create an instance of {@link StandardBusinessDocumentHeader }
     * 
     */
    public StandardBusinessDocumentHeader createStandardBusinessDocumentHeader() {
        return new StandardBusinessDocumentHeader();
    }

    /**
     * Create an instance of {@link ManifestItem }
     * 
     */
    public ManifestItem createManifestItem() {
        return new ManifestItem();
    }

    /**
     * Create an instance of {@link DocumentIdentification }
     * 
     */
    public DocumentIdentification createDocumentIdentification() {
        return new DocumentIdentification();
    }

    /**
     * Create an instance of {@link ServiceTransaction }
     * 
     */
    public ServiceTransaction createServiceTransaction() {
        return new ServiceTransaction();
    }

    /**
     * Create an instance of {@link BusinessScope }
     * 
     */
    public BusinessScope createBusinessScope() {
        return new BusinessScope();
    }

    /**
     * Create an instance of {@link PartnerIdentification }
     * 
     */
    public PartnerIdentification createPartnerIdentification() {
        return new PartnerIdentification();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link ContactInformation }
     * 
     */
    public ContactInformation createContactInformation() {
        return new ContactInformation();
    }

    /**
     * Create an instance of {@link Scope }
     * 
     */
    public Scope createScope() {
        return new Scope();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }



}
