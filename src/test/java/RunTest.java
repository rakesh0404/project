import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/sudhakar-html-report", "json:target/Star.json"},
        features = {"src/main/resources"}
        //tags = {"@registration"}
)
public class RunTest extends BaseTest {


}
