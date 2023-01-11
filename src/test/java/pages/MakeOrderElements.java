package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeOrderElements {
    WebDriver driver;

    public MakeOrderElements(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getTermCheckBox(){
        return driver.findElement(By.cssSelector("input[id=\"termsofservice\"]"));
    }
    public WebElement getCheckOutButton(){
        return driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
    }
    public WebElement getCountryButton(){
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }
    public WebElement getCityArea(){
        return driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement getAddress(){
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement getPostalCodArea(){
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement getPhoneArea(){
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement getContinueButton(String name){
        if(name.contains("first")) {
            return driver.findElement(By.cssSelector("button[name=\"save\"][class=\"button-1 new-address-next-step-button\"]"));
        } else if (name.contains("second")) {
            return driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
        } else if (name.contains("third")) {
            return driver.findElement(By.cssSelector("div[id=\"payment-method-buttons-container\"]>button[name=\"save\"]"));
        } else if (name.contains("forth")) {
            return driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
        } else if (name.contains("fifth")) {
            return driver.findElement(By.cssSelector("div[id=\"confirm-order-buttons-container\"]>button[class=\"button-1 confirm-order-next-step-button\"]"));
        } else if (name.contains("sixth")) {
            return driver.findElement(By.cssSelector("div[class=\"buttons\"]>button[class=\"button-1 order-completed-continue-button\"][type=\"button\"]"));
        } else if (name.contains("seven")) {
            return driver.findElement(By.cssSelector("div[id=\"billing-buttons-container\"]>[class=\"button-1 new-address-next-step-button\"]"));
        }
        return null;
    }

    public WebElement getShipMethod(){
        return driver.findElement(By.cssSelector("div[class=\"method-name\"]>input[name=\"shippingoption\"][value=\"Next Day Air___Shipping.FixedByWeightByTotal\"]"));
    }
    public WebElement getPaymentMethod(){
        return  driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/Plugins/Payments.CheckMoneyOrder/logo.jpg\"]"));
    }
    public WebElement getPaymentInfo(){
        return driver.findElement(By.cssSelector("div[class=\"section payment-info\"]>[class=\"info\"]"));
    }
    public WebElement getThanksMsg(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement getOrderNum(){
        return driver.findElement(By.cssSelector("div[class=\"order-number\"]"));
    }
//    public WebElement getOrderLink(){
//        return driver.findElement(By.cssSelector("div[class=\"details-link\"]>a[href=\"/orderdetails/1034\"]"));
//    }

}
