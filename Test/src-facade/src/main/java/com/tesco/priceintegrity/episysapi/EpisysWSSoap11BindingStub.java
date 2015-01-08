/**
 * EpisysWSSoap11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class EpisysWSSoap11BindingStub extends org.apache.axis.client.Stub implements com.tesco.priceintegrity.episysapi.EpisysWSPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[54];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("print");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "printDocuments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintDocument"), com.tesco.priceintegrity.episysapi.PrintDocument[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintDocumentResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.PrintDocumentResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConfirmationPriceForStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ConfirmationPriceForStoreRequestItem"), com.tesco.priceintegrity.episysapi.ConfirmationPriceForStoreRequestItem.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceConfirmationMessage"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.PriceConfirmationMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePriceWithPricingRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findChildren");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedProductHierarchyItem"), com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.AdvancedValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreDeletionItem"), com.tesco.priceintegrity.episysapi.StoreDeletionItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductItem"), com.tesco.priceintegrity.episysapi.ProductItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("previewSignSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "paramPreviewSignSetItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PreviewSignSetItem"), com.tesco.priceintegrity.episysapi.PreviewSignSetItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PreviewResults"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.PreviewResults[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterCustomSign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignAlterItem"), com.tesco.priceintegrity.episysapi.CustomSignAlterItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePlanogramLocationWithUserId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationItemWithUserId"), com.tesco.priceintegrity.episysapi.PlanogramLocationItemWithUserId[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeStoresFromGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupDeleteStoresItem"), com.tesco.priceintegrity.episysapi.StoreGroupDeleteStoresItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePlanogramProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductItem"), com.tesco.priceintegrity.episysapi.PlanogramProductItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePriceWithEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePrice2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePriceWithEvent2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageComplexPromotion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemV2"), com.tesco.priceintegrity.episysapi.PromotionItemV2[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotionV2_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemV2"), com.tesco.priceintegrity.episysapi.PromotionItemV2[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePlanogramProductWithUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductItemWithUserID"), com.tesco.priceintegrity.episysapi.PlanogramProductItemWithUserID[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotion_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItem"), com.tesco.priceintegrity.episysapi.PromotionItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotionForFESP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemForFESP"), com.tesco.priceintegrity.episysapi.PromotionItemForFESP[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageWEEEPRF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "WEEEPRFItem"), com.tesco.priceintegrity.episysapi.WEEEPRFItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotionV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemV2"), com.tesco.priceintegrity.episysapi.PromotionItemV2[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsertStoreGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupInfoItem"), com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createStoreGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupInfoItem"), com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProductsWithWorkFlow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductItem"), com.tesco.priceintegrity.episysapi.ProductItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveProductHierarchyLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductHierarchyMoveItem"), com.tesco.priceintegrity.episysapi.ProductHierarchyMoveItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePrice_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePlanogramProduct_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductItem"), com.tesco.priceintegrity.episysapi.PlanogramProductItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContentDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "args0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDetailRequestItem"), com.tesco.priceintegrity.episysapi.ContentDetailRequestItem.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotionForGroupOffers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemWithStoreGroupName"), com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageWEEECategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "WEEECategoryItem"), com.tesco.priceintegrity.episysapi.WEEECategoryItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addStoresToGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupAddStoreItem"), com.tesco.priceintegrity.episysapi.StoreGroupAddStoreItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDataItem"), com.tesco.priceintegrity.episysapi.ContentDataItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageStockRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StockRangeItem"), com.tesco.priceintegrity.episysapi.StockRangeItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteStoreGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupDeletionItem"), com.tesco.priceintegrity.episysapi.StoreGroupDeletionItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPlanogramDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocPrdDetailsRequest"), com.tesco.priceintegrity.episysapi.PlanogramLocPrdDetailsRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batchLabelRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "BatchLabelRequest"), com.tesco.priceintegrity.episysapi.BatchLabelRequest[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePriceWithHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestHistoryItem"), com.tesco.priceintegrity.episysapi.PriceChangeRequestHistoryItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAllStoreGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "srcSystem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDataItem"), com.tesco.priceintegrity.episysapi.ContentDataItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotionWithStoreGroupName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemWithStoreGroupName"), com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("adhocLabelRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdhocLabelRequestItem"), com.tesco.priceintegrity.episysapi.AdhocLabelRequestItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProductHierarchy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductHierarchyItem"), com.tesco.priceintegrity.episysapi.ProductHierarchyItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProductWithWorkFlow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductItem"), com.tesco.priceintegrity.episysapi.ProductItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateStoreGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupInfoItem"), com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePlanogramLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationItem"), com.tesco.priceintegrity.episysapi.PlanogramLocationItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePlanogramLocation_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationItem"), com.tesco.priceintegrity.episysapi.PlanogramLocationItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageAdvancedProductHierarchy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedProductHierarchyItem"), com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.AdvancedValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customSignBuilderService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignBuilderRequestItem"), com.tesco.priceintegrity.episysapi.CustomSignBuilderRequestItem.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignBuilderResultItem"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProductsStoreContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductStoreContentItem"), com.tesco.priceintegrity.episysapi.ProductStoreContentItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "EventItem"), com.tesco.priceintegrity.episysapi.EventItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreInfoItem"), com.tesco.priceintegrity.episysapi.StoreInfoItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromotion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItem"), com.tesco.priceintegrity.episysapi.PromotionItem[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.ValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlanogramLocationDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.soap.episys.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationDetailsRequest"), com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationDetailsResponse"));
        oper.setReturnClass(com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.soap.episys.com", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

    }

    public EpisysWSSoap11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EpisysWSSoap11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EpisysWSSoap11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdhocLabelRequestItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.AdhocLabelRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedProductHierarchyItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedValidationResult");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.AdvancedValidationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "BatchLabelRequest");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.BatchLabelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "BatchLabelRequestItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.BatchLabelRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ConfirmationPriceForStoreRequestItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ConfirmationPriceForStoreRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDataBaseItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ContentDataBaseItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDataItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ContentDataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDetailRequestItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ContentDetailRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentFieldItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ContentFieldItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignAlterItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.CustomSignAlterItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignBuilderRequestItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.CustomSignBuilderRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignBuilderResultItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "EventItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.EventItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "HierarchyObject");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.HierarchyObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferDetailExtension");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.OfferDetailItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferDetailItem");
            qName2 = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerDetailExtensionList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferDetailItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.OfferDetailItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferType");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.OfferType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferTypeExtendedDetail");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.OfferTypeExtendedDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferTypeV2");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.OfferTypeV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramAttributeItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramAttributeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramLocationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationItemWithUserId");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramLocationItemWithUserId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocPrdDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramLocPrdDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramProductItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductItemWithUserID");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramProductItemWithUserID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductSubItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PlanogramProductSubItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PreviewResults");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PreviewResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PreviewSignSetItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PreviewSignSetItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestHistoryItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PriceChangeRequestHistoryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PriceChangeRequestItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceConfirmationMessage");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PriceConfirmationMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceDetailItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PriceDetailItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PriceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceItemWithHistory");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PriceItemWithHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintAttribute");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PrintAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintDocument");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PrintDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintDocumentResult");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PrintDocumentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintElement");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PrintElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductHierarchyItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ProductHierarchyItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductHierarchyMoveItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ProductHierarchyMoveItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ProductItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductStoreContentFieldItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ProductStoreContentFieldItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductStoreContentItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ProductStoreContentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PromotionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemForFESP");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PromotionItemForFESP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemV2");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PromotionItemV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemWithStoreGroupName");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StockRangeItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StockRangeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreDeletionItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreDeletionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupAddStoreItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreGroupAddStoreItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupDeleteStoresItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreGroupDeleteStoresItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupDeletionItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreGroupDeletionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupInfoItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreGroupInfoItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreHoursItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreHoursItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreHoursOverrideItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreInfoItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.StoreInfoItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.ValidationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "WEEECategoryItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.WEEECategoryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.episys.com/xsd", "WEEEPRFItem");
            cachedSerQNames.add(qName);
            cls = com.tesco.priceintegrity.episysapi.WEEEPRFItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.tesco.priceintegrity.episysapi.PrintDocumentResult[] print(com.tesco.priceintegrity.episysapi.PrintDocument[] printDocuments) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:print");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "print"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {printDocuments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.PrintDocumentResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.PrintDocumentResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.PrintDocumentResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.PriceConfirmationMessage getConfirmationPriceForStore(com.tesco.priceintegrity.episysapi.ConfirmationPriceForStoreRequestItem item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getConfirmationPriceForStore");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "getConfirmationPriceForStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.PriceConfirmationMessage) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.PriceConfirmationMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.PriceConfirmationMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithPricingRule(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePriceWithPricingRule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePriceWithPricingRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.AdvancedValidationResult findChildren(com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:findChildren");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "findChildren"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.AdvancedValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.AdvancedValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.AdvancedValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult deleteStore(com.tesco.priceintegrity.episysapi.StoreDeletionItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteStore");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "deleteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageProduct(com.tesco.priceintegrity.episysapi.ProductItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.PreviewResults[] previewSignSet(com.tesco.priceintegrity.episysapi.PreviewSignSetItem[] paramPreviewSignSetItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:previewSignSet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "previewSignSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {paramPreviewSignSetItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.PreviewResults[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.PreviewResults[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.PreviewResults[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult alterCustomSign(com.tesco.priceintegrity.episysapi.CustomSignAlterItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:alterCustomSign");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "alterCustomSign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramLocationWithUserId(com.tesco.priceintegrity.episysapi.PlanogramLocationItemWithUserId[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePlanogramLocationWithUserId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePlanogramLocationWithUserId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult removeStoresFromGroup(com.tesco.priceintegrity.episysapi.StoreGroupDeleteStoresItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:removeStoresFromGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "removeStoresFromGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePrice(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePrice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramProduct(com.tesco.priceintegrity.episysapi.PlanogramProductItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePlanogramProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePlanogramProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithEvent(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePriceWithEvent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePriceWithEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePrice2(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePrice2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePrice2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithEvent2(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePriceWithEvent2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePriceWithEvent2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageComplexPromotion(com.tesco.priceintegrity.episysapi.PromotionItemV2[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageComplexPromotion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageComplexPromotion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePromotionV2_2(com.tesco.priceintegrity.episysapi.PromotionItemV2[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotionV2_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotionV2_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramProductWithUserID(com.tesco.priceintegrity.episysapi.PlanogramProductItemWithUserID[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePlanogramProductWithUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePlanogramProductWithUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePromotion_2(com.tesco.priceintegrity.episysapi.PromotionItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotion_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotion_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Integer managePromotionForFESP(com.tesco.priceintegrity.episysapi.PromotionItemForFESP[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotionForFESP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotionForFESP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Integer) _resp;
            } catch (Exception _exception) {
                return (Integer) org.apache.axis.utils.JavaUtils.convert(_resp, Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageWEEEPRF(com.tesco.priceintegrity.episysapi.WEEEPRFItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageWEEEPRF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageWEEEPRF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotionV2(com.tesco.priceintegrity.episysapi.PromotionItemV2[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotionV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotionV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult upsertStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:upsertStoreGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "upsertStoreGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult createStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:createStoreGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "createStoreGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] manageProductsWithWorkFlow(com.tesco.priceintegrity.episysapi.ProductItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageProductsWithWorkFlow");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageProductsWithWorkFlow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult moveProductHierarchyLevel(com.tesco.priceintegrity.episysapi.ProductHierarchyMoveItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:moveProductHierarchyLevel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "moveProductHierarchyLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePrice_2(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePrice_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePrice_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePlanogramProduct_2(com.tesco.priceintegrity.episysapi.PlanogramProductItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePlanogramProduct_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePlanogramProduct_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult getContentDetail(com.tesco.priceintegrity.episysapi.ContentDetailRequestItem args0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getContentDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "getContentDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {args0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotionForGroupOffers(com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotionForGroupOffers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotionForGroupOffers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageWEEECategory(com.tesco.priceintegrity.episysapi.WEEECategoryItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageWEEECategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageWEEECategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult addStoresToGroup(com.tesco.priceintegrity.episysapi.StoreGroupAddStoreItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addStoresToGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "addStoresToGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult deleteContent(com.tesco.priceintegrity.episysapi.ContentDataItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteContent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "deleteContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageStockRange(com.tesco.priceintegrity.episysapi.StockRangeItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageStockRange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageStockRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult deleteStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupDeletionItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteStoreGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "deleteStoreGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult addPlanogramDetails(com.tesco.priceintegrity.episysapi.PlanogramLocPrdDetailsRequest item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addPlanogramDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "addPlanogramDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult batchLabelRequest(com.tesco.priceintegrity.episysapi.BatchLabelRequest[] request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:batchLabelRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "batchLabelRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithHistory(com.tesco.priceintegrity.episysapi.PriceChangeRequestHistoryItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePriceWithHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePriceWithHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult deleteAllStoreGroup(String srcSystem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteAllStoreGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "deleteAllStoreGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {srcSystem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult updateContent(com.tesco.priceintegrity.episysapi.ContentDataItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:updateContent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "updateContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotionWithStoreGroupName(com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotionWithStoreGroupName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotionWithStoreGroupName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult adhocLabelRequest(com.tesco.priceintegrity.episysapi.AdhocLabelRequestItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:adhocLabelRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "adhocLabelRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageProductHierarchy(com.tesco.priceintegrity.episysapi.ProductHierarchyItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageProductHierarchy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageProductHierarchy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageProductWithWorkFlow(com.tesco.priceintegrity.episysapi.ProductItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageProductWithWorkFlow");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageProductWithWorkFlow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult updateStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:updateStoreGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "updateStoreGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramLocation(com.tesco.priceintegrity.episysapi.PlanogramLocationItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePlanogramLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePlanogramLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePlanogramLocation_2(com.tesco.priceintegrity.episysapi.PlanogramLocationItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePlanogramLocation_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePlanogramLocation_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.AdvancedValidationResult manageAdvancedProductHierarchy(com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageAdvancedProductHierarchy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageAdvancedProductHierarchy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.AdvancedValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.AdvancedValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.AdvancedValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem customSignBuilderService(com.tesco.priceintegrity.episysapi.CustomSignBuilderRequestItem item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:customSignBuilderService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "customSignBuilderService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] manageProductsStoreContent(com.tesco.priceintegrity.episysapi.ProductStoreContentItem[] items) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageProductsStoreContent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageProductsStoreContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {items});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult[] manageEvent(com.tesco.priceintegrity.episysapi.EventItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageEvent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult manageStore(com.tesco.priceintegrity.episysapi.StoreInfoItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:manageStore");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "manageStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotion(com.tesco.priceintegrity.episysapi.PromotionItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:managePromotion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "managePromotion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.ValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.ValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse getPlanogramLocationDetails(com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getPlanogramLocationDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.soap.episys.com", "getPlanogramLocationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
