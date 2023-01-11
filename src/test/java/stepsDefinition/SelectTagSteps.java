package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.SelectTagElements;

public class SelectTagSteps {
    WebDriver tagDriver;
    SelectTagElements tagElements;
    SoftAssert tagSoftAssert=new SoftAssert();

    public SelectTagSteps() {
        tagDriver=Hooks.driver;
        tagElements=new SelectTagElements(tagDriver);

    }
    @And("user click on any category")
    public void clickOnCategory(){
        tagElements.getAnyCategory().click();
    }

    @And("user go to tags block and choose any tag")
    public void userGoToTagsBlockAndChooseAnyTag() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(tagElements.getTagsArea().isDisplayed());
        tagElements.getAnyTag().click();
    }

    @Then("user could get the tags result")
    public void userCouldGetTheTagsResult() throws InterruptedException {
        Thread.sleep(700);
      tagSoftAssert.assertTrue(tagElements.getTag1Result().isDisplayed());
      tagSoftAssert.assertTrue(tagElements.getTag2Result().isDisplayed());
      tagSoftAssert.assertAll();
    }
}
