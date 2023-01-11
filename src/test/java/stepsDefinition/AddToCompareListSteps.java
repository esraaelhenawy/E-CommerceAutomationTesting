package stepsDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.AddToCompareListElements;

public class AddToCompareListSteps {

    WebDriver compareDriver;
    AddToCompareListElements compareListElements;
    SoftAssert compareSoftAssert=new SoftAssert();

    public AddToCompareListSteps() {
        compareDriver=Hooks.driver;
        compareListElements=new AddToCompareListElements(compareDriver);
    }
    @And("add first item to compare list")
    public void addFirstItemToCompareList(){
        compareListElements.getFirstCompareItemButton().click();

    }

    @And("add second item to compare list")
    public void addSecondItemToCompareList(){
     compareListElements.getSecondCompareItemButton().click();
    }
    @And("user's compare list will be updated")
    public void userSCompareListWillBeUpdated() throws InterruptedException {
        compareListElements.getCompareListLink().click();
        Thread.sleep(500);
        compareSoftAssert.assertTrue(compareListElements.getClearListButton().isDisplayed());
        compareSoftAssert.assertTrue(compareListElements.getFirstItemName().isDisplayed());
        compareSoftAssert.assertTrue(compareListElements.getSecondItemName().isDisplayed());
        compareSoftAssert.assertAll();
    }
}
