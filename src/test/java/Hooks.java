import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */
public class Hooks extends DriverHelper {
    @Before
    public void setUp() throws IOException {
        openBrowser();
    }

    @After

    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report


        }
        closeBrowser();
    }
}
