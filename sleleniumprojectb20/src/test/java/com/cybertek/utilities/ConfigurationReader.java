package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static{
        try{
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        }catch(IOException e){
            System.out.println("Properties file not found");
        }
    }
    public static String getProperty(String ketWord){
        return properties.getProperty(ketWord);
    }
}