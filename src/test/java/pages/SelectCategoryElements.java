package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategoryElements {
    WebDriver driver;
    String category=new String();

    public SelectCategoryElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCategory(String category) throws InterruptedException {
        this.category=category;
        Thread.sleep(500);
        if (category.contains("Computers")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/computers\"]"));
        }else if (category.contains("Electronics")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/electronics\"]"));
        }else if (category.contains("Apparel")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/apparel\"]"));
        }else if (category.contains("Digital downloads")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/digital-downloads\"]"));
        }else if (category.contains("Books")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/books\"]"));
        }else if (category.contains("Jewelry")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/jewelry\"]"));
        }else if (category.contains("Gift Cards")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/gift-cards\"]"));
        }
        System.out.println("error with getcategory");
        return null;
    }
    public WebElement getSubCategory(){
        if(category.contains("Computers")){
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/desktops\"]"));
        } else if (category.contains("Electronics")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/camera-photo\"]"));
        } else if (category.contains("Apparel")) {
            return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/shoes\"]"));
        }
        return null;
    }
    public WebElement getElementsInsideThisCategory(){
        if(category.contains("Electronics")) {
            return driver.findElement(By.cssSelector("[class=\"picture\"]>a[href=\"/nikon-d5500-dslr\"]"));
        } else if (category.contains("Digital downloads")) {
            return driver.findElement(By.cssSelector("div[class=\"picture\"]>a[href=\"/if-you-wait-donation\"]"));
        }
        return null;
    }
    public WebElement getProductContainer(){
        return driver.findElement(By.cssSelector("div[class=\"products-container\"]"));
    }
}
