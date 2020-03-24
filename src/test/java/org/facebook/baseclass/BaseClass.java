package org.facebook.baseclass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.facebook.utility.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getBaseURL();
    public String userName = readConfig.getUserName();
    public String password = readConfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
        driver = new ChromeDriver();
        logger = Logger.getLogger("facebook");
        PropertyConfigurator.configure("log4j.properties");
        driver.get(baseURL);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
