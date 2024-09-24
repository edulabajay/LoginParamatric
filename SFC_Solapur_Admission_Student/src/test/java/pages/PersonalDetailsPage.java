package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage {

	@FindBy(id = "address") // Adjust locator
	WebElement addressField;

	@FindBy(id = "pincode") // Adjust locator
	WebElement pincodeField;

	@FindBy(id = "city") // Adjust locator
	WebElement cityField;

	@FindBy(id = "state") // Adjust locator
	WebElement stateField;

	@FindBy(id = "locationArea") // Adjust locator
	WebElement locationAreaDropdown;

	@FindBy(id = "district") // Adjust locator
	WebElement districtField;

	@FindBy(id = "permanentAddressSameAsCorrespondence") // Adjust locator
	WebElement permanentAddressCheckbox;

	@FindBy(id = "addressPermanent") // Adjust locator
	WebElement addressPermanentField;

	@FindBy(id = "pincodePermanent") // Adjust locator
	WebElement pincodePermanentField;

	@FindBy(id = "cityPermanent") // Adjust locator
	WebElement cityPermanentField;

	@FindBy(id = "statePermanent") // Adjust locator
	WebElement statePermanentField;

	@FindBy(id = "locationAreaPermanent") // Adjust locator
	WebElement locationAreaPermanentDropdown;

	@FindBy(id = "districtPermanent") // Adjust locator
	WebElement districtPermanentField;

	@FindBy(id = "taluka") // Adjust locator
	WebElement talukaField;

	// Method to fill personal details remains the same

	public void fillAddressDetails(String address, String pincode, String city, String state, String locationArea, 
			String district, String permanentAddressSameAsCorrespondence, 
			String addressPermanent, String pincodePermanent, String cityPermanent, 
			String statePermanent, String locationAreaPermanent, String districtPermanent, 
			String taluka) {
		addressField.sendKeys(address);
		pincodeField.sendKeys(pincode);
		cityField.sendKeys(city);
		stateField.sendKeys(state);
		locationAreaDropdown.sendKeys(locationArea);
		districtField.sendKeys(district);

		// If permanent address checkbox is selected
		if (permanentAddressSameAsCorrespondence.equalsIgnoreCase("yes")) {
			permanentAddressCheckbox.click();
		} else {
			addressPermanentField.sendKeys(addressPermanent);
			pincodePermanentField.sendKeys(pincodePermanent);
			cityPermanentField.sendKeys(cityPermanent);
			statePermanentField.sendKeys(statePermanent);
			locationAreaPermanentDropdown.sendKeys(locationAreaPermanent);
			districtPermanentField.sendKeys(districtPermanent);
		}

		talukaField.sendKeys(taluka);
	}
}

