package com.bitrix24.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class BasePage {
    public class BasePage {
        BasePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 20);

    }
}
