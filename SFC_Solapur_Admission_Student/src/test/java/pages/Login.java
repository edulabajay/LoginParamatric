package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import base.Basetest;

public class Login extends Basetest {

	
	WebDriverWait wait;
	
    // Page Object Declare
    @FindBy(id = "username")
    private WebElement Username;

    @FindBy(id = "password")
    private WebElement Pass;

    @FindBy(id = "kc-login")
    private WebElement loginbtn;

   

    public Login() {
    	
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
    }

    // Actions
    public void enterUsername_enterPassword(String username_email, String user_pass) {
        Username.sendKeys(username_email);
        Pass.sendKeys(user_pass);
        loginbtn.click();
    }

   
}
