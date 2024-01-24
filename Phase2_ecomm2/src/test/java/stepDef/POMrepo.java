package stepDef;

import org.openqa.selenium.By;

public class POMrepo {

	// POMshopPage
	public static final By prodImg1 = By.xpath("(//img[@class=\"hover-img\"])[1]");
	public static final By addCartImg1 = By.xpath("(//div[@class=\"add-to-cart-btn\"])[1]");
	public static final By cartArea = By.xpath("//div[@class=\"cart-area\"]");
	public static final By singCartItem = By.xpath("(//div[@class=\"single-cart-item\"])[1]");
	public static final By chcktBttn = By.xpath("//div[@class=\"checkout-btn mt-100\"]");

	// POMcheckoutPage
	public static final By firstNameTextBox = By.xpath("//input[@id=\"first_name\"]");
	public static final String firstName = "John";
	public static final By lastNameTextBox = By.xpath("//input[@id=\"last_name\"]");
	public static final String lastName = "Doe"; 
	public static final By countryDrpdwn = By.xpath("//div[@class=\"nice-select w-100\"]");
	public static final By countryName = By.xpath("//ul[@class=\"list\"]/li[7]");
	public static final By addressTextBox = By.xpath("//input[@id=\"street_address\"]");
	public static final String address = "Rua Governador Pedro de Toledo, 321";
	public static final By postcodeTextBox = By.xpath("//input[@id=\"postcode\"]");
	public static final String postcode = "123456";
	public static final By cityTextBox = By.xpath("//input[@id=\"city\"]");
	public static final String city = "Sao Paulo";
	public static final By provinceTextBox = By.xpath("//input[@id=\"state\"]");
	public static final String province = "SP";
	public static final By phoneTextBox = By.xpath("//input[@id=\"phone_number\"]");
	public static final String phone = "415 987 6543";
	public static final By emailTextBox = By.xpath("//input[@id=\"email_address\"]");
	public static final String email = "johndoe@gmail.com";
	public static final By orderDetailsSection = By.xpath("//ul[@class=\"order-details-form mb-4\"]");
	public static final By placeOrderBttn = By.xpath("(//a[@class=\"btn essence-btn\"])[2]");

}
