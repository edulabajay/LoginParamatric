package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public Basepage() {
		
		try {
			
			prop = new Properties();
            FileInputStream ip = new FileInputStream("");
            prop.load(ip);

		}catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	

public  void Initialization() {
	
    String browser_name = prop.getProperty("browser");

    if (browser_name.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup(); // Ensure WebDriverManager sets up the driver
        driver = new ChromeDriver(); // Assign to the class-level driver variable
    }
}


}
