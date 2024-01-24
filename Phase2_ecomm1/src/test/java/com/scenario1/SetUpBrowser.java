package com.scenario1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetUpBrowser {

	public static WebDriver driver;
	
	@Test
	public static WebDriver OpenBrowser() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/ecomm/");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		}
		return driver;
	}
	
	
	
}
