package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ColorFilterElements;

public class ColorFilterSteps {
    WebDriver filterDriver;
    ColorFilterElements filterElements;

    public ColorFilterSteps() {
        filterDriver=Hooks.driver;
        filterElements=new ColorFilterElements(filterDriver);
    }
    @When("user go to Filter by attributes to choose color")
    public void findFilterBlock() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(filterElements.getFilterBlock().isDisplayed());
    }

    @And("user click on color check box for color {string}")
    public void userClickOnColorCheckBox(String color) throws InterruptedException {
        filterElements.getColorCheckBox(color).click();
        Thread.sleep(500);
        Assert.assertTrue(filterElements.getColorCheckBox(color).isSelected());
    }

    @Then("user get filter result")
    public void filterResult() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(filterElements.getResult().isDisplayed());
    }

    @Then("user get filter result for all colors")
    public void userGetFilterResultForAllColors() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(filterElements.getTotalResult().isDisplayed());
    }
}
