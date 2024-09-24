package stepDefinitions;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PersonalDetailsPage;

public class User_fills_in_personal_details {


@Given("User is on the login page")
public void user_is_on_the_login_page() {
    
}

@When("User logs in with username {string} and password {string}")
public void user_logs_in_with_username_and_password(String string, String string2) {
   
}

@When("User fills in personal details:")
public void user_fills_in_personal_details(Map<String, String> details) {
	 PersonalDetailsPage.fillPersonalDetails(
			 
	  details.get("lastName"),
      details.get("firstName"),
      details.get("middleName"),
      details.get("parentName"),
      details.get("fatherFirstName"),
      details.get("motherName"),
      details.get("nameAsPerMarksheet"),
      details.get("nameAsPerAadhaar"),
      details.get("gender"),
      details.get("dob"),
      details.get("bloodGroup"),
      details.get("aadhaarLast4"),
      details.get("religion"),
      details.get("admissionCategory"),
      details.get("casteCategory"),
      details.get("speciallyAbled"),
      details.get("placeOfBirth"),
      details.get("motherTongue"),
      details.get("maritalStatus"),
      details.get("nationality"),
      details.get("citizenshipCountry")
  );
}


@When("User fills in address details:")
public void user_fills_in_address_details(io.cucumber.datatable.DataTable dataTable) {
  
}
@When("User fills in contact details:")
public void user_fills_in_contact_details(io.cucumber.datatable.DataTable dataTable) {
    
}

@When("User fills in other details:")
public void user_fills_in_other_details(io.cucumber.datatable.DataTable dataTable) {
    
}

@When("User clicks the save button")
public void user_clicks_the_save_button() {
    
}

@Then("User is redirected to the education details page")
public void user_is_redirected_to_the_education_details_page() {
    
}

}
