package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchCurrencyElements {
    WebDriver driver;

    public SwitchCurrencyElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getCurrencyList(){
        return driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
    }
}
