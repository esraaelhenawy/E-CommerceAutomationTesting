package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {
    WebDriver driver;

    public LoginPageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginPage(){
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement getPassword(){
        WebElement passwordEle=driver.findElement( By.cssSelector("input[id=\"Password\"]"));
        return passwordEle;
    }
    public void loginSteps(String Email,String password){
        getEmail().clear();
        getEmail().sendKeys(Email);
        getPassword().sendKeys(password);

    }

}

