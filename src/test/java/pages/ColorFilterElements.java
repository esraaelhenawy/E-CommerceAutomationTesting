package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColorFilterElements {
    WebDriver driver;
    String color;

    public ColorFilterElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getFilterBlock(){
        return driver.findElement(By.cssSelector("div[class=\"product-filter product-spec-filter\"]"));
    }
    public WebElement getColorCheckBox(String color){
        this.color=color;
        if(color.contains("Red")){
            return driver.findElement(By.cssSelector("input[id=\"attribute-option-15\"]"));
        } else if (color.contains("Grey")) {
            return driver.findElement(By.cssSelector("input[id=\"attribute-option-14\"]"));
        } else if (color.contains("Blue")) {
            return driver.findElement(By.cssSelector("input[id=\"attribute-option-16\"]"));
        }
        return null;
    }
    public WebElement getResult(){
        if(color.contains("Red")){
            return driver.findElement(By.cssSelector("div[class=\"picture\"]>a[href=\"/adidas-consortium-campus-80s-running-shoes\"]"));
        } else if (color.contains("Grey")) {
            return driver.findElement(By.cssSelector("[class=\"products-wrapper\"]"));
        } else if (color.contains("Blue")) {
            return driver.findElement(By.cssSelector("div[class=\"picture\"]>a[href=\"/adidas-consortium-campus-80s-running-shoes\"]"));
        }
        return null;
    }
    public WebElement getTotalResult(){
        return driver.findElement(By.cssSelector("div[class=\"picture\"]>a[href=\"/adidas-consortium-campus-80s-running-shoes\"]"));

    }
}
