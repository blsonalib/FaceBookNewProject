package org.facbook.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement password;
    @FindBy(id = "u_0_b")
    private WebElement loginButton;
    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    public void setEmail(String userName){
        email.sendKeys(userName);
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}
