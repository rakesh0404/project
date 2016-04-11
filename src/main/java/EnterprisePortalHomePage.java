import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */
public class EnterprisePortalHomePage extends DriverHelper {

    ServiceProviderHomePage obj4Enterprise = new ServiceProviderHomePage();

    public void enterpriseDashBorad() {
        obj4Enterprise.goToCustomerPortal(driver.getCurrentUrl());
    }

    public void securityGroups() {
        driver.findElement(By.id("security-group-toggle")).click();
        driver.findElement(By.id("dropdown-security-groups")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    public void enterpriseConfiguration() {
        driver.findElement(By.id("config-toggle")).click();
        driver.findElement(By.id("dropdown-admins")).click();

    }

    public void enterpriseReprots() {
        driver.findElement(By.xpath("//a[contains(.,'Reports')]"));
    }

    public void leaveCustomerPortal() {
        driver.findElement(By.xpath("//a[contains(.,'Leave Customer Portal')]")).click();
        driver.findElement(By.xpath("//input[@value='Yes, leave customer portal']")).click();
    }
}
