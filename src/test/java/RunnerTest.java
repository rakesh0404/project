import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/Dawood-html-report", "json:target/Star.json"},
        features = {"src/test/Resources/features"},

        tags = {"@enterprisehomepage"}
)
public class RunnerTest {
}
