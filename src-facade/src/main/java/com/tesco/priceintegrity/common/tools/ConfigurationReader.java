package com.tesco.priceintegrity.common.tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by hb41 on 24/12/2014.
 */
public class ConfigurationReader {

    private static Properties properties = null;
    private static String inputFileName;

    public Properties createPropertyFileReader(String fileName) {
/*        if (properties != null)
            return properties;*/

        inputFileName = fileName;
        properties = new Properties();
        StringBuilder filePath = new StringBuilder("D:\\PriceIntegrity\\src-facade\\src\\main\\java\\com\\tesco\\priceintegrity\\common\\resources");
        filePath.append("\\").append(fileName);
        try {
            InputStream inputStream = new FileInputStream(filePath.toString());
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return properties;
    }

    public String getValue(String fileName, String inputString) {
        if (properties == null || inputFileName != fileName) {
            properties = createPropertyFileReader(fileName);
        }
        return properties.getProperty(inputString);
    }

    public static void main(String[] args) {
        ConfigurationReader configurationReader = new ConfigurationReader();
        String fileName = "JDBC.config";

        System.out.println("JDBC Driver     : " + configurationReader.getValue(fileName,"jdbcDriver"));
        System.out.println("DB URL          : " + configurationReader.getValue(fileName,"databaseURL"));
        System.out.println("DB Username     : " + configurationReader.getValue(fileName,"dbUsername"));
        System.out.println("DB Passwrod     : " + configurationReader.getValue(fileName,"dbPassword"));
    }
}
