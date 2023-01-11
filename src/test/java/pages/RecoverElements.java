package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecoverElements {
    WebDriver driver;

    public RecoverElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getForgetLink(){
        return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement getEmailArea(){
        return driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }

    public WebElement getRecoverButton(){
        return driver.findElement(By.cssSelector("button[name=\"send-email\"]"));
    }
   public WebElement getRecoveryMsg(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
   }
}
