package com.tesco.priceintegrity.facade.manageprice;

import com.tesco.priceintegrity.common.episyslocator.EpisysPortHandle;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.episysapi.PriceChangeRequestItem;
import com.tesco.priceintegrity.episysapi.PriceItem;
import com.tesco.priceintegrity.episysapi.OfferDetailItem;
import com.tesco.priceintegrity.episysapi.ValidationResult;

/**
 * Created by AC37 on 05/12/2014.
 * Manage Price of Product. Includes method to Create, Update, Delete and Upsert price.
 */
public class TescoManagePrice {
    private int RETURN_VALUE = -1;
    String statusMessage;

    //ValidationResult validationResult = null;
    public float price;
    //public Integer messageType;
    public Integer priceUID;

    /**
     * Method to create/set the current price
     *  @return an integer
     */
    public int createPriceForAProduct() {

        ValidationResult validationResult = null;

        try {

            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "CreatePrice.config";
            PriceItem priceItem = new PriceItem();
            priceItem.setOfferType(Integer.parseInt(configurationReader.getValue(fileName, "offerType")));
            priceItem.setPrice(Float.parseFloat(configurationReader.getValue(fileName, "price")));
            this.price = Float.parseFloat(configurationReader.getValue(fileName, "price"));
            //System.out.println(Float.parseFloat(configurationReader.getValue(fileName, "price"))+" price in method");
            priceItem.setPriceCode(configurationReader.getValue(fileName,"priceCode"));
            priceItem.setPriceEndDate(configurationReader.getValue(fileName,"priceEndDate"));
            priceItem.setPriceStartDate(configurationReader.getValue(fileName,"priceStartDate"));
            priceItem.setPriceType(Integer.parseInt(configurationReader.getValue(fileName, "priceType")));
            priceItem.setWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasPrice")));
            priceItem.setWasWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasWasPrice")));

            PriceChangeRequestItem priceChangeRequestItem = new PriceChangeRequestItem();
            priceChangeRequestItem.setEventUID(Integer.parseInt(configurationReader.getValue(fileName,"eventUID")));
            priceChangeRequestItem.setItemTag(configurationReader.getValue(fileName, "itemTag"));
            priceChangeRequestItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            priceChangeRequestItem.setPriceDescription(configurationReader.getValue(fileName, "priceDescription"));
            priceChangeRequestItem.setPriceUID(Integer.parseInt(configurationReader.getValue(fileName, "priceUID")));
            this.priceUID = Integer.parseInt(configurationReader.getValue(fileName, "priceUID"));
            //System.out.println(Integer.parseInt(configurationReader.getValue(fileName, "priceUID")));
            priceChangeRequestItem.setProductCode(configurationReader.getValue(fileName, "productCode"));
            priceChangeRequestItem.setProductTypeCode(configurationReader.getValue(fileName, "productTypeCode"));
            priceChangeRequestItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            priceChangeRequestItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));
            priceChangeRequestItem.setStatusCode(configurationReader.getValue(fileName, "statusCode"));
            priceChangeRequestItem.setUserID(configurationReader.getValue(fileName, "userID"));
            priceChangeRequestItem.setPriceItem(priceItem);

            OfferDetailItem offerDetailItem = new OfferDetailItem();
            offerDetailItem.setOfferDetailName(configurationReader.getValue(fileName,"offerDetailName"));
            offerDetailItem.setOfferDetailValue(configurationReader.getValue(fileName,"offerDetailValue"));


            OfferDetailItem[] offerDetailItems = new OfferDetailItem[1];
            offerDetailItems[0] = offerDetailItem;

            PriceChangeRequestItem[] priceChangeRequestItems = new PriceChangeRequestItem[1];
            priceChangeRequestItems[0] = priceChangeRequestItem;

            //EpisysPortHandle.getEpisysPort();
            validationResult = EpisysPortHandle.getEpisysService().managePrice(priceChangeRequestItems);

           // old// validationResult = service.managePrice(priceChangeRequestItems);
            RETURN_VALUE = validationResult.getStatusCode();
            statusMessage = validationResult.getStatusMessage();

            //System.out.println("RETURN_VALUE: " + RETURN_VALUE);
            //System.out.println("statusMessage: " + statusMessage);


        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
            System.out.println("Exception in Create Price for a Product "+ex.getMessage());
        }
        return RETURN_VALUE;
    }

    /**
     * Method to update/amend the current price
     * @return an integer
     */
    public int updatePriceForAProduct() {

        ValidationResult validationResult = null;

        try {

            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "UpdatePrice.config";
            PriceItem priceItem = new PriceItem();
            priceItem.setOfferType(Integer.parseInt(configurationReader.getValue(fileName, "offerType")));
            priceItem.setPrice(Float.parseFloat(configurationReader.getValue(fileName, "price")));
            this.price = Float.parseFloat(configurationReader.getValue(fileName, "price"));
            priceItem.setPriceCode(configurationReader.getValue(fileName,"priceCode"));
            priceItem.setPriceEndDate(configurationReader.getValue(fileName,"priceEndDate"));
            priceItem.setPriceStartDate(configurationReader.getValue(fileName,"priceStartDate"));
            priceItem.setPriceType(Integer.parseInt(configurationReader.getValue(fileName, "priceType")));
            priceItem.setWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasPrice")));
            priceItem.setWasWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasWasPrice")));

            PriceChangeRequestItem priceChangeRequestItem = new PriceChangeRequestItem();
            priceChangeRequestItem.setEventUID(Integer.parseInt(configurationReader.getValue(fileName,"eventUID")));
            priceChangeRequestItem.setItemTag(configurationReader.getValue(fileName, "itemTag"));
            priceChangeRequestItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            priceChangeRequestItem.setPriceDescription(configurationReader.getValue(fileName, "priceDescription"));
            priceChangeRequestItem.setPriceUID(Integer.parseInt(configurationReader.getValue(fileName, "priceUID")));
            this.priceUID = Integer.parseInt(configurationReader.getValue(fileName, "priceUID"));
            priceChangeRequestItem.setProductCode(configurationReader.getValue(fileName, "productCode"));
            priceChangeRequestItem.setProductTypeCode(configurationReader.getValue(fileName, "productTypeCode"));
            priceChangeRequestItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            priceChangeRequestItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));
            priceChangeRequestItem.setStatusCode(configurationReader.getValue(fileName, "statusCode"));
            priceChangeRequestItem.setUserID(configurationReader.getValue(fileName, "userID"));
            priceChangeRequestItem.setPriceItem(priceItem);

            OfferDetailItem offerDetailItem = new OfferDetailItem();
            offerDetailItem.setOfferDetailName(configurationReader.getValue(fileName,"offerDetailName"));
            offerDetailItem.setOfferDetailValue(configurationReader.getValue(fileName,"offerDetailValue"));


            OfferDetailItem[] offerDetailItems = new OfferDetailItem[1];
            offerDetailItems[0] = offerDetailItem;

            PriceChangeRequestItem[] priceChangeRequestItems = new PriceChangeRequestItem[1];
            priceChangeRequestItems[0] = priceChangeRequestItem;

            //EpisysPortHandle.getEpisysPort();
            validationResult = EpisysPortHandle.getEpisysService().managePrice(priceChangeRequestItems);

            RETURN_VALUE = validationResult.getStatusCode();
            statusMessage = validationResult.getStatusMessage();


        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
            System.out.println("Exception in Update Price for a Product "+ex.getMessage());
        }
        return RETURN_VALUE;
    }

    /**
     * Method to delete the current price
     *      @return an integer
     */
    public int deletePriceForAProduct() {

        ValidationResult validationResult = null;

        try {

            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "DeletePrice.config";
            PriceItem priceItem = new PriceItem();
            priceItem.setOfferType(Integer.parseInt(configurationReader.getValue(fileName, "offerType")));
            priceItem.setPrice(Float.parseFloat(configurationReader.getValue(fileName, "price")));
            this.price = Float.parseFloat(configurationReader.getValue(fileName, "price"));
            priceItem.setPriceCode(configurationReader.getValue(fileName,"priceCode"));
            priceItem.setPriceEndDate(configurationReader.getValue(fileName,"priceEndDate"));
            priceItem.setPriceStartDate(configurationReader.getValue(fileName,"priceStartDate"));
            priceItem.setPriceType(Integer.parseInt(configurationReader.getValue(fileName, "priceType")));
            priceItem.setWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasPrice")));
            priceItem.setWasWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasWasPrice")));

            PriceChangeRequestItem priceChangeRequestItem = new PriceChangeRequestItem();
            priceChangeRequestItem.setEventUID(Integer.parseInt(configurationReader.getValue(fileName,"eventUID")));
            priceChangeRequestItem.setItemTag(configurationReader.getValue(fileName, "itemTag"));
            priceChangeRequestItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            priceChangeRequestItem.setPriceDescription(configurationReader.getValue(fileName, "priceDescription"));
            priceChangeRequestItem.setPriceUID(Integer.parseInt(configurationReader.getValue(fileName, "priceUID")));
            this.priceUID = Integer.parseInt(configurationReader.getValue(fileName, "priceUID"));
            priceChangeRequestItem.setProductCode(configurationReader.getValue(fileName, "productCode"));
            priceChangeRequestItem.setProductTypeCode(configurationReader.getValue(fileName, "productTypeCode"));
            priceChangeRequestItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            priceChangeRequestItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));
            priceChangeRequestItem.setStatusCode(configurationReader.getValue(fileName, "statusCode"));
            priceChangeRequestItem.setUserID(configurationReader.getValue(fileName, "userID"));
            priceChangeRequestItem.setPriceItem(priceItem);

            OfferDetailItem offerDetailItem = new OfferDetailItem();
            offerDetailItem.setOfferDetailName(configurationReader.getValue(fileName,"offerDetailName"));
            offerDetailItem.setOfferDetailValue(configurationReader.getValue(fileName,"offerDetailValue"));


            OfferDetailItem[] offerDetailItems = new OfferDetailItem[1];
            offerDetailItems[0] = offerDetailItem;

            PriceChangeRequestItem[] priceChangeRequestItems = new PriceChangeRequestItem[1];
            priceChangeRequestItems[0] = priceChangeRequestItem;

            //EpisysPortHandle.getEpisysPort();
            validationResult = EpisysPortHandle.getEpisysService().managePrice(priceChangeRequestItems);

            // old// validationResult = service.managePrice(priceChangeRequestItems);
            RETURN_VALUE = validationResult.getStatusCode();
            statusMessage = validationResult.getStatusMessage();

            //System.out.println("RETURN_VALUE in Del method: " + RETURN_VALUE);
            //System.out.println("statusMessage in Del method: " + statusMessage);

        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
            System.out.println("Exception in Delete Price for a Product "+ex.getMessage());
        }
        return RETURN_VALUE;
    }

    /**
     * Method to upsert the current price
     * @return an integer
     */
    public int upsertPriceForAProduct() {

        ValidationResult validationResult = null;

        try {

            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "UpsertPrice.config";
            PriceItem priceItem = new PriceItem();
            priceItem.setOfferType(Integer.parseInt(configurationReader.getValue(fileName, "offerType")));
            priceItem.setPrice(Float.parseFloat(configurationReader.getValue(fileName, "price")));
            this.price = Float.parseFloat(configurationReader.getValue(fileName, "price"));

            priceItem.setPriceCode(configurationReader.getValue(fileName,"priceCode"));
            priceItem.setPriceEndDate(configurationReader.getValue(fileName,"priceEndDate"));
            priceItem.setPriceStartDate(configurationReader.getValue(fileName,"priceStartDate"));
            priceItem.setPriceType(Integer.parseInt(configurationReader.getValue(fileName, "priceType")));
            priceItem.setWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasPrice")));
            priceItem.setWasWasPrice(Float.parseFloat(configurationReader.getValue(fileName, "wasWasPrice")));

            PriceChangeRequestItem priceChangeRequestItem = new PriceChangeRequestItem();
            priceChangeRequestItem.setEventUID(Integer.parseInt(configurationReader.getValue(fileName,"eventUID")));
            priceChangeRequestItem.setItemTag(configurationReader.getValue(fileName, "itemTag"));
            priceChangeRequestItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            priceChangeRequestItem.setPriceDescription(configurationReader.getValue(fileName, "priceDescription"));
            priceChangeRequestItem.setPriceUID(Integer.parseInt(configurationReader.getValue(fileName, "priceUID")));
            this.priceUID = Integer.parseInt(configurationReader.getValue(fileName, "priceUID"));
            priceChangeRequestItem.setProductCode(configurationReader.getValue(fileName, "productCode"));
            priceChangeRequestItem.setProductTypeCode(configurationReader.getValue(fileName, "productTypeCode"));
            priceChangeRequestItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            priceChangeRequestItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));
            priceChangeRequestItem.setStatusCode(configurationReader.getValue(fileName, "statusCode"));
            priceChangeRequestItem.setUserID(configurationReader.getValue(fileName, "userID"));
            priceChangeRequestItem.setPriceItem(priceItem);

            OfferDetailItem offerDetailItem = new OfferDetailItem();
            offerDetailItem.setOfferDetailName(configurationReader.getValue(fileName,"offerDetailName"));
            offerDetailItem.setOfferDetailValue(configurationReader.getValue(fileName,"offerDetailValue"));


            OfferDetailItem[] offerDetailItems = new OfferDetailItem[1];
            offerDetailItems[0] = offerDetailItem;

            PriceChangeRequestItem[] priceChangeRequestItems = new PriceChangeRequestItem[1];
            priceChangeRequestItems[0] = priceChangeRequestItem;

            //EpisysPortHandle.getEpisysPort();
            validationResult = EpisysPortHandle.getEpisysService().managePrice(priceChangeRequestItems);

            RETURN_VALUE = validationResult.getStatusCode();
            statusMessage = validationResult.getStatusMessage();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Exception in Upsert Price for a Product "+ex.getMessage());
        }
        return RETURN_VALUE;
    }
    public static void main(String[] args){
        TescoManagePrice obj = new TescoManagePrice();
        obj.deletePriceForAProduct();
    }
}
