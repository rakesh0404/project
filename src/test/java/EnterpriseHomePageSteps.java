import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Dawood-KhanM on 11/04/2016.
 */
public class EnterpriseHomePageSteps extends DriverHelper {
    ServiceProviderHomePage obj4Enterprise= new ServiceProviderHomePage();
    EnterprisePortalHomePage obj4EnterprisePortal= new EnterprisePortalHomePage();

    @Given("^I am on System Admin Homepage$")
    public void i_am_on_System_Admin_Homepage() throws Throwable {
        obj4Enterprise.onHomePage();

    }

    @When("^I select an enterpirse$")
    public void i_select_an_enterpirse() throws Throwable {
      obj4Enterprise.selectCustomerFromDropDown();
    }

    @When("^go to the Enterprise$")
    public void go_to_the_Enterprise() throws Throwable {
        obj4Enterprise.goToCustomerPortal(driver.getCurrentUrl());
    }

    @Then("^i successfully see the Enterprise Homepage$")
    public void i_successfully_see_the_Enterprise_Homepage() throws Throwable {
        System.out.println("You are on Customer Portal");

    }

    @Given("^I am on Enterprie Homepage$")
    public void i_am_on_Enterprie_Homepage() throws Throwable {
        obj4EnterprisePortal.enterpriseDashBorad();

    }

    @When("^I open Security Groups, Enterpirse Configureation and Reprots$")
    public void i_open_Security_Groups_Enterpirse_Configureation_and_Reprots() throws Throwable {
        obj4EnterprisePortal.securityGroups();
        obj4EnterprisePortal.enterpriseConfiguration();
        obj4EnterprisePortal.enterpriseReprots();
    }

    @Then("^I can successfully open all the pages\\.$")
    public void i_can_successfully_open_all_the_pages() throws Throwable {
        System.out.println("All pages are accessible in Enterprise");


    }



}
