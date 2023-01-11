package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToShoppingCartElements {
    WebDriver driver;

    public AddToShoppingCartElements(WebDriver driver) {
        this.driver = driver;
    }
//    public WebElement getItemName(){
//        return driver.findElement(By.cssSelector("h2[class=\"product-title\"]>a[href=\"/leica-t-mirrorless-digital-camera\"]"));
//    }
    public WebElement addToCartButton1(){
        return driver.findElement(By.cssSelector("div[data-productid=\"16\"]>div[class=\"details\"]>div[class=\"add-info\"]>div[class=\"buttons\"]>button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement addToCartButton2(){
        return driver.findElement(By.cssSelector("div[data-productid=\"26\"]>div[class=\"details\"]>div[class=\"add-info\"]>div[class=\"buttons\"]>button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }
    public WebElement getAddMessage(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement getShoppingCartLink(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]>a[href=\"/cart\"]"));
    }

    public WebElement getItem1InTableOfCart(){
        return driver.findElement(By.cssSelector("td[class=\"product\"]>a[href=\"/leica-t-mirrorless-digital-camera\"]"));
    }
    public WebElement getItem2InTableOfCart(){
        return driver.findElement(By.cssSelector("td[class=\"product\"]>a[href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"]"));
    }

}
