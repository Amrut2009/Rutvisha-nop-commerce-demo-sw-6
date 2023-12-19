package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }


    @When("I click on login link")
    public void iClickOnLoginLink() {
       new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login Page is not displayed", expectedMessage, actualMessage);
    }


    @Then("I Enter EmailId")
    public void iEnterEmailId() {
        new LoginPage().enterEmailId(" rutvi.9482@gmail.com");
    }

    @And("I Enter Password")
    public void iEnterPassword() {
        new LoginPage().enterPassword("Charmi1509@");
    }

    @And("I Click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I can see the  Error message")
    public void iCanSeeTheErrorMessage() {
        new LoginPage().getErrorMessage();
    }


    @And("I Enter EmailId {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("I Enter Password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @Then("I should login successfully {string}")
    public void iShouldLoginSuccessfully(String logggedInMessage) {
        Assert.assertEquals("Home page is not displayed", logggedInMessage, new HomePage().getMyAccountText());


    }

    @And("I Click on LogOut Link")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("I can see that LogIn Link Display")
    public void iCanSeeThatLogInLinkDisplay() {

        new HomePage().clickOnLoginLink();
    }
}
