package com.bitrix24.Pages;

import com.Bitrix24.Utilities.ConfigurationReader;
import com.Bitrix24.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends BasePage {



    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public WebElement enterUsername() {
        return username;
    }

    public WebElement enterPassword() {
        return password;
    }

    public WebElement clickSubmitButton() {
        return submitButton;
    }

    public void browseLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    public void login(String UserName, String Password){
        wait.until(ExpectedConditions.visibilityOf(enterUsername())).sendKeys(UserName);
        wait.until(ExpectedConditions.visibilityOf(enterPassword())).sendKeys(Password);
        wait.until(ExpectedConditions.elementToBeClickable(clickSubmitButton())).click();


    }

    public void loginFromConfig(){
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(ConfigurationReader.getProperty("username"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

    }


}
