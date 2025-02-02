package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    WebDriver driver;

    
    public WebDriver initializeDriver() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        return driver;
    }

   
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
