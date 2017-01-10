package bdd.feature;

import static org.testng.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import org.fundacion.common.drivers.Driver;
import org.fundacion.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;


public class LoginSteps {
  WebDriver driver;
  LoginPage login;

  @Given("^I am on Pivotal Tracker home page$")
  public void givenIAmOnPivotalTrackerHomePage() throws IOException {
    driver = Driver.getDriver().openBrowser();
    login = new LoginPage(driver);
  }

  @When("^I put a valid user (.*)$")
  public void whenIPutAValidUser(String userName) {
    login.setUserName(userName);
    login.clickContinue();
  }

  @When("^I put a valid password (.*)$")
  public void whenIPutAValidPassword(String userPassword) {
    login.setPassword(userPassword);
    login.clickSubmit();
  }

  @Then("^I should login to (.*)$")
  public void thenIShouldLoginTo(String expectedUrl) {
    String currentUrl = driver.getCurrentUrl();
    assertEquals(currentUrl, expectedUrl);
  }
}
