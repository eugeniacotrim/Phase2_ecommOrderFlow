package stepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.LibDriver;

public class POMshopPage {

	WebDriver driver;
		
	public void hoverImage() {		
		this.driver = LibDriver.driver;
		
		Actions action = new Actions(driver);
		
		WebElement productImage1 = driver.findElement(POMrepo.prodImg1);
		action.moveToElement(productImage1).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		WebElement addCartImage1 = driver.findElement(POMrepo.addCartImg1);
		try {
			wait.until(ExpectedConditions.visibilityOf(addCartImage1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnCart() {
		driver.findElement(POMrepo.addCartImg1).click();
	}

	public void shopBagContainsTrue() {
		driver.findElement(POMrepo.cartArea).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		String cartItem = "TRUE";
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(POMrepo.singCartItem));
		} catch (Exception e) {
			cartItem = "FALSE";
		}
		
		Assert.assertEquals(cartItem, "TRUE");
	}

	public void checkoutBttn() {
		driver.findElement(POMrepo.chcktBttn).click();
	}
	
}
