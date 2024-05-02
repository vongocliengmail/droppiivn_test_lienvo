package stepdefinitions;

import common.ThreadWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.SignUpPage;
import utilities.actions.CommonActions;
import utilities.actions.ValidationActions;

public class SignUpSteps {
    private static WebDriver driver;
    CommonActions commonActions = new CommonActions();
    ValidationActions validationActions = new ValidationActions();
    SignUpPage signUpPage = new SignUpPage();

    @When("I fill all mandatory fields (.*), (.*), (.*), (.*)")
    public void iFillAllMandatoryFieldsFirst_nameLast_nameEmailPassword(String first_name, String last_name, String email, String password) throws InterruptedException {
        System.out.println("TESTSSS");
        commonActions.setText(signUpPage.txtFirstName(), first_name);
        commonActions.clearAndSetText(signUpPage.txtLastName(), last_name);
        commonActions.clearAndSetText(signUpPage.txtEmail(), email);
        commonActions.clearAndSetText(signUpPage.txtPassword(), password);
    }

    @And("I click to the create an account button")
    public void iClickToTheCreateAnAccountButton() {
    }

    @Then("I see the new user created")
    public void iSeeTheNewUserCreated() {
    }

}
