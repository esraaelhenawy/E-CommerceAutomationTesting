package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
   public static WebDriver driver=null;
    public static WebDriver getDriver() {
        return driver;
    }

    public Hooks() {
    }

    @Before
    public void openBrowser() throws InterruptedException {
        driver =new ChromeDriver();
        String getPath= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",getPath);
        Thread.sleep(500);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(700);
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
