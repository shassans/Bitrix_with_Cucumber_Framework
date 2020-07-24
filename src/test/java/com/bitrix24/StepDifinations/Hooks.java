package com.bitrix24.StepDifinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Driver;

public class Hooks {
    @Before
    public void setupDriver(){

        utilities.getURL();

    }



    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenShot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        Driver.closeDriver();

    }
}
