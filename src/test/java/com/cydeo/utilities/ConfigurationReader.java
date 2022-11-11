package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        FileInputStream file = null;
        try {
            file = new FileInputStream("configuration.properties");
            properties.load(file);

            file.close();
        } catch (IOException e) {
            System.out.println("error occured while using configuration file");
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
