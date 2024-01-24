package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibDriver {
	
	public static WebDriver driver;
	
	public static WebDriver openBrowser() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		
		return driver;
	}
}
