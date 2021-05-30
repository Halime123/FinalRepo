package com.OrangeHRM.pages;

import com.OrangeHRM.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordBox;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(id = "spanMessage")
    public WebElement invalidMsg;

    @FindBy(id = "spanMessage")
    public WebElement emptyUsername;

    @FindBy(id = "spanMessage")
    public WebElement emptyPasswordName;

    public LoginPage(){
        PageFactory.initElements(driver,this);

    }
    public void login(String username, String password){
        sendText(usernameBox,username);
        sendText(passwordBox,password);

    }
    //this is a command line

    public void clickOnLoginButton(){
        click(loginBtn);
    }
    public String getErrorMessageText(){
        return invalidMsg.getText();
    }

    public String getEmptyUsernameMessage(){
        return emptyUsername.getText();
    }
    public String getEmptyPasswordMessage(){
        return emptyPasswordName.getText();
    }
}
