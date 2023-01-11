package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class A1RegistrationPageElements {
    WebDriver driver;

    public A1RegistrationPageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRButton(){
        return driver.findElement(By.className("ico-register"));
    }
    public WebElement getGender(){
        return driver.findElement(By.cssSelector("input[id=\"gender-female\"]"));

    }
   public WebElement getFirstName(){
        WebElement fName=driver.findElement(By.cssSelector("input[id=\"FirstName\"]"));

        return fName;
   }
    public WebElement getLastName(){
        WebElement lName=driver.findElement(By.cssSelector("input[id=\"LastName\"]"));
        return lName;
    }
    public void setFirstName(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void setLastName(String lastName){
        getLastName().sendKeys(lastName);
    }
    public WebElement dateOfBirthDay(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }
    public WebElement dateOfBirthMonth(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
    public WebElement dateOfBirthYear(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public void setBirthDateDay(String day){
        dateOfBirthDay().sendKeys(day);
    }
    public void setBirthDateMonth(String month){
        dateOfBirthMonth().sendKeys(month);
    }
    public void setBirthDateYear(String year){
        dateOfBirthYear().sendKeys(year);
    }

    public WebElement getEMail(){
          return driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public void setEMail(String eMail){
        getEMail().sendKeys(eMail);
    }

    public WebElement getPassword(){
        return driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement getConfirmPassword(){
        return driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]"));
    }
    public void setPassword(String password){
        getPassword().sendKeys(password);
    }
    public void setConfirmPassword(String password){
        getConfirmPassword().sendKeys(password);
    }

    public WebElement getMsgText() {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement continueButton() {
        return driver.findElement(By.cssSelector("a[href=\"/\"][class=\"button-1 register-continue-button\"]"));
    }

}
