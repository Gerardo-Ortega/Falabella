package com.falabella.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.falabella.pages.actions.TopNavigation;


public class Page {
	
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public static String browser;
	public static TopNavigation topNav;
	public static Actions action;
	
	public static void initConfiguration() {
			
		if(Constants.browser.equals("firefox")) {
		  driver = new FirefoxDriver();
		  log.debug("Launching Firefox");
		}else if(Constants.browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			log.debug("Launching Chrome");
			action =new Actions(driver);
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		topNav = new TopNavigation(driver);

	}
	
	public static void click(WebElement element) {

		element.click();
		log.debug("Clicking on an Element : "+element);
	}
	
	
	public static void type(WebElement element, String value) {

		element.sendKeys(value);
		log.debug("Typing in an Element : "+element+" entered value as : "+value);

	}
	
	public static void typeClear(WebElement element, String value) {
		
		element.click();
		element.sendKeys(value);

	}
	
	public static void scroll(WebElement element) {
	  JavascriptExecutor js = (JavascriptExecutor) driver;	   		
	   js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	
	public static void typeScript(WebElement element,String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].value='"+value+"';", element);
	}
	
	
	public static void rollOver(WebElement element) {
		action.moveToElement(element).perform(); 

	}
	
	
	
	public static void quitBrowser() {
		driver.quit();
	}

}
