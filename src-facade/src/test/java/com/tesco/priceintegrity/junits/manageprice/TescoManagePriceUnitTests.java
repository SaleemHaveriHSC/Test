package com.tesco.priceintegrity.junits.manageprice;

import com.tesco.priceintegrity.common.jdbc.SQLConnection;
import com.tesco.priceintegrity.common.sql.SQLQueries;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.facade.manageprice.TescoManagePrice;
import org.junit.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by AC37 on 08/12/2014.
 */
public class TescoManagePriceUnitTests {

    TescoManagePrice priceObject = new TescoManagePrice();

    static Connection connection = null;

    @BeforeClass
    public static void setUpTestEnv(){
        connection = SQLConnection.getDBConnection();
    }

    @AfterClass
    public static void cleanUpTestEnv(){
        SQLConnection.closeDBConnection(connection);
        connection = null;
    }

    //@Ignore
    @Test
    public void createPriceTest(){
        ConfigurationReader configurationReader = new ConfigurationReader();
        java.lang.String fileName = "CreatePrice.config";
        int returnValue = priceObject.createPriceForAProduct();
        float dbPrice=0f;
        float expectedResult = Float.parseFloat(configurationReader.getValue(fileName,"price"));
        Integer priceUID = Integer.parseInt(configurationReader.getValue(fileName,"priceUID"));
        java.lang.String sqlQuery = SQLQueries.CHECK_PRODUCT_PRICE;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,priceUID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                dbPrice = resultSet.getFloat("fld_val");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        /*finally {
            preparedStatement.close();}*/
        //Assert.assertEquals(java.lang.String.valueOf(expectedResult), java.lang.String.valueOf(dbPrice));
        Assert.assertEquals(0, returnValue);
        //System.out.println("Expected Result: " + expectedResult);
        //System.out.println("Actual Result: " + dbPrice);
    }
    //@Ignore
    @Test
    public void updatePriceTest() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        java.lang.String fileName = "UpdatePrice.config";
        priceObject.createPriceForAProduct();
        int returnValue = priceObject.updatePriceForAProduct();
        float dbPrice=0f;
        float expectedResult = Float.parseFloat(configurationReader.getValue(fileName,"price"));
        Integer priceUID = Integer.parseInt(configurationReader.getValue(fileName,"priceUID"));
        java.lang.String sqlQuery = SQLQueries.CHECK_PRODUCT_PRICE;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,priceUID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                dbPrice = resultSet.getFloat("fld_val");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertEquals(0, returnValue);

        }

    //@Ignore
    @Test
    public void deletePriceTest(){
        ConfigurationReader configurationReader = new ConfigurationReader();
        java.lang.String fileName = "DeletePrice.config";
        priceObject.createPriceForAProduct();
        int returnValue = priceObject.deletePriceForAProduct();

        int count = 0;
        Integer priceUID = Integer.parseInt(configurationReader.getValue(fileName, "priceUID"));
        java.lang.String sqlQuery = SQLQueries.CHECK_PRICE_COUNT;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,priceUID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                count = resultSet.getInt("count");
            }
            preparedStatement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Assert.assertEquals(0,returnValue);
        //System.out.println(returnValue);
    }
   // @Ignore
    @Test
    public void upsertPriceTest(){
        ConfigurationReader configurationReader = new ConfigurationReader();
        java.lang.String fileName = "UpsertPrice.config";
        int returnValue = priceObject.upsertPriceForAProduct();
        float dbPrice=0f;
        float expectedResult = Float.parseFloat(configurationReader.getValue(fileName,"price"));
        Integer priceUID = Integer.parseInt(configurationReader.getValue(fileName, "priceUID"));
        java.lang.String sqlQuery = SQLQueries.CHECK_PRODUCT_PRICE;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,priceUID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                dbPrice = resultSet.getFloat("fld_val");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Assert.assertEquals(0,returnValue);
        //Assert.assertEquals(java.lang.String.valueOf(expectedResult), java.lang.String.valueOf(dbPrice));
        }

}

