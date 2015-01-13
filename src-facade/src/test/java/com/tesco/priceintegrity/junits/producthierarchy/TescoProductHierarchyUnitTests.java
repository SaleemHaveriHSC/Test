package com.tesco.priceintegrity.junits.producthierarchy;

import com.tesco.priceintegrity.common.jdbc.SQLConnection;
import com.tesco.priceintegrity.common.sql.SQLQueries;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.facade.producthierarchy.TescoProductHierarchy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by hb41 on 11/12/2014.
 */
public class TescoProductHierarchyUnitTests {
    TescoProductHierarchy productHierarchy = new TescoProductHierarchy();
    static Connection connection;

    @BeforeClass
    public static void setUpTestEnv () {
        connection = SQLConnection.getDBConnection();
    }

    @AfterClass
    public static void cleanUpTestEnv() {
        SQLConnection.closeDBConnection(connection);
        connection = null;
    }

    @Test
    public void createProductHierarchyTest(){
        ConfigurationReader configurationReader = new ConfigurationReader();
        ResultSet resultSet;
        String fileName = "CreateProdHierItemTest.config";
        int noRows = 0;
        PreparedStatement createStatement;

        try {
            createStatement = connection.prepareStatement(SQLQueries.CREATE_QUERY_PRODUCT_HIERARCHY);
            createStatement.setString(1,configurationReader.getValue(fileName, "productCode"));
            resultSet = createStatement.executeQuery();

            while (resultSet.next()) {
                noRows = resultSet.getInt("noRows");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(0, noRows);

        assertEquals("0", productHierarchy.createProductHierarchy());

        try {
            createStatement = connection.prepareStatement(SQLQueries.CREATE_QUERY_PRODUCT_HIERARCHY);
            createStatement.setString(1, configurationReader.getValue(fileName, "productCode"));
            resultSet = createStatement.executeQuery();

            while (resultSet.next()) {
                noRows = resultSet.getInt("noRows");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(1, noRows);
    }

    @Test
    public  void updateProductHierarchyTest() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        ResultSet resultSet;
        String fileName = "UpdateProdHierItemTest.config";
        PreparedStatement updateStatement;
        String actionIndicator = null;

        assertEquals("0", productHierarchy.updateProductHierarchy());

        try {
            updateStatement = connection.prepareStatement(SQLQueries.UPDATE_QUERY_PRODUCT_HIERARCHY);
            updateStatement.setString(1,configurationReader.getValue(fileName, "productCode"));
            resultSet = updateStatement.executeQuery();

            while (resultSet.next()) {
                actionIndicator = resultSet.getString("action");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("U", actionIndicator);
    }

    @Test
    public void deleteProductHierarchyTest() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        ResultSet resultSet;
        PreparedStatement deleteStatement;
        String actionIndicator = null;
        String fileName = "DeleteProdHierItemTest.config";

        assertEquals("0", productHierarchy.deleteProductHierarchy());

        try {
            deleteStatement = connection.prepareStatement(SQLQueries.DELETE_QUERY_PRODUCT_HIERARCHY);
            deleteStatement.setString(1,configurationReader.getValue(fileName, "productCode"));
            resultSet = deleteStatement.executeQuery();

            while (resultSet.next()) {
                actionIndicator = resultSet.getString("action");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("D",actionIndicator);
    }

    @Test
    public void upsertProductHierarchyTest() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        ResultSet resultSet;
        PreparedStatement upserteStatement;
        String actionIndicator = null;
        String fileName = "UpsertProdHierItemTest.config";

        assertEquals("0", productHierarchy.upsertProductHierarchy());

        try {
            upserteStatement = connection.prepareStatement(SQLQueries.UPSERT_QUERY_PRODUCT_HIERARCHY);
            upserteStatement.setString(1, configurationReader.getValue(fileName, "productCode"));
            resultSet = upserteStatement.executeQuery();

            while (resultSet.next()) {
                actionIndicator = resultSet.getString("action");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotEquals("D", actionIndicator);
    }

}
