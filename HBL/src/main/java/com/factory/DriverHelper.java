package com.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverHelper {

    public static WebDriver driver;

    public void openBrowser() throws IOException {

        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(System.getProperty("/src/test/resources/config.properties"));
        prop.load(fs);
        String browser=prop.getProperty("browser");

        switch (browser) {
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "ie":
                driver=new InternetExplorerDriver();
                break;
            case "safari":
                driver = (new SafariDriver());
                break;
            default:
                driver = (new FirefoxDriver());
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public void closeBroswer() {
        driver.close();
        driver.quit();

    }
}
