package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.SearchElements;

public class SearchSteps {
    WebDriver searchDriver=null;
    SearchElements searchElements;
    SoftAssert searchSoftAssert=new SoftAssert();
    String item=new String();

    public SearchSteps() {
        searchDriver=Hooks.driver;
        searchElements=new SearchElements(searchDriver);
    }
    @And("user go to search button and entry {string}")
    public void searchForItem(String item){
        this.item=item;
      searchElements.getSearchArea().sendKeys(item);
    }
    @When("user click on search button")
     public void clickOnSearchButton(){
      searchElements.getSearchButton().click();
    }
    @Then("user get the element he search for")
     public void getTheElement() throws InterruptedException {
        String actualResult=searchElements.getResultElement().getText();
        Thread.sleep(500);
      searchSoftAssert.assertTrue(actualResult.contains(item));
    }

    @Then("user get not found message")
    public void userGetNotFoundMessage() throws InterruptedException {
        String expectedMessage="No products were found that matched your criteria.";
        String actualMessage=searchElements.getNotFoundMessage().getText();
        Thread.sleep(500);
        searchSoftAssert.assertTrue(expectedMessage.contains(actualMessage));
    }
}
