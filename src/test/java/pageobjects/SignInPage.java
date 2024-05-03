package pageobjects;

public class SignInPage {
    public String txtEmail() {
        return System.getProperty("SignIn.Email.TextBox");
    }

    public String txtPassword() {
        return System.getProperty("SignIn.Password.TextBox");
    }

    public String btnSignIn() {
        return System.getProperty("SignIn.SignIn.Button");
    }
}
