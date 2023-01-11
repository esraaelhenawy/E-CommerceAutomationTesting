package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectTagElements {
    WebDriver driver;

    public SelectTagElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getAnyCategory(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/electronics\"]"));
    }
    public WebElement getTagsArea(){
        return driver.findElement(By.cssSelector("div[class=\"block block-popular-tags\"]"));
    }
    public WebElement getAnyTag(){
        return driver.findElement(By.cssSelector("a[href=\"/jeans\"]"));
    }
    public WebElement getTag1Result(){
        return driver.findElement(By.cssSelector("div>[class=\"picture\"]>a[href=\"/levis-511-jeans\"]"));
    }
    public WebElement getTag2Result(){
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"]>a[href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"]"));

    }

}
