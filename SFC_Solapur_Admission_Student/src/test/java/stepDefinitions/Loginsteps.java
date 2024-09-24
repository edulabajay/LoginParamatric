package stepDefinitions;


import base.Basetest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Login;


public class Loginsteps extends Basetest {

	
	Login login = new Login();


	@Given("User should be on the login page")
	public void user_should_be_on_the_login_page() {
		
		Basetest.setUp();
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String username_email, String user_pass) {
		login = new Login();
		login.enterUsername_enterPassword(username_email, user_pass);
		
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		String expectedUrl = "https://devpahsu.admissiondesk.org/pages/dashboard";
		if (driver.getCurrentUrl().equals(expectedUrl)) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}  
	
	driver.close();
	}

	
}

