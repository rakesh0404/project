

//import cucumber.runtime.Env;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public static void start()
    {
        driver= new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
//        System.out.println("Starting browser ......"+ Main.browser);
//        driver = new FirefoxDriver();
//        System.out.println("Opening the home page......"+Main.homeURL);
//        driver.get(Main.homeURL);
//        System.out.println("Checking the home page is shown......");
//        Assert.assertTrue("Checking the welcome message shown ",driver.findElement(By.tagName("body")).getText().contains("Welcome to our store"));
    }
    @AfterClass
    public static void stop()
    {
        driver.close();
       // driver.quit();
    }
    }