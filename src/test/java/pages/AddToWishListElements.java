package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToWishListElements {
    WebDriver driver;

    public AddToWishListElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getFirstItemButton(){
        return driver.findElement(By.cssSelector("div[data-productid=\"16\"]>[class=\"details\"]>[class=\"add-info\"]>[class=\"buttons\"]>button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement getSecondItemButton(){
        return driver.findElement(By.cssSelector("div[data-productid=\"26\"]>[class=\"details\"]>[class=\"add-info\"]>[class=\"buttons\"]>button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement getWishMsg(){
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement getWishList(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]>a[href=\"/wishlist\"]"));
    }
    public WebElement getFirstWishItem(){
        return driver.findElement(By.cssSelector("td[class=\"product\"]>a[href=\"/leica-t-mirrorless-digital-camera\"]"));
    }
    public WebElement getSecondWishItem(){
        return driver.findElement(By.cssSelector("td[class=\"product\"]>a[href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"]"));
    }
}
