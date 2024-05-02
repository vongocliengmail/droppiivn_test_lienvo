package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.AccountPage;
import pageobjects.SignUpPage;
import utilities.actions.CommonActions;
import utilities.actions.ValidationActions;

import java.util.Random;

public class SignUpSteps {
    private static WebDriver driver;
    CommonActions commonActions = new CommonActions();
    ValidationActions validationActions = new ValidationActions();
    SignUpPage signUpPage = new SignUpPage();
    AccountPage accountPage = new AccountPage();
    Random rand = new Random();

    @And("I fill all mandatory fields {string}, {string}, {string}, {string}")
    public void iFillAllMandatoryFieldsFirst_nameLast_nameEmailPassword(String first_name, String last_name, String email, String password) {
        String email_test = email.substring(0, 9) + rand.nextInt(1000)+"@gmail.com";
        commonActions.setText(signUpPage.txtFirstName(), first_name);
        commonActions.setText(signUpPage.txtLastName(), last_name);
        commonActions.setText(signUpPage.txtEmail(), email_test);
        commonActions.setText(signUpPage.txtPassword(), password);
        commonActions.setText(signUpPage.txtConfirmPassword(), password);
        commonActions.sleep(2);
    }

    @And("I click to the create an account button")
    public void iClickToTheCreateAnAccountButton() {
        commonActions.sleep(2);
        commonActions.clickElement(signUpPage.btnCreateNewUser());
        commonActions.sleep(2);
    }

    @Then("I see the new user created")
    public void iSeeTheNewUserCreated() {
        validationActions.isElementPresent(accountPage.RegisteredMessage());
        Assert.assertEquals(commonActions.getText(accountPage.RegisteredMessage()),"Thank you for registering with Main Website Store.","User is not created successfully");
    }

}
