package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.MakeOrderElements;

public class MakeOrderSteps {
    WebDriver orderDriver;
    MakeOrderElements orderElements;
    SoftAssert orderSoftAssert=new SoftAssert();

    public MakeOrderSteps() {
        orderDriver=Hooks.driver;
        orderElements=new MakeOrderElements(orderDriver);
    }
    @And("user could checkout")
    public void checkout() throws InterruptedException {
     Thread.sleep(1000);
     orderSoftAssert.assertTrue(orderElements.getCheckOutButton().isDisplayed());
     orderElements.getTermCheckBox().click();
     orderElements.getCheckOutButton().click();
     orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/onepagecheckout#opc-billing"));
    }

    @And("user continue entering his data")
    public void userContinueEnteringHisData() throws InterruptedException {
        if ( orderElements.getCountryButton().isDisplayed()) {
                      orderElements.getCountryButton().click();
                      orderElements.getCountryButton().sendKeys("eg");
                      orderElements.getCountryButton().sendKeys(Keys.ENTER);
                      orderElements.getCityArea().sendKeys("Alex");
                      orderElements.getAddress().sendKeys("mohamed nagib st");
                      orderElements.getPostalCodArea().sendKeys("253");
                      orderElements.getPhoneArea().sendKeys("01031625965");
                      orderElements.getContinueButton("first").click();
                      Thread.sleep(500);
        }
        if (orderElements.getContinueButton("seven").isDisplayed()) {
            orderElements.getContinueButton("seven").click();
            Thread.sleep(500);}

      Thread.sleep(500);
      orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/onepagecheckout#opc-shipping_method"));

    }


    @And("user choose shipping method")
    public void userChooseShippingMethod() throws InterruptedException {
        Thread.sleep(200);
       orderElements.getShipMethod().click();
        orderElements.getContinueButton("second").click();
        Thread.sleep(500);
        orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/onepagecheckout#opc-payment_method"));
    }

    @And("user choose payment method")
    public void userChoosePaymentMethod() throws InterruptedException {
        Thread.sleep(500);
      orderElements.getPaymentMethod().click();
      orderElements.getContinueButton("third").click();
      Thread.sleep(500);
      orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/onepagecheckout#opc-payment_info"));
    }

    @Then("user get payment info")
    public void userGetPaymentInfo() throws InterruptedException {
        Thread.sleep(700);
       orderSoftAssert.assertTrue(orderElements.getPaymentInfo().isDisplayed());
       orderElements.getContinueButton("forth").click();
      // orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/onepagecheckout#opc-confirm_order"));

    }

    @And("user could confirm his order")
    public void userCouldConfirmHisOrder() throws InterruptedException {
        Thread.sleep(500);
        orderElements.getContinueButton("fifth").click();
        Thread.sleep(500);
        orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/checkout/completed"));
    }

    @And("user's order could be completed")
    public void userSOrderCouldBeCompleted() throws InterruptedException {
      String expectedMsg="Thank you";
      String actualMsg=orderElements.getThanksMsg().getText();
      Thread.sleep(1000);
      orderSoftAssert.assertTrue(expectedMsg.contains(actualMsg),"first");
      orderSoftAssert.assertTrue(orderElements.getOrderNum().isDisplayed(),"second");
      //orderSoftAssert.assertTrue(orderElements.getOrderLink().isDisplayed(),"third");
      //orderSoftAssert.assertTrue(orderElements.getContinueButton("sixth").isDisplayed(),"button");
      orderElements.getContinueButton("sixth").click();
     // Thread.sleep(500);
      orderSoftAssert.assertTrue(orderDriver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),"link");
      orderSoftAssert.assertAll();
    }
}
