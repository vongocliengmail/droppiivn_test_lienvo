package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.SignInPage;
import utilities.EnvironmentConfiguration;
import utilities.actions.CommonActions;
import utilities.actions.ValidationActions;

public class SignInSteps {
    private EnvironmentConfiguration envConfig = new EnvironmentConfiguration(System.getProperty("env"));
    CommonActions commonActions = new CommonActions();
    SignInPage signInPage = new SignInPage();

    @And("I enter the valid email and password")
    public void iEnterTheValidEmailAndPassword() {
        System.out.println("I enter user name and password");
        commonActions.clearAndSetText(signInPage.txtEmail(), envConfig.getUserName());
        commonActions.clearAndSetText(signInPage.txtPassword(), envConfig.getPassword());

    }

    @And("I click to the Sign in button")
    public void iClickToTheSignInButton() {
        commonActions.clickElement(signInPage.btnSignIn());
    }

    @Then("I see the user logged successfully")
    public void iSeeTheUserLoggedSuccessfully() {
    }
}
