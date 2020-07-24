package com.bitrix24.StepDifinations;


import com.bitrix24.Pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Driver;

public class AssignTaskStepDef {
    com.bitrix24.Pages.loginPage loginPage=new loginPage();



    @When("user enters {string} and {string}")
    public void userEntersAnd(String UserName, String Password) {
        loginPage.login(UserName, Password);
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedTitle) throws InterruptedException {

        //Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
        Thread.sleep(2000);
    }
}


