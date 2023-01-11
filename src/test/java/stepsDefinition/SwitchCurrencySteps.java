package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.SwitchCurrencyElements;

public class SwitchCurrencySteps {
    WebDriver currencyDriver;
    SwitchCurrencyElements currencyElements;
    String currency;


    public SwitchCurrencySteps() {
        currencyDriver=Hooks.driver;
        currencyElements=new SwitchCurrencyElements(currencyDriver);
    }
    @And("user go to currency dropdowns list and make it {string}")
     public void changeCurrency(String currency){
        this.currency=currency;
         currencyElements.getCurrencyList().click();
         currencyElements.getCurrencyList().sendKeys(currency);
         currencyElements.getCurrencyList().sendKeys(Keys.ENTER);
    }

    @Then("currency changed")
    public void currencyChanged() throws InterruptedException {
        String currencyText=currencyElements.getCurrencyList().getText();
        Thread.sleep(500);
        Assert.assertTrue(currencyText.contains(currency));
    }
}
