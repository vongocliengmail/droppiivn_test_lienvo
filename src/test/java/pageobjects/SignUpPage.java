package pageobjects;

public class SignUpPage {
    public String txtFirstName() {
        return System.getProperty("SignUp.FirstName.TextBox");
    }

    public String txtLastName() {
        return System.getProperty("SignUp.LastName.TextBox");
    }

    public String txtEmail() {
        return System.getProperty("SignUp.Email.TextBox");
    }

    public String txtPassword() {
        return System.getProperty("SignUp.Password.TextBox");
    }
}
