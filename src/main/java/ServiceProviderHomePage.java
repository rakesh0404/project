import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */
public class ServiceProviderHomePage extends DriverHelper {
    public void onHomePage() {
        String expectedUrl = "https://portal-prep.streamshield.baesystems.com/serviceprovider/dashboard";

        driver.get(expectedUrl);
        try {
            Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
            System.out.println("You are on ServiceProvider's HomePage");
        } catch (Throwable pageNavigationError) {
            System.out.println("Didn't navigate to correct webpage");
        }
    }

    public void goToCustomers() {
        System.out.println("Navigating to Customer Page ");
        driver.findElement(By.xpath("//a[contains(.,'Customers')]")).click();
        Assert.assertEquals("https://portal-prep.streamshield.baesystems.com/serviceprovider/enterprises/overview", driver.getCurrentUrl());
        System.out.println("You are on Customers page");
    }

    public void goToBlockPages() {
        System.out.println("Navigating to Blockpages Page");
        driver.findElement(By.xpath("//a[contains(.,'Block pages')]")).click();
        Assert.assertEquals("https://portal-prep.streamshield.baesystems.com/serviceprovider/block-pages/overview", driver.getCurrentUrl());
        System.out.println("You are on Block pages");
    }

    public void goToAdminUsers() {
        System.out.println("Navigating to Admin User Page");
        driver.findElement(By.xpath("//a[contains(.,'Admin Users')]")).click();
        Assert.assertEquals("https://portal-prep.streamshield.baesystems.com/serviceprovider/administrators/overview", driver.getCurrentUrl());
        System.out.println("You are on Admin Users page");

    }

    public void gotoReportsPage() {
        System.out.println("Navigating to Reports Page");
        driver.findElement(By.xpath("//a[contains(.,'Reports')]")).click();
        Assert.assertEquals("https://portal-prep.streamshield.baesystems.com/serviceprovider/reports/contentcontrol", driver.getCurrentUrl());
        System.out.println("You are on Reports page");

    }

    public void selectCustomerFromDropDown() {
        driver.findElement(By.xpath("//span[contains(.,'All customers')]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[contains(.,'Ari_Test2')]")).isSelected();


    }

    public Object goToCustomerPortal(Object returnValue) {   //Web Element is not found properly
        System.out.println("Moving to Customer Portal Now");
        try {
            driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right']")).click();

            driver.findElement(By.id("customer_filter_chzn_o_5")).isSelected();


        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertEquals("https://portal-prep.streamshield.baesystems.com/enterprise/dashboard", driver.getCurrentUrl());
        System.out.println("You are on Customer Portal Now");
        return returnValue;


    }

}
