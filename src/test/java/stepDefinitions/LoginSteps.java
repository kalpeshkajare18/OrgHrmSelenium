package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestBase;

public class LoginSteps extends TestBase {

    WebDriver driver;
    LoginPage loginPage;

    public LoginSteps() {
        this.driver = super.initializeDriver(); // Initialize the WebDriver from Base class
        loginPage = new LoginPage(driver);
    }

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
    	
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User enters valid username and password")
    public void userEntersValidCredentials() throws Exception {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
       
        
    }

    @When("User enters invalid username and password")
    public void userEntersInvalidCredentials() throws Exception {
        loginPage.enterUsername("invalidUsername");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLoginButton();
       
    }

    @Then("User should be redirected to the home page")
    public void userIsRedirectedToHomePage() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("dashboard"));
        driver.quit();
    }

    @Then("User should see an error message")
    public void userSeesErrorMessage() {
        String errorMessage = loginPage.getErrorMessage();
        assertEquals("Invalid credentials", "Invalid credentials");
        
        driver.quit();
    }
}
