package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.AddToWishListElements;

public class AddToWishListSteps {
    WebDriver wishListDriver;
    AddToWishListElements wishListElements;
    SoftAssert wishListSoftAssert=new SoftAssert();

    public AddToWishListSteps() {
        wishListDriver=Hooks.driver;
        wishListElements=new AddToWishListElements(wishListDriver);
    }
    @And("user add first item to wish list")
    public void addFirstItemToList(){
      wishListElements.getFirstItemButton().click();

    }

    @And("user add second item to wish list")
    public void userAddSecondItemToWishList() {
        wishListElements.getSecondItemButton().click();
    }

    @Then("user will get successfully message")
    public void userWillGetWishListMessage() throws InterruptedException {
        Thread.sleep(500);
        wishListSoftAssert.assertTrue(wishListElements.getWishMsg().isDisplayed());
    }

    @And("user's wish list will be updated")
    public void userSWishListWillBeUpdated() throws InterruptedException {
     wishListElements.getWishList().click();
     Thread.sleep(500);
     wishListSoftAssert.assertTrue(wishListElements.getFirstWishItem().isDisplayed());
     wishListSoftAssert.assertTrue(wishListElements.getSecondWishItem().isDisplayed());
     wishListSoftAssert.assertAll();
    }
}
