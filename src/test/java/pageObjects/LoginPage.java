package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestBase;

public class LoginPage {

    WebDriver driver;

    // Locators for the login page elements
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type = 'submit']");
    By errorMessage = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) throws Exception {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.clear();
        Thread.sleep(2000);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() throws Exception {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
        Thread.sleep(2000);
    }

    public String getErrorMessage() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.getText();
    }
    
   
}
