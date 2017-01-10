package bdd.feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import org.fundacion.common.drivers.Driver;
import org.fundacion.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class loginSteps {
  WebDriver driver;
  LoginPage login;

  @Given("^I am on Pivotal Tracker home page$")
  public void I_am_on_Pivotal_Tracker_home_page() throws IOException {
    driver = Driver.getDriver().openBrowser();
    login = new LoginPage(driver);
  }

  @When("^I put a valid user (.*?)$")
  public void I_put_a_valid_user(String userName) {
    login.setUserName(userName);
    login.clickContinue();
  }

  @When("^I put a valid password (.*?)$")
  public void I_put_a_valid_password(String userPassword) {
    login.setPassword(userPassword);
    login.clickSubmit();
  }

  @Then("^I should login to (.*?)$")
  public void I_should_login_to(String url) {
    String currentUrl = driver.getCurrentUrl();
    assertEquals(currentUrl, url);
  }
}
