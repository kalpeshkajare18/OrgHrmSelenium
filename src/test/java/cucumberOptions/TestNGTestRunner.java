package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features/",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests
{
	
	@DataProvider(parallel=true)
	public Object[][] scenarios() 
	{
		return super.scenarios();
	}
	
}
