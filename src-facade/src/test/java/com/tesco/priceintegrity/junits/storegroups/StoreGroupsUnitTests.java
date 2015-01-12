package com.tesco.priceintegrity.junits.storegroups;

import com.tesco.priceintegrity.common.jdbc.SQLConnection;
import com.tesco.priceintegrity.common.sql.SQLQueries;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.facade.storegroups.TescoStoreGroups;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

/**
 * Created by yd96 on 01/01/2015.
 */

public class StoreGroupsUnitTests {


    TescoStoreGroups tescoStoreGroups = new TescoStoreGroups();
    ConfigurationReader configurationReader = new ConfigurationReader();
    static Connection connection = null;

    @BeforeClass
    public static  void openConnection(){
        connection = SQLConnection.getDBConnection();
    }

    @AfterClass
    public static void closeDBConnection(){
    SQLConnection.closeDBConnection(connection);
        connection = null;
    }

    @Test
    public void testDatabaseCreate() throws SQLException {

        //Connection connection = SQLConnection.getDBConnection();

        String str_grp_name = null;
        assertEquals(0,tescoStoreGroups.createStoreTest());

        String filename = "CreateStoreGroup.config";
        String storeGroupID = configurationReader.getValue(filename,"StoreGroupID");

        try {
            PreparedStatement prepStatement = connection.prepareStatement(SQLQueries.CREATE_QUERY_STORE_GROUP);
            prepStatement.setInt(1, Integer.parseInt(storeGroupID));
            System.out.println(prepStatement.toString());

            ResultSet resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {
                str_grp_name = resultSet.getString("str_grp_name");
                System.out.println("str_grp_name: " + str_grp_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }/*finally {
            connection.close();
        }*/

//        assertEquals('D',action);
        //assertNotEquals('D', action);
        // assertEquals(0,TescoStoreGroups.createStoreTest());
        assertEquals(configurationReader.getValue(filename,"Name"), str_grp_name);

    }

    @Test
    public void testDatabaseUpsert() throws SQLException {

        String str_grp_name = null;
        String filename = "UpsertStoreGroup.config";
        //Read the store group ID from configuration file
        String storeGroupID = configurationReader.getValue(filename,"StoreGroupID");
        //Get the DB connection
       // Connection connection = SQLConnection.getDBConnection();

        //System.out.println("ID read from the prop file:" + storeGroupID);
        assertEquals(0, tescoStoreGroups.upsertStoreTest());

        try {
            PreparedStatement prepStatement = connection.prepareStatement(SQLQueries.UPSERT_QUERY_STORE_GROUP);
            prepStatement.setInt(1, Integer.parseInt(storeGroupID));
            System.out.println(prepStatement.toString());

            ResultSet resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                str_grp_name = resultSet.getString("str_grp_name");
                System.out.println("str_grp_name: " + str_grp_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }/*finally {
            connection.close();
        }*/

//        assertEquals('D',action);
        //assertNotEquals('D', action);
        assertEquals(configurationReader.getValue(filename,"Name"), str_grp_name);
    }

    @Test
    public void testDatabaseUpdate() throws SQLException {

        //Connection connection = SQLConnection.getDBConnection();
        String str_grp_name = null;
        assertEquals(0, tescoStoreGroups.updateStoreTest());
        String filename = "UpdateStoreGroup.config";
        String storeGroupID = configurationReader.getValue(filename, "StoreGroupID");

        try {
            PreparedStatement prepStatement = connection.prepareStatement(SQLQueries.UPDATE_QUERY_STORE_GROUP);
            prepStatement.setInt(1, Integer.parseInt(storeGroupID));
            System.out.println(prepStatement.toString());

            ResultSet resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                str_grp_name = resultSet.getString("str_grp_name");
                System.out.println("str_grp_name: " + str_grp_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }/*finally {
            connection.close();
        }*/

//        assertEquals('D',action);
        //assertNotEquals("STANDALONE", str_grp_name);
        //assertEquals(0, TescoStoreGroups.updateStoreTest());
        assertEquals(configurationReader.getValue(filename, "Name"), str_grp_name);

    }

    @Test
    public void testDatabaseDelete() throws SQLException {

        String action = null;

        //Check if the store group is marked as DELETE
        assertEquals(0,tescoStoreGroups.deleteStoreTest());

        String filename = "DeleteStoreGroup.config";
        String storeGroupID = configurationReader.getValue(filename,"StoreGroupID");

        //Connection connection = SQLConnection.getDBConnection();

        try {
            PreparedStatement prepStatement = connection.prepareStatement(SQLQueries.DELETE_QUERY_STORE_GROUP);
            prepStatement.setInt(1, Integer.parseInt(storeGroupID));
            System.out.println(prepStatement.toString());

            ResultSet resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                action = resultSet.getString("action");
                System.out.println("action: " + action);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }/*finally {
            connection.close();
        }*/

//        assertEquals('D',action);
        //assertNotEquals('D', action);
        //assertEquals(0,TescoStoreGroups.deleteStoreTest());
        assertEquals("D", action);

    }
}
