package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
			
	public static void launchApp () {
	loadConfig();
	String browser= prop.getProperty("browser");
	if(browser.equalsIgnoreCase("Chrome")) {
	System.out.println("Executing in Chrome");
	WebDriverManager.chromedriver().setup();	
	driver=new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("Edge")) {
	System.out.println("Executing in Edge");
	WebDriverManager.edgedriver().setup();	
	driver=new EdgeDriver();
		

	}
	else if (browser.equalsIgnoreCase("Firefox")) {
	System.out.println("Executing in Firefox");	
	WebDriverManager.firefoxdriver().setup();	
	driver=new FirefoxDriver();
	
	 
	}
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().deleteAllCookies();
	 driver.get(prop.getProperty("url"));
	}
	
	public static void closeapp() {
		
		driver.quit();
	}
	
	public static void loadConfig() {
	prop=new Properties();	
	FileInputStream fs;
	try {
		fs = new FileInputStream(System.getProperty("user.dir")+"/Configuration/Config.properties");
		prop.load(fs);
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	
	}
	}	
	
	

