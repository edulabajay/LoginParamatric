package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(

		features = "C:\\Users\\info\\eclipse_Nwe_Version_Mumbai\\SFC_Solapur_Admission_Student\\src\\test\\resources\\login.feature",
		glue = {"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports"},
		monochrome=true, // to display console in  readable output
		dryRun = false

		)


public class TestRunner {

}
