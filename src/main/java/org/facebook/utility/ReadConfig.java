package org.facebook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
   Properties properties ;
   File srcFile = new File("/Users/sonalibankar/Documents/FacebookProject/Configuration/config.properties");
   {
        try {
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
   public String getBaseURL(){
      String baseUrl = properties.getProperty("baseURL");
      return baseUrl;
   }
   public String getUserName(){
       String userName = properties.getProperty("userName");
       return userName;
   }
   public String getPassword(){
       String password = properties.getProperty("password");
       return password;
   }
   public String getChromePath(){
       String chromePath = properties.getProperty("chromePath");
       return chromePath;
   }
   public String getGeckoPath(){
       String geckoPath = properties.getProperty("geckoPath");
       return geckoPath;
   }
}
