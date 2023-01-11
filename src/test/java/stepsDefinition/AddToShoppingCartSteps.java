package stepsDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.AddToShoppingCartElements;

public class AddToShoppingCartSteps {
    WebDriver shoppingDriver;
    AddToShoppingCartElements shoppingCartElements;
    SoftAssert shoppingSoftAssert=new SoftAssert();


    public AddToShoppingCartSteps() {
        shoppingDriver=Hooks.driver;
        shoppingCartElements=new AddToShoppingCartElements(shoppingDriver);
    }


    @When("user add first item to shopping cart")
    public void userAddFirstItemToShoppingCart() {
        shoppingCartElements.addToCartButton1().click();

    }
    @When("user add second item to shopping cart")
    public void userAddSecondItemToShoppingCart() {
        shoppingCartElements.addToCartButton2().click();
    }

    @Then("user's shopping cart will be updated")
    public void userSShoppingCartWillBeUpdated() throws InterruptedException {
        Thread.sleep(500);
        shoppingSoftAssert.assertTrue(shoppingCartElements.getAddMessage().isDisplayed());
        shoppingCartElements.getShoppingCartLink().click();
        shoppingSoftAssert.assertTrue(shoppingCartElements.getItem2InTableOfCart().isDisplayed());
        shoppingSoftAssert.assertAll();
    }

}
