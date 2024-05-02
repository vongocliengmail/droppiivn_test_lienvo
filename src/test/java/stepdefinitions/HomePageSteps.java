package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageobjects.HomePage;
import utilities.EnvironmentConfiguration;
import utilities.actions.CommonActions;
import utilities.actions.ValidationActions;

import static common.ThreadWebDriver.getDriver;

public class HomePageSteps {
    private EnvironmentConfiguration envConfig = new EnvironmentConfiguration(System.getProperty("env"));
    ValidationActions validationActions = new ValidationActions();
    CommonActions commonActions = new CommonActions();
    HomePage homePage = new HomePage();

    @Given("I am accessed to the Luma home page")
    public void iAmAccessedToTheLumaHomePage() {
        System.out.println("I am accessed to the Luma home page");
        try {
            getDriver().get(envConfig.getBaseUrl());
            Thread.sleep(300);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }

    @Then("I see the Sign In or Create and Account link")
    public void iSeeTheSignInOrCreateAndAccountLink() {
        validationActions.isElementPresent(homePage.linkSignIn());
        validationActions.isElementPresent(homePage.linkSignUp());
        System.out.println(validationActions.isElementPresent(homePage.linkSignUp()));

    }

    @When("click to Create new user")
    public void clickToCreateNewUser()  {
        System.out.println("LLLLLLLL");
        commonActions.clickElement(homePage.linkSignUp());
    }

}
