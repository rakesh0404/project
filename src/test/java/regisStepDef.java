
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class regisStepDef {

    public static WebDriver driver = BaseTest.driver;

    @Before
    public void beforeStep() {
        System.out.println();
        System.out.println("I am starting pre condition checks ......");
        driver.findElement(By.className("header-logo")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @After
    public void afterStep()
    {
        driver.findElement(By.xpath("//*[@class='ico-logout']")).click();
        System.out.println("Post condition checks ......");
    }

    @Given("^customer on navigative Registration page$")
    public void iAmNavigativeRegistrationPage() throws Throwable {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class='ico-register']")).click();
        System.out.println();
        System.out.println("this is click on registration ");
    }

    @When("^customer select \"([^\"]*)\"$")
    public void iAmSelect(String male) throws Throwable {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='gender-male']")).click();
        System.out.println();
        System.out.println("select Gender");

    }

    @And("^customer enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iamEnterAnd(String First_Name, String Last_Name) throws Throwable {
        System.out.println("entering to frist name and secondname");
        driver.findElement(By.id("FirstName")).sendKeys(First_Name);
        driver.findElement(By.id("LastName")).sendKeys(Last_Name);
        System.out.println();
        System.out.println("enter first nad seconrd nme");
    }

    @When("^I am select Date of Birth \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
    public void iAmSelectDateOfBirthAndAnd(String Day, String Month, String year) throws Throwable {
        new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthDay']"))).selectByValue(Day);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']"))).selectByVisibleText(Month);
        new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthYear']"))).selectByValue(year);
        System.out.println();
        System.out.println("date of birth");

    }

    @And("^I enter \"([^\"]*)\" and  \"([^\"]*)\" check box$")
    public void iEnteremailAndCheckBox(String Email, String Newsletters) throws Throwable {
        Random random = new Random();
        String emailId = random.nextInt() + Email;
        System.out.println(emailId);
        driver.findElement(By.id("Email")).sendKeys(random.nextInt() + emailId);
        // driver.findElement(By.xpath("//*[@id='Newsletter']")).click();
        System.out.println();
        System.out.println("email and chckck box");
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAndAnd(String Companyname, String password, String Confirmpassword) throws Throwable {
        driver.findElement(By.xpath("//*[@id='Company']")).sendKeys(Companyname);
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys(Confirmpassword);
        System.out.println();
        System.out.println("enter company and passward");
    }

    @When("^I press on Register$")
    public void press_Register() throws Throwable {

        driver.findElement(By.id("register-button")).click();

    }
    @Then("^I should be able to see a message \"([^\"]*)\"$")
    public void ishouldseemassa  (String message)throws Throwable {
        System.out.println();
        System.out.println(message);
        String expected = message;
        String actual = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(expected,actual);
           // driver.findElement(By.xpath("//*[@class='ico-logout']")).click();


    }
}


