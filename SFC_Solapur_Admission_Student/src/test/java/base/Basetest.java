package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelUtils;

public class Basetest {

    public static WebDriver driver;
    public static Properties prop;

    // Constructor to load properties
    public Basetest() {
       
        try {
        	prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\info\\eclipse_Nwe_Version_Mumbai\\SFC_Solapur_Admission_Student\\src\\test\\java\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
           
        } catch (IOException e) {
            e.printStackTrace();
           
        }
    
   
    }

  
   
	
	@SuppressWarnings("deprecation")
	public static void setUp() {
        String browsername = prop.getProperty("browser");

        if (browsername.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
       

    }

   
    



//Waits
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(ExcelUtils.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ExcelUtils.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);


		
		driver.get(prop.getProperty("url"));

		}
		
		}

