package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.A1RegistrationPageElements;

public class A1Registration {
    WebDriver registDriver =null;
    A1RegistrationPageElements register;
    SoftAssert registrationSoftAssert =new SoftAssert();

    public A1Registration() {
        registDriver=Hooks.driver;
        register=new A1RegistrationPageElements(registDriver);

    }


//    @Given("user open browser and go to site")
//    public void openBrowser() throws InterruptedException {
//
//        String getPath= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",getPath);
//        Thread.sleep(1000);
//        registDriver.navigate().to("https://demo.nopcommerce.com/");
//        registDriver.manage().window().maximize();
//        Thread.sleep(2000);
//    }
    @Given("user go to registration page")
    public void goToRegistrationPage() throws InterruptedException {
        register.getRButton().click();
        Thread.sleep(1000);
        registrationSoftAssert.assertTrue(registDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/register?returnUrl=%2F"), "open registration page");
    }
    @Then("user choose gender")
    public void chooseGender() throws InterruptedException {
      register.getGender().click();
        Thread.sleep(1000);
    }

    @And("user enter first name {string}")
    public void enterFirstName(String firstName) throws InterruptedException {
       register.setFirstName(firstName);
        Thread.sleep(700);
    }
    @And("user enter last name {string}")
    public void enterLastName(String lastName) throws InterruptedException {
       register.setLastName(lastName);
        Thread.sleep(700);
    }
    @And("user choose his birthDate {string} and {string} and {string}")
    public void chooseBirthDate(String day,String month,String year) throws InterruptedException {
      register.dateOfBirthDay().click();
      register.setBirthDateDay(day);
      register.dateOfBirthMonth().click();
      register.setBirthDateMonth(month);
      register.dateOfBirthYear().click();
      register.setBirthDateYear(year);
        Thread.sleep(500);
    }
    @And("user enter {string}")
    public void enterMail(String eMail) throws InterruptedException {
      register.setEMail(eMail);
        Thread.sleep(500);
    }
    @And("user enter {string} and confirm password")
    public void enterPassword(String password) throws InterruptedException {
      register.setPassword(password);
      register.setConfirmPassword(password);
        Thread.sleep(700);

    }
    @And("user click on register button")
    public void clickOnRegisterButton() throws InterruptedException {
     register.getConfirmPassword().sendKeys(Keys.ENTER);
     Thread.sleep(500);
    }
    @Then("user will register successfully")
    public void registerSuccessfully() throws InterruptedException {
        String expectedResult="Your registration completed";
        Thread.sleep(700);
        String actualResult=register.getMsgText().getText();
        System.out.println(actualResult);
        Thread.sleep(500);
       // registrationSoftAssert.assertEquals(actualResult,expectedResult);
        registrationSoftAssert.assertTrue(actualResult.contains(expectedResult), "register message true");
        registrationSoftAssert.assertTrue(register.continueButton().isDisplayed(), "second assert");
        registrationSoftAssert.assertAll();
        Thread.sleep(200);

    }
    @And("user will go to home page")
    public void goToHomePage() throws InterruptedException {
        register.continueButton().click();
        Thread.sleep(500);
        registrationSoftAssert.assertEquals(registDriver.getCurrentUrl(),"https://demo.nopcommerce.com/",
               "go to home page assert");
    }


}
