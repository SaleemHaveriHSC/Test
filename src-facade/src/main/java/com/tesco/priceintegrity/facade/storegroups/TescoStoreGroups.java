package com.tesco.priceintegrity.facade.storegroups;

import com.tesco.priceintegrity.common.episyslocator.EpisysPortHandle;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.episysapi.StoreGroupDeletionItem;
import com.tesco.priceintegrity.episysapi.StoreGroupInfoItem;
import com.tesco.priceintegrity.episysapi.ValidationResult;

import java.io.InputStream;
import java.rmi.RemoteException;

import static java.lang.System.out;

/**
 * Created by yd96 on 01/01/2015.
 */
public class TescoStoreGroups {

    ConfigurationReader configurationReader = new ConfigurationReader();
    InputStream input = null;


    public void serviceInitialise(){

        EpisysPortHandle.getEpisysPort();
    }


    public int createStoreTest() {

        //User []users = new User[length];
        int i =0;
        serviceInitialise();

        int status = -1;

        String filename = "CreateStoreGroup.config";
        StoreGroupInfoItem storeGroupInfoItem = new StoreGroupInfoItem();

        String endDate = configurationReader.getValue(filename, "EndDate");
        String name = configurationReader.getValue(filename,"Name");
        String srcSystem = configurationReader.getValue(filename,"SrcSystem");
        String startDate = configurationReader.getValue(filename,"StartDate");
        String storeGroupID = configurationReader.getValue(filename,"StoreGroupID");
        String storeGroupStatus = configurationReader.getValue(filename,"StoreGroupStatus");
        String storeGroupType = configurationReader.getValue(filename,"StoreGroupType");

        storeGroupInfoItem.setEndDate(endDate);
        storeGroupInfoItem.setName(name);
        storeGroupInfoItem.setSrcSystem(srcSystem);
        storeGroupInfoItem.setStartDate(startDate);
        storeGroupInfoItem.setStoreGroupID(storeGroupID);
        storeGroupInfoItem.setStoreGroupStatus(storeGroupStatus);
        storeGroupInfoItem.setStoreGroupType(storeGroupType);

        StoreGroupInfoItem[] sgInsertArray = new StoreGroupInfoItem[1];
        sgInsertArray[0] = storeGroupInfoItem;

        try {
            ValidationResult vrNumber = EpisysPortHandle.getEpisysService().createStoreGroup(sgInsertArray);
            out.println("Message" + vrNumber.getStatusMessage());
            status = vrNumber.getStatusCode();
        } catch (RemoteException ex) {
            ex.printStackTrace();
            out.println("Exception in Create Store Group method:" + ex.getMessage());
        }
        return (status);
//        }
    }

    public int updateStoreTest() {

        serviceInitialise();
        int status = -1;
        String filename = "UpdateStoreGroup.config";
        StoreGroupInfoItem storeGroupInfoItem = new StoreGroupInfoItem();

        String endDate = configurationReader.getValue(filename, "EndDate");
        String name = configurationReader.getValue(filename,"Name");
        String srcSystem = configurationReader.getValue(filename,"SrcSystem");
        String startDate = configurationReader.getValue(filename,"StartDate");
        int storeGroupID = Integer.parseInt(configurationReader.getValue(filename,"StoreGroupID"));
        String storeGroupStatus = configurationReader.getValue(filename,"StoreGroupStatus");
        String storeGroupType = configurationReader.getValue(filename,"StoreGroupType");

        storeGroupInfoItem.setEndDate(endDate);
        storeGroupInfoItem.setName(name);
        storeGroupInfoItem.setSrcSystem(srcSystem);
        storeGroupInfoItem.setStartDate(startDate);
        storeGroupInfoItem.setStoreGroupID(String.valueOf(storeGroupID));
        storeGroupInfoItem.setStoreGroupStatus(storeGroupStatus);
        storeGroupInfoItem.setStoreGroupType(storeGroupType);

        StoreGroupInfoItem[] storeGroupInfoItems = new StoreGroupInfoItem[1];
        storeGroupInfoItems[0] = storeGroupInfoItem;

        try
        {
            ValidationResult vResult = EpisysPortHandle.getEpisysService().updateStoreGroup(storeGroupInfoItems);
            out.println("Message:" + vResult.getStatusMessage());
            status =  vResult.getStatusCode();
        } catch (RemoteException ex) {
            ex.printStackTrace();
            out.println ("Exception in Update Store Group method:" + ex.getMessage());
        }
        return (status);

    }

    public int upsertStoreTest() {

        serviceInitialise();
        int status = -1;
        String filename = "UpsertStoreGroup.config";
        StoreGroupInfoItem storeGroupInfoItem = new StoreGroupInfoItem();

        String endDate = configurationReader.getValue(filename, "EndDate");
        String name = configurationReader.getValue(filename,"Name");
        String srcSystem = configurationReader.getValue(filename,"SrcSystem");
        String startDate = configurationReader.getValue(filename,"StartDate");
        int storeGroupID = Integer.parseInt(configurationReader.getValue(filename,"StoreGroupID"));
        String storeGroupStatus = configurationReader.getValue(filename,"StoreGroupStatus");
        String storeGroupType = configurationReader.getValue(filename,"StoreGroupType");

        storeGroupInfoItem.setEndDate(endDate);
        storeGroupInfoItem.setName(name);
        storeGroupInfoItem.setSrcSystem(srcSystem);
        storeGroupInfoItem.setStartDate(startDate);
        storeGroupInfoItem.setStoreGroupID(String.valueOf(storeGroupID));
        storeGroupInfoItem.setStoreGroupStatus(storeGroupStatus);
        storeGroupInfoItem.setStoreGroupType(storeGroupType);

        StoreGroupInfoItem[] storeGroupInfoItems = new StoreGroupInfoItem[1];
        storeGroupInfoItems[0] = storeGroupInfoItem;

        try {
            ValidationResult vrNumber = EpisysPortHandle.getEpisysService().upsertStoreGroup(storeGroupInfoItems);
            out.println("Message" + vrNumber.getStatusMessage());
            return vrNumber.getStatusCode();
        }catch (RemoteException ex) {
            ex.printStackTrace();
            out.println ("Exception in Upsert Store Group method:" + ex.getMessage());
        }
        return (status);

    }

    public int deleteStoreTest() {

        serviceInitialise();
        int status = -1;
        String filename = "DeleteStoreGroup.config";

        StoreGroupDeletionItem storeGroupDeletionItem = new StoreGroupDeletionItem();

        String srcSystem = configurationReader.getValue(filename, "SrcSystem");
        int storeGroupID = Integer.parseInt(configurationReader.getValue(filename,"StoreGroupID"));

        storeGroupDeletionItem.setSrcSystem(srcSystem);
        storeGroupDeletionItem.setStoreGroupID(String.valueOf(storeGroupID));

        StoreGroupDeletionItem[] sgDeleteArray = new StoreGroupDeletionItem[1];
        sgDeleteArray[0] = storeGroupDeletionItem;

        try {
            ValidationResult vResult = EpisysPortHandle.getEpisysService().deleteStoreGroup(sgDeleteArray);
            out.println("Message:" + vResult.getStatusMessage());
            return vResult.getStatusCode();
        }catch (RemoteException ex) {
            ex.printStackTrace();
            out.println ("Exception in Delete Store Group method:" + ex.getMessage());
        }
        return (status);


    }
}
