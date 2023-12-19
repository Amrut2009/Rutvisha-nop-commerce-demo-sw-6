package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterPageSteps {
    @When("I Click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I can see the  {string} text")
    public void iCanSeeTheText(String arg0) {
       new RegisterPage().getRegisterText();
    }

    @And("I Click on {string} button")
    public void iClickOnButton(String arg0) {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I Select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I Enter firstname")
    public void iEnterFirstname(String firstname) {
        new RegisterPage().enterFirstName(firstname);
    }

    @And("I Enter lastname")
    public void iEnterLastname(String Lastname) {
        new RegisterPage().enterPassword(Lastname);
    }

    @And("I Select day")
    public void iSelectDay(String day) {
        new RegisterPage().selectDateOfBirth(day);
    }

    @And("I Select month")
    public void iSelectMonth(String month) {
        new RegisterPage().selectDateOfBirth(month);
    }

    @And("I Select year")
    public void iSelectYear(String year) {
        new RegisterPage().selectDateOfBirth(year);
    }

    @And("I Enter email")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I Enter password")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I Enter Confirm Password")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("I can see Verify message {string}")
    public void iCanSeeVerifyMessage(String successfulMessage) {
        Assert.assertEquals("Error message is not displayed", successfulMessage,new RegisterPage().getYourRegCompletedText());

    }
}
