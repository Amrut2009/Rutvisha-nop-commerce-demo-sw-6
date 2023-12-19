package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("I m on a homePage")
    public void iMOnAHomePage() {

    }

    @When("I Click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputers();

    }

    @Then("I should navigate to computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
        Assert.assertEquals("Computer Text is not displayed", new ComputerPage().setVerifyTheTextComputer());
    }

    @And("I Click on Desktops link")
    public void iClickOnDesktopsLink() {
        new DesktopsPage().setClickOnDesktopsTab();
    }

    @Then("I should navigate to Desktops page successfully")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals("Desk top text is not displayed ", new DesktopsPage().setVerifyTheTextDesktops());
    }


    @And("I Click on product name {Build your own computer}")
    public void iClickOnProductName(String arg0) {
        new ComputerPage().setClickOnBuildYourComputer();

    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String Processor) {
        new BuildYourOwnComputerPage().selectProcessor(Processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String HDD) {
        new BuildYourOwnComputerPage().selectHDD(HDD);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String OS) {
        new BuildYourOwnComputerPage().selectOS(OS);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I Click on {string} Button")
    public void iClickOnButton(String arg0) {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I can see a product has been added to your shopping cart")
    public void iCanSeeAProductHasBeenAddedToYourShoppingCart() throws InterruptedException {
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals("Product does not added to cart", expectedMessage, new BuildYourOwnComputerPage().getProductAddedMessage());
    }


}



