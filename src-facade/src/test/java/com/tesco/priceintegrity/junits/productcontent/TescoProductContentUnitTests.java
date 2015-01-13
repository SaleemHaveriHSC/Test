package com.tesco.priceintegrity.junits.productcontent;

import com.tesco.priceintegrity.common.jdbc.SQLConnection;
import com.tesco.priceintegrity.common.sql.SQLQueries;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;
import com.tesco.priceintegrity.facade.productcontent.TescoProductContent;
import org.junit.*;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.Assert.*;

/**
 * Created by jm23 on 11/12/2014.
 */
public class TescoProductContentUnitTests {

    static Connection connection = null;
    /*Statement statement = null;
    ResultSet resultSet = null;*/

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
    public void createContentTest()
    {
        String actualResult="";
        int  statusReturnCode;
        try {
            System.out.println(Thread.currentThread().getContextClassLoader().getResource("").toURI());
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "TestResult.config";
            TescoProductContent productContentObject = new TescoProductContent();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.PRODUCT_CONTENT_SELECT_PRD_CD);
            statusReturnCode = productContentObject.createProductContent();
            preparedStatement.setString(1, productContentObject.getProductCode());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                actualResult = resultSet.getString("prd_cd");
                System.out.println("Create New value ="+actualResult);
            }
            /* System.out.println("Expected Result :" + configurationReader.getValue(fileName, "CreateProductCode"));
            System.out.println("Actual Result   :" + actualResult); */
            assertEquals(actualResult, configurationReader.getValue(fileName, "CreateProductCode"));
            assertEquals(0,statusReturnCode);
        }
        catch (java.sql.SQLException ex)
        {
            ex.getMessage();
        }catch (java.net.URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void updateContentTest()
    {
        String actualResult="";
        int  statusReturnCode;
        try {
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "TestResult.config";
            TescoProductContent productContentObject = new TescoProductContent();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.PRODUCT_CONTENT_SELECT_NEW_VALUE);
            statusReturnCode=productContentObject.updateProductContent();
            preparedStatement.setString(1, productContentObject.getProductCode());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                actualResult = resultSet.getString("new_value");
            }
            /* System.out.println("Expected Result :" + configurationReader.getValue(fileName, "UpdateContentValue"));
            System.out.println("Actual Result   :" + actualResult); */
            assertEquals(actualResult, configurationReader.getValue(fileName, "UpdateContentValue"));
            assertEquals(0,statusReturnCode);
        }
        catch (java.sql.SQLException ex)
        {
            ex.getMessage();
        }
    }

    @Test
    public void deleteContentTest()
    {
        String actualResult="";
        int  statusReturnCode;
        try {
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "TestResult.config";
            TescoProductContent productContentObject = new TescoProductContent();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.PRODUCT_CONTENT_SELECT_NEW_VALUE);
            statusReturnCode=productContentObject.deleteProductContent();
            preparedStatement.setString(1, productContentObject.getProductCode());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                actualResult = resultSet.getString("new_value");
            }
            /* System.out.println("Expected Result :" + configurationReader.getValue(fileName, "DeleteContentValue"));
            System.out.println("Actual Result   :" + actualResult); */
            //assertEquals(actualResult, configurationReader.getValue(fileName, "DeleteContentValue"));
            assertNotSame(actualResult, configurationReader.getValue(fileName, "DeleteContentValue"));
            assertEquals(0,statusReturnCode);
        }
        catch (java.sql.SQLException ex)
        {
            ex.getMessage();
        }
    }

    @Test
    public void upsertContentTest()
    {
        String actualResult="";
        int  statusReturnCode;
        try {
            ConfigurationReader configurationReader = new ConfigurationReader();
            String fileName = "TestResult.config";
            TescoProductContent productContentObject = new TescoProductContent();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.PRODUCT_CONTENT_SELECT_PRD_CD);
            statusReturnCode=productContentObject.upsertProductContent();
            preparedStatement.setString(1, productContentObject.getProductCode());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                actualResult = resultSet.getString("prd_cd");
            }
            /*System.out.println("Expected Result :" + configurationReader.getValue(fileName, "UpsertProductCode"));
            System.out.println("Actual Result   :" + actualResult);*/
            assertEquals(actualResult, configurationReader.getValue(fileName, "UpsertProductCode"));
            assertEquals(0,statusReturnCode);
        }
        catch (java.sql.SQLException ex)
        {
            ex.getMessage();
        }

    }
}
