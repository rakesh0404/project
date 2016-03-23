package hbl;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = false, tags = "@AddUsers")
public class runCucumberTest {
}
