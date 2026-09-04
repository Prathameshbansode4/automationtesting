package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail {

	 @Given("user is on Gmail login page")
	    public void user_is_on_gmail_login_page() {
	        System.out.println("User is on Gmail login page");
	    }

	    @When("user enters username")
	    public void user_enters_username() {
	        System.out.println("User enters username");
	    }

	    @Then("Gmail home page should be displayed")
	    public void gmail_home_page_should_be_displayed() {
	        System.out.println("Gmail home page displayed");
	    }
}
