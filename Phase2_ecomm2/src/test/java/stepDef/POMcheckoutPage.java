package stepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.LibDriver;

public class POMcheckoutPage {
	
	WebDriver driver;
	
	public void addDetailsBillingPage() {
		this.driver = LibDriver.driver;
		WebElement firstNameBox = driver.findElement(POMrepo.firstNameTextBox);
		firstNameBox.sendKeys(POMrepo.firstName);
		
		WebElement lastNameBox = driver.findElement(POMrepo.lastNameTextBox);
		lastNameBox.sendKeys(POMrepo.lastName);
		
		driver.findElement(POMrepo.countryDrpdwn).click();
		driver.findElement(POMrepo.countryName).click();
		
		WebElement addressBox = driver.findElement(POMrepo.addressTextBox);
		addressBox.sendKeys(POMrepo.address);
		
		WebElement postcodeBox = driver.findElement(POMrepo.postcodeTextBox);
		postcodeBox.sendKeys(POMrepo.postcode);
		
		WebElement cityBox = driver.findElement(POMrepo.cityTextBox);
		cityBox.sendKeys(POMrepo.city);
		
		WebElement provinceBox = driver.findElement(POMrepo.provinceTextBox);
		provinceBox.sendKeys(POMrepo.province);
		
		WebElement phoneBox = driver.findElement(POMrepo.phoneTextBox);
		phoneBox.sendKeys(POMrepo.phone);
		
		WebElement emailBox = driver.findElement(POMrepo.emailTextBox);
		emailBox.sendKeys(POMrepo.email);
	}
		
	public void orderDetailsTrue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String orderDetails = "TRUE";
		try {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(POMrepo.orderDetailsSection, ""));
		} catch (Exception e) {
			orderDetails = "FALSE";
		}
		
		Assert.assertEquals(orderDetails, "TRUE");
	}
		
	public void PlaceOrderBttn() {
		driver.findElement(POMrepo.placeOrderBttn).click();
	}

}
