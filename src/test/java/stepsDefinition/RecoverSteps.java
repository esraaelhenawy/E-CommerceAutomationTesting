package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.RecoverElements;

public class RecoverSteps {
    WebDriver recoverDriver=null;
    RecoverElements recoverElements;
    SoftAssert recoverAssert = new SoftAssert();

    public RecoverSteps() {
        recoverDriver=Hooks.driver;
        recoverElements=new RecoverElements(recoverDriver);
    }
   @Then("user click on forget password")
    public void clickOnForgetPassword() throws InterruptedException {
       recoverElements.getForgetLink().click();
       Thread.sleep(500);
       recoverAssert.assertTrue(recoverDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/passwordrecovery"));

   }
   @And("user enter his email {string}")
    public void enterEmail(String email){
      recoverElements.getEmailArea().sendKeys(email);
   }
    @And("user click on recover button")
    public void userClickOnRecoverButton() {
        recoverElements.getRecoverButton().click();
    }
   @Then("user get recovery message")
    public void getRecoveryMessage(){
     String expectedMsg="Email with instructions has been sent to you.";
     String actualMsg=recoverElements.getRecoveryMsg().getText();
     recoverAssert.assertEquals(actualMsg,expectedMsg,"recover assert message");
   }


}
