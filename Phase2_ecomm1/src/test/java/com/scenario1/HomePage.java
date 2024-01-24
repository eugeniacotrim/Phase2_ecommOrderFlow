package com.scenario1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePage {
	
	public static final By pages = By.xpath("//li[@class=\"cn-dropdown-item has-down pr12\"]");
	public static final By contact = By.xpath("(//a[@href=\"contact.html\"])[1]");
	public static final By googleMaps = By.xpath("//div[@class=\"google-map\"]");
	
	@Test
	public static void HomePageTest() {
		WebDriver driver = SetUpBrowser.OpenBrowser();
		
		Actions action = new Actions(driver);
		WebElement pagesDropdown = driver.findElement(pages);

		action.moveToElement(pagesDropdown).build().perform();
		driver.findElement(contact).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
		try {
			wait.until(ExpectedConditions.elementToBeClickable(googleMaps));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
