package com.OrangeHRM.stepDefinitions;

import com.OrangeHRM.testBase.PageInitializer;
import com.OrangeHRM.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinitions extends CommonMethods {
    @Given("nagivate OrangeHrm login page")
    public void nagivate_OrangeHrm_login_page() {
        setUp();
    }

    @When("enter valid credentials")
    public void enter_valid_credentials() {
        loginPage.login("Admin","Admin123");

    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

//    @Then("verify dashboard display")
//    public void verify_dashboard_display() {
//
//    }

    @Then("quit the browser")
    public void quit_the_browser() {

    }

}
