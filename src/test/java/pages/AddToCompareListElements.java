package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCompareListElements {
    WebDriver driver;

    public AddToCompareListElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getFirstCompareItemButton(){
        return driver.findElement(By.cssSelector("div[data-productid=\"16\"]>[class=\"details\"]>[class=\"add-info\"]>[class=\"buttons\"]>button[class=\"button-2 add-to-compare-list-button\"]"));

    }
    public WebElement getSecondCompareItemButton(){
        return driver.findElement(By.cssSelector("div[data-productid=\"26\"]>[class=\"details\"]>[class=\"add-info\"]>[class=\"buttons\"]>button[class=\"button-2 add-to-compare-list-button\"]"));

    }
    public WebElement getCompareListLink(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]>a[href=\"/compareproducts\"]"));
    }
    public WebElement getClearListButton(){
        return driver.findElement(By.cssSelector("a[href=\"#\"]"));
    }
    public WebElement getFirstItemName(){
        return driver.findElement(By.cssSelector("tr[class=\"product-name\"]>td[style=\"width:45%\"]>a[href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"]"));
    }
    public WebElement getSecondItemName(){
        return driver.findElement(By.cssSelector("tr[class=\"product-name\"]>td[style=\"width:45%\"]>a[href=\"/leica-t-mirrorless-digital-camera\"]"));
    }
}
