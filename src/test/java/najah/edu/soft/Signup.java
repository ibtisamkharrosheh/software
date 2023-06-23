package najah.edu.soft;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.MyApplication;

public class Signup {
	
	MyApplication app;
	public Signup() {
		app = new MyApplication();
	}
	
	
	@Given("I am on the sign-up page")
	public void i_am_on_the_sign_up_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("I enter my name as {string}")
	public void i_enter_my_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I enter my email as {string}")
	public void i_enter_my_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I enter my password as {string}")
	public void i_enter_my_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("I click on the sign-up button")
	public void i_click_on_the_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("I should be redirected to the home page")
	public void i_should_be_redirected_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("I should see a welcome message")
	public void i_should_see_a_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}



}
