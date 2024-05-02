package pageobjects;

public class HomePage {
    public String linkSignIn() {
        return System.getProperty("HomePage.SignIn.Link");
    }
    public String linkSignUp() {
        return System.getProperty("HomePage.SignUp.Link");
    }
}
