/**
 * EpisysWSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public interface EpisysWSPortType extends java.rmi.Remote {
    public com.tesco.priceintegrity.episysapi.PrintDocumentResult[] print(com.tesco.priceintegrity.episysapi.PrintDocument[] printDocuments) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.PriceConfirmationMessage getConfirmationPriceForStore(com.tesco.priceintegrity.episysapi.ConfirmationPriceForStoreRequestItem item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithPricingRule(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult deleteStore(com.tesco.priceintegrity.episysapi.StoreDeletionItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.AdvancedValidationResult findChildren(com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageProduct(com.tesco.priceintegrity.episysapi.ProductItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.PreviewResults[] previewSignSet(com.tesco.priceintegrity.episysapi.PreviewSignSetItem[] paramPreviewSignSetItem) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult alterCustomSign(com.tesco.priceintegrity.episysapi.CustomSignAlterItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramLocationWithUserId(com.tesco.priceintegrity.episysapi.PlanogramLocationItemWithUserId[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePrice(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult removeStoresFromGroup(com.tesco.priceintegrity.episysapi.StoreGroupDeleteStoresItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithEvent(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramProduct(com.tesco.priceintegrity.episysapi.PlanogramProductItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePrice2(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithEvent2(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageComplexPromotion(com.tesco.priceintegrity.episysapi.PromotionItemV2[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePromotionV2_2(com.tesco.priceintegrity.episysapi.PromotionItemV2[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramProductWithUserID(com.tesco.priceintegrity.episysapi.PlanogramProductItemWithUserID[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePromotion_2(com.tesco.priceintegrity.episysapi.PromotionItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageWEEEPRF(com.tesco.priceintegrity.episysapi.WEEEPRFItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotionV2(com.tesco.priceintegrity.episysapi.PromotionItemV2[] item) throws java.rmi.RemoteException;
    public Integer managePromotionForFESP(com.tesco.priceintegrity.episysapi.PromotionItemForFESP[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult createStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult upsertStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] manageProductsWithWorkFlow(com.tesco.priceintegrity.episysapi.ProductItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult getContentDetail(com.tesco.priceintegrity.episysapi.ContentDetailRequestItem args0) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult moveProductHierarchyLevel(com.tesco.priceintegrity.episysapi.ProductHierarchyMoveItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePrice_2(com.tesco.priceintegrity.episysapi.PriceChangeRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePlanogramProduct_2(com.tesco.priceintegrity.episysapi.PlanogramProductItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotionForGroupOffers(com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult addStoresToGroup(com.tesco.priceintegrity.episysapi.StoreGroupAddStoreItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageWEEECategory(com.tesco.priceintegrity.episysapi.WEEECategoryItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult deleteContent(com.tesco.priceintegrity.episysapi.ContentDataItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageStockRange(com.tesco.priceintegrity.episysapi.StockRangeItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult deleteStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupDeletionItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult batchLabelRequest(com.tesco.priceintegrity.episysapi.BatchLabelRequest[] request) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult addPlanogramDetails(com.tesco.priceintegrity.episysapi.PlanogramLocPrdDetailsRequest item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult deleteAllStoreGroup(String srcSystem) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePriceWithHistory(com.tesco.priceintegrity.episysapi.PriceChangeRequestHistoryItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotionWithStoreGroupName(com.tesco.priceintegrity.episysapi.PromotionItemWithStoreGroupName[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult updateContent(com.tesco.priceintegrity.episysapi.ContentDataItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult adhocLabelRequest(com.tesco.priceintegrity.episysapi.AdhocLabelRequestItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageProductHierarchy(com.tesco.priceintegrity.episysapi.ProductHierarchyItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageProductWithWorkFlow(com.tesco.priceintegrity.episysapi.ProductItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult updateStoreGroup(com.tesco.priceintegrity.episysapi.StoreGroupInfoItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.AdvancedValidationResult manageAdvancedProductHierarchy(com.tesco.priceintegrity.episysapi.AdvancedProductHierarchyItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] managePlanogramLocation_2(com.tesco.priceintegrity.episysapi.PlanogramLocationItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.CustomSignBuilderResultItem customSignBuilderService(com.tesco.priceintegrity.episysapi.CustomSignBuilderRequestItem item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePlanogramLocation(com.tesco.priceintegrity.episysapi.PlanogramLocationItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] manageEvent(com.tesco.priceintegrity.episysapi.EventItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult[] manageProductsStoreContent(com.tesco.priceintegrity.episysapi.ProductStoreContentItem[] items) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult manageStore(com.tesco.priceintegrity.episysapi.StoreInfoItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.ValidationResult managePromotion(com.tesco.priceintegrity.episysapi.PromotionItem[] item) throws java.rmi.RemoteException;
    public com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsResponse getPlanogramLocationDetails(com.tesco.priceintegrity.episysapi.PlanogramLocationDetailsRequest request) throws java.rmi.RemoteException;
}
