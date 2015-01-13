package com.tesco.priceintegrity.facade.productcontent;

import com.tesco.priceintegrity.common.episyslocator.EpisysPortHandle;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.episysapi.*;
import org.junit.Test;
import java.sql.*;

/**
 * Created by jm23 on 11/12/2014. <br>
 *
 * Writes below methods to insert/modify the product content details as per the EPISYS API <br>
 *
 * Below are the method details <br>
 * 1. Create product content <br>
 * 2. Update Product content <br>
 * 3. Delete Product content <br>
 * 5. Upsert Product content <br>
 * <br>
 */

public class TescoProductContent {

     String contentNewValue = "";
     Integer  messageType;
     String productCode = "";

   public int createProductContent() {

       ValidationResult result = null;

       try {
           ConfigurationReader configurationReader = new ConfigurationReader();
           String fileName = "ProductContentCreateData.config";
           ContentFieldItem contentFieldItem = new ContentFieldItem();
           //Content Field Items
           contentFieldItem.setComment(configurationReader.getValue(fileName, "comment"));
           contentFieldItem.setContentApproveValue(configurationReader.getValue(fileName, "contentApproveValue"));
           contentFieldItem.setContentFieldName(configurationReader.getValue(fileName, "contentFieldName"));
           contentFieldItem.setContentNewValue(configurationReader.getValue(fileName, "ContentNewValue"));
           setContentNewValue(configurationReader.getValue(fileName,"ContentNewValue"));

           //Content Data Items
           ContentDataItem contentDataItem = new ContentDataItem();
           contentDataItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName,"messageType")));
           setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
           contentDataItem.setProductCode(configurationReader.getValue(fileName, "ProductCode"));
           setProductCode(configurationReader.getValue(fileName, "ProductCode"));
           contentDataItem.setProductTypeCode(configurationReader.getValue(fileName,"productTypeCode"));
           contentDataItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
           contentDataItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));

           //CONTENT FIELD CREATION
           ContentFieldItem[] contentFieldItems = new ContentFieldItem[1];
           contentFieldItems[0] = contentFieldItem;

           contentDataItem.setFieldItems(contentFieldItems);
           //CONTENT DATA CREATION
           ContentDataItem[] contentDataItems = new ContentDataItem[1];
           contentDataItems[0] = contentDataItem;
           result = EpisysPortHandle.getEpisysService().updateContent(contentDataItems);
        }
         catch (java.rmi.RemoteException ex) {
             System.out.println("Create Product Content error message is"+ex.getMessage());
            ex.printStackTrace();
        }
       System.out.println("Create code is ="+result.getStatusCode()+" Message = "+result.getStatusMessage());
         return result.getStatusCode();

    }
    public int updateProductContent() {

        ValidationResult result = null;

        try {
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "ProductContentUpdateData.config";
            ContentFieldItem contentFieldItem = new ContentFieldItem();
            //Content Field Items
            contentFieldItem.setComment(configurationReader.getValue(fileName, "comment"));
            contentFieldItem.setContentApproveValue(configurationReader.getValue(fileName, "contentApproveValue"));
            contentFieldItem.setContentFieldName(configurationReader.getValue(fileName, "contentFieldName"));
            contentFieldItem.setContentNewValue(configurationReader.getValue(fileName, "ContentNewValue"));
            setContentNewValue(configurationReader.getValue(fileName,"ContentNewValue"));

            //Content Data Items
            ContentDataItem contentDataItem = new ContentDataItem();
            contentDataItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            contentDataItem.setProductCode(configurationReader.getValue(fileName, "ProductCode"));
            setProductCode(configurationReader.getValue(fileName, "ProductCode"));
            contentDataItem.setProductTypeCode(configurationReader.getValue(fileName,"productTypeCode"));
            contentDataItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            contentDataItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));

            //CONTENT FIELD CREATION
            ContentFieldItem[] contentFieldItems = new ContentFieldItem[1];
            contentFieldItems[0] = contentFieldItem;

            contentDataItem.setFieldItems(contentFieldItems);
            //CONTENT DATA CREATION
            ContentDataItem[] contentDataItems = new ContentDataItem[1];
            contentDataItems[0] = contentDataItem;
            result = EpisysPortHandle.getEpisysService().updateContent(contentDataItems);

        } catch (java.rmi.RemoteException ex) {
            System.out.println("Update Product Content error message is"+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("update code is ="+result.getStatusCode()+" Message = "+result.getStatusMessage());
        return result.getStatusCode();
    }
    public int deleteProductContent() {

        ValidationResult result = null;

        try {
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "ProductContentDeleteData.config";
            ContentFieldItem contentFieldItem = new ContentFieldItem();
            //Content Field Items
            contentFieldItem.setComment(configurationReader.getValue(fileName, "comment"));
            contentFieldItem.setContentApproveValue(configurationReader.getValue(fileName, "contentApproveValue"));
            contentFieldItem.setContentFieldName(configurationReader.getValue(fileName, "contentFieldName"));
            contentFieldItem.setContentNewValue(configurationReader.getValue(fileName, "ContentNewValue"));
            setContentNewValue(configurationReader.getValue(fileName,"ContentNewValue"));

            //Content Data Items
            ContentDataItem contentDataItem = new ContentDataItem();
            contentDataItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName,"messageType")));
            setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            contentDataItem.setProductCode(configurationReader.getValue(fileName, "ProductCode"));
            setProductCode(configurationReader.getValue(fileName, "ProductCode"));
            contentDataItem.setProductTypeCode(configurationReader.getValue(fileName,"productTypeCode"));
            contentDataItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            contentDataItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));

            //CONTENT FIELD CREATION
            ContentFieldItem[] contentFieldItems = new ContentFieldItem[1];
            contentFieldItems[0] = contentFieldItem;

            contentDataItem.setFieldItems(contentFieldItems);
            //CONTENT DATA CREATION
            ContentDataItem[] contentDataItems = new ContentDataItem[1];
            contentDataItems[0] = contentDataItem;
            result = EpisysPortHandle.getEpisysService().deleteContent(contentDataItems);

        }  catch (java.rmi.RemoteException ex) {
            System.out.println("Delete Product Content error message is"+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Delete code is ="+result.getStatusCode()+" Message = "+result.getStatusMessage());
        return result.getStatusCode();
    }
    public int upsertProductContent() {

        ValidationResult result = null;

        try {
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "ProductContentUpsertData.config";
            ContentFieldItem contentFieldItem = new ContentFieldItem();
            //Content Field Items
            contentFieldItem.setComment(configurationReader.getValue(fileName, "comment"));
            contentFieldItem.setContentApproveValue(configurationReader.getValue(fileName, "contentApproveValue"));
            contentFieldItem.setContentFieldName(configurationReader.getValue(fileName, "contentFieldName"));
            contentFieldItem.setContentNewValue(configurationReader.getValue(fileName, "ContentNewValue"));
            setContentNewValue(configurationReader.getValue(fileName,"ContentNewValue"));

            //Content Data Items
            ContentDataItem contentDataItem = new ContentDataItem();
            contentDataItem.setMessageType(Integer.parseInt(configurationReader.getValue(fileName,"messageType")));
            setMessageType(Integer.parseInt(configurationReader.getValue(fileName, "messageType")));
            contentDataItem.setProductCode(configurationReader.getValue(fileName, "ProductCode"));
            setProductCode(configurationReader.getValue(fileName, "ProductCode"));
            contentDataItem.setProductTypeCode(configurationReader.getValue(fileName,"productTypeCode"));
            contentDataItem.setSourceIPAddress(configurationReader.getValue(fileName, "sourceIPAddress"));
            contentDataItem.setSrcSystem(configurationReader.getValue(fileName, "srcSystem"));

            //CONTENT FIELD CREATION
            ContentFieldItem[] contentFieldItems = new ContentFieldItem[1];
            contentFieldItems[0] = contentFieldItem;

            contentDataItem.setFieldItems(contentFieldItems);
            //CONTENT DATA CREATION
            ContentDataItem[] contentDataItems = new ContentDataItem[1];
            contentDataItems[0] = contentDataItem;
            result = EpisysPortHandle.getEpisysService().updateContent(contentDataItems);
        }
         catch (java.rmi.RemoteException ex) {
             System.out.println("Upsert Product Content error message is"+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Upsert code is ="+result.getStatusCode()+" Message = "+result.getStatusMessage());
        return result.getStatusCode();
    }
    public  void setProductCode(String ProductCode)
    {
        productCode=ProductCode;
    }
    public String getProductCode()
    {
        return productCode;
    }
    public void setContentNewValue(String ContentNewValue)
    {
        contentNewValue=ContentNewValue;
    }
    public String getContentNewValue()
    {
        return contentNewValue;
    }
    public void setMessageType(Integer messageTypeValue)
    {
        messageType= messageTypeValue;
    }
    public Integer getMessageType()
    {
        return messageType;
    }

    /* public static void main(String[] args){
        ProductContent obj = new ProductContent();
        obj.updateProductContent(); } */
}
