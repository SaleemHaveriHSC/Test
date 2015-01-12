package com.tesco.priceintegrity.common.jdbc;

import com.tesco.priceintegrity.common.constants.Constants;
import com.tesco.priceintegrity.common.tools.ConfigurationReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hb41 on 12/12/2014.
 */
public class SQLConnection {

    private static String jdbcDriver;
    private static String databaseURL;
    private static String dbUsername;
    private static String dbPassword;
    //private static Connection connection;

    private static void getDBParameters() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        String fileName = Constants.JDBC_CONFIG_FILE;

        jdbcDriver = (configurationReader.getValue(fileName, "jdbcDriver"));
        databaseURL = (configurationReader.getValue(fileName, "databaseURL"));
        dbUsername = (configurationReader.getValue(fileName, "dbUsername"));
        dbPassword = (configurationReader.getValue(fileName, "dbPassword"));
    }

    public static Connection getDBConnection(){
        Connection connection = null;
        try {
            if(connection == null || connection.isClosed()) {
                getDBParameters();
                Class.forName(jdbcDriver);
                connection = (DriverManager.getConnection(databaseURL, dbUsername, dbPassword));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return connection;
    }

/*    public static void main(String[] args){
        Connection connection = getDBConnection();
        closeDBConnection(connection);
    }*/

    public static void closeDBConnection(Connection connection){
        try {
            if(connection != null || connection.isClosed() == false) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}