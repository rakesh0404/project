import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */
public class CreateCustomerSteps extends DriverHelper {
    ServiceProviderHomePage obj4Customer = new ServiceProviderHomePage();
    EnterprisePortalHomePage obj4Enterprise= new EnterprisePortalHomePage();


    @Given("^I am on customer page$")
    public void i_am_on_customer_page() throws Throwable {
        obj4Customer.onHomePage();
        obj4Customer.selectCustomerFromDropDown();
        obj4Customer.goToCustomerPortal(driver.getCurrentUrl());
        obj4Enterprise.leaveCustomerPortal();
        obj4Customer.goToCustomers();


    }

    @When("^I create new customer$")
    public void i_create_new_customer() throws Throwable {
        obj4Customer.gotoReportsPage();
    }

    @When("^Enter \"([^\"]*)\"$")
    public void enter(String customername) throws Throwable {
        obj4Customer.goToAdminUsers();
    }

    @When("^save the customer$")
    public void save_the_customer() throws Throwable {
        obj4Customer.goToBlockPages();
    }

    @Then("^customer creates scuccessfully$")
    public void customer_creates_scuccessfully() throws Throwable {
        obj4Customer.goToAdminUsers();

    }


}
