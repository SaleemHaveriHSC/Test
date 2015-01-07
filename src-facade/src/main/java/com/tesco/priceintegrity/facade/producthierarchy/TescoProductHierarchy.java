package com.tesco.priceintegrity.facade.producthierarchy;

import com.tesco.priceintegrity.common.episyslocator.EpisysPortHandle;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.episysapi.ProductHierarchyItem;
import com.tesco.priceintegrity.episysapi.ValidationResult;

/**
 * Created by hb41 on 10/12/2014.
 */
public class TescoProductHierarchy {
    private ProductHierarchyItem[] prodHierItemList;

    public void initialize(int sizeOfProdHierItemList ) {
        EpisysPortHandle.getEpisysPort();
        prodHierItemList = new ProductHierarchyItem[sizeOfProdHierItemList];
    }

    public void buildProdHierarchyItemList(int itemNumber, String prodDescription, int action, String parentProductCode,
                                           String parentTypeCode, String productCode, String productTypeCode,
                                           String sourceIPAddress, String srcSystem) {
        prodHierItemList[itemNumber] = new ProductHierarchyItem();
        prodHierItemList[itemNumber].setDescription(prodDescription);
        prodHierItemList[itemNumber].setMessageType(action);
        prodHierItemList[itemNumber].setParentProductCode(parentProductCode);
        prodHierItemList[itemNumber].setParentTypeCode(parentTypeCode);
        prodHierItemList[itemNumber].setProductCode(productCode);
        prodHierItemList[itemNumber].setProductTypeCode(productTypeCode);
        prodHierItemList[itemNumber].setSourceIPAddress(sourceIPAddress);
        prodHierItemList[itemNumber].setSrcSystem(srcSystem);
    }

    public String processProductHierarchy() {
        ValidationResult resultSet;
        String statusMsg = null;
        try {
            resultSet = EpisysPortHandle.getEpisysService().manageProductHierarchy(prodHierItemList);
            statusMsg = resultSet.getStatusCode().toString();
        }catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
        return (statusMsg);
    }


    public String createProductHierarchy() {
        String statusMsg;
        String prodDescription;
        String parentProductCode;
        String parentTypeCode;
        String productCode;
        String productTypeCode;
        String sourceIPAddress;
        String srcSystem;

        int NO_OF_PRODUCT_HIERARCHY_ITEMS = 1;
        this.initialize(NO_OF_PRODUCT_HIERARCHY_ITEMS);

        ConfigurationReader configurationReader = new ConfigurationReader();
        String fileName = "CreateProdHierItemTest.config";

        prodDescription = configurationReader.getValue(fileName, "prodDescription");
        parentProductCode = configurationReader.getValue(fileName, "parentProductCode");
        parentTypeCode = configurationReader.getValue(fileName, "parentTypeCode");
        productCode = configurationReader.getValue(fileName, "productCode");
        productTypeCode = configurationReader.getValue(fileName, "productTypeCode");
        sourceIPAddress = configurationReader.getValue(fileName, "sourceIPAddress");
        srcSystem = configurationReader.getValue(fileName, "srcSystem");

        this.buildProdHierarchyItemList(0, prodDescription, 1, parentProductCode, parentTypeCode,
                productCode, productTypeCode, sourceIPAddress, srcSystem);

        statusMsg = this.processProductHierarchy();

        return (statusMsg);
    }

    public String deleteProductHierarchy() {
        String statusMsg;
        String productCode;
        String productTypeCode;
        String srcSystem;
        String prodDescription;
        String parentProductCode;
        String parentTypeCode;
        String sourceIPAddress;

        this.initialize(1);

        ConfigurationReader configurationReader = new ConfigurationReader();
        String fileName = "DeleteProdHierItemTest.config";

        prodDescription = configurationReader.getValue(fileName, "prodDescription");
        parentProductCode = configurationReader.getValue(fileName, "parentProductCode");
        parentTypeCode = configurationReader.getValue(fileName, "parentTypeCode");
        productCode = configurationReader.getValue(fileName, "productCode");
        productTypeCode = configurationReader.getValue(fileName, "productTypeCode");
        sourceIPAddress = configurationReader.getValue(fileName, "sourceIPAddress");
        srcSystem = configurationReader.getValue(fileName, "srcSystem");

        this.buildProdHierarchyItemList(0, prodDescription, 3, parentProductCode, parentTypeCode,
                productCode, productTypeCode, sourceIPAddress, srcSystem);

        statusMsg = this.processProductHierarchy();

        return (statusMsg);
    }

    public String updateProductHierarchy() {
        String statusMsg;
        String productCode;
        String productTypeCode;
        String srcSystem;
        String prodDescription;
        String parentProductCode;
        String parentTypeCode;
        String sourceIPAddress;

        this.initialize(1);

        ConfigurationReader configurationReader = new ConfigurationReader();
        String fileName = "UpdateProdHierItemTest.config";

        prodDescription = configurationReader.getValue(fileName, "prodDescription");
        parentProductCode = configurationReader.getValue(fileName, "parentProductCode");
        parentTypeCode = configurationReader.getValue(fileName, "parentTypeCode");
        productCode = configurationReader.getValue(fileName, "productCode");
        productTypeCode = configurationReader.getValue(fileName, "productTypeCode");
        sourceIPAddress = configurationReader.getValue(fileName, "sourceIPAddress");
        srcSystem = configurationReader.getValue(fileName, "srcSystem");

        this.buildProdHierarchyItemList(0, prodDescription, 2, parentProductCode, parentTypeCode,
                productCode, productTypeCode, sourceIPAddress, srcSystem);

        statusMsg = this.processProductHierarchy();

        return (statusMsg);
    }

    public String upsertProductHierarchy() {
        String statusMsg;
        String productCode;
        String productTypeCode;
        String srcSystem;
        String prodDescription;
        String parentProductCode;
        String parentTypeCode;
        String sourceIPAddress;

        this.initialize(1);

        ConfigurationReader configurationReader = new ConfigurationReader();
        String fileName = "UpsertProdHierItemTest.config";

        prodDescription = configurationReader.getValue(fileName, "prodDescription");
        parentProductCode = configurationReader.getValue(fileName, "parentProductCode");
        parentTypeCode = configurationReader.getValue(fileName, "parentTypeCode");
        productCode = configurationReader.getValue(fileName, "productCode");
        productTypeCode = configurationReader.getValue(fileName, "productTypeCode");
        sourceIPAddress = configurationReader.getValue(fileName, "sourceIPAddress");
        srcSystem = configurationReader.getValue(fileName, "srcSystem");

        this.buildProdHierarchyItemList(0, prodDescription, 5, parentProductCode, parentTypeCode,
                productCode, productTypeCode, sourceIPAddress, srcSystem);

        statusMsg = this.processProductHierarchy();

        return (statusMsg);
    }

}