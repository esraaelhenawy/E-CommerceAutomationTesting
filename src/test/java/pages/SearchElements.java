package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchElements {
    WebDriver driver;

    public SearchElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSearchArea(){
        return driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }
    public WebElement getSearchButton(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public WebElement getResultElement(){
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement getNotFoundMessage(){
        return driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }
}
