package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.SelectCategoryElements;

public class SelectCategorySteps {
    WebDriver categoryDriver;
    SelectCategoryElements categoryElements;
    String category;
    WebElement el;

    public SelectCategorySteps() {
        categoryDriver=Hooks.driver;
        categoryElements=new SelectCategoryElements(categoryDriver);
    }
    @And("user hover to random category {string}")
    public void selectRandomCategory(String category) throws InterruptedException {
        this.category=category;
        Thread.sleep(500);
       Actions action=new Actions(categoryDriver);
       el=categoryElements.getCategory(category);
        action.moveToElement(el).perform();
       Thread.sleep(500);

    }
    @And("click On Category")
    public void clickOnCategory() throws InterruptedException {
        selectRandomCategory(category);
        el.click();
    }

    @And("open sub category")
    public void openSubCategory() throws InterruptedException {
        Thread.sleep(500);
       categoryElements.getSubCategory().click();
    }

    @Then("user can get elements inside this category")
    public void userCanGetElementsInsideThisCategory() throws InterruptedException {
        String actualResult=categoryElements.getElementsInsideThisCategory().getText();
       Thread.sleep(700);
       Assert.assertTrue(categoryElements.getProductContainer().getText().contains(actualResult));
    }

}
