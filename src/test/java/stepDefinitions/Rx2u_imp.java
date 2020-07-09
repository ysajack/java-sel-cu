package stepDefinitions;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Rx2u;

public class Rx2u_imp {
    @Inject
    Rx2u rx2u;

    @Given("^I go to Homepage$")
    public void i_go_to_Homepage() {
        rx2u.goToHomepage();
    }

    @Then("^I validate the logo as \"([^\"]*)\"$")
    public void i_validate_the_logo_as(String logo) {
        rx2u.validateLogo(logo);
    }

    @Then("^I validate About$")
    public void i_validate_About() {
        rx2u.validateAbout();
    }
}
