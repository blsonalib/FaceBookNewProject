package com.facebook.testcases;
import org.facbook.pageobject.LoginPage;
import org.facebook.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
    @Test
    public void loginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail(userName);
        logger.info("Entered username");
         loginPage.setPassword(password);
       logger.info("Entered password");
        loginPage.clickLoginButton();
       logger.info("Click login button");
        if(driver.getTitle().equals("Facebook")){
            Assert.assertTrue(true);
            logger.info("title is found");
        }
        else {
            Assert.assertTrue(false);
            logger.info("title not found");
        }
    }
}
