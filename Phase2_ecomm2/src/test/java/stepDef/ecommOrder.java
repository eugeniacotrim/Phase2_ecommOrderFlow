package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.LibDriver;

public class ecommOrder {

	WebDriver driver;
	
	POMshopPage POMshop = new POMshopPage();
	POMcheckoutPage POMcheckout = new POMcheckoutPage();
	
	@Given("user is on the shop page")
	public void user_is_on_the_shop_page() {
		this.driver = LibDriver.openBrowser();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/ecomm/shop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user hovers the mouse over a product image")
	public void user_hovers_the_mouse_over_a_product_image() {
		POMshop.hoverImage();
	}

	@Then("user is able to click on the Add to Cart button")
	public void user_is_able_to_click_on_the_add_to_cart_button() {
		POMshop.clickOnCart();
	}

	@When("shopping bag contains at least one product")
	public void shopping_bag_contains_at_least_one_product() {
		POMshop.shopBagContainsTrue();
	}

	@Then("user is able to click on the Checkout button")
	public void user_is_able_to_click_on_the_checkout_button() {
		POMshop.checkoutBttn();
	}

	@Then("user is able to add all required details in the Billing Address page")
	public void user_is_able_to_add_all_required_details_in_the_billing_address_page() {
		POMcheckout.addDetailsBillingPage();
	}

	@When("order contains at least one product")
	public void order_contains_at_least_one_product() {
		POMcheckout.orderDetailsTrue();
	}

	@Then("user is able to click on the Place Order button")
	public void user_is_able_to_click_on_the_place_order_button() {
		POMcheckout.PlaceOrderBttn();
	}
	
}
