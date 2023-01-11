package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.LoginPageElements;

public class LoginSteps {
    WebDriver loginDriver = null;
    LoginPageElements login;
    SoftAssert loginSoftAssert = new SoftAssert();
    //private String email;
    //private String password;

    public LoginSteps() {
        loginDriver = Hooks.driver;
        login = new LoginPageElements(loginDriver);
    }

    @Given("user go to login page")
    public void userGoToLoginPage() throws InterruptedException {
        login.getLoginPage().click();
        Thread.sleep(500);
        loginSoftAssert.assertTrue(loginDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"),
                "open login page");
    }
    @And("user login with {string}and{string}")
    public void userEnterAnd(String Email, String password) throws InterruptedException {
        login.loginSteps(Email, password);
        Thread.sleep(500);
        login.getPassword().sendKeys(Keys.ENTER);
    }

//    @And("click on login button")
//    public void clickOnLoginButton() {
//        login.getPassword().sendKeys(Keys.ENTER);
//
//    }

    @Then("user could login successfully and go to home page")
    public void goToHomePage() throws InterruptedException {
        loginSoftAssert.assertTrue(loginDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),
                "go to home page assert");
        Thread.sleep(1000);
    }



}
