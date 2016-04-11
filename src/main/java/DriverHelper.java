import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */
public class DriverHelper {
    public static WebDriver driver;

    public void openBrowser() throws IOException {

        FileInputStream fs = new FileInputStream("src/test/Resources/Resources.properties");
        Properties prop = new Properties();
        prop.load(fs);
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        String browser = prop.getProperty("browser");
        System.out.println("Opening Browser");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();


    }

    public void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();

    }
}

