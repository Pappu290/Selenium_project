package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver Driver;

	@FindBy(className = "search-field")
	WebElement elements;
	
	@FindBy(xpath = "//button[@value='Search']")
	public WebElement element_click;
	
	@FindBy(linkText = "Add to cart")
	public WebElement element_cart;
	
	@FindBy(linkText = "Checkout")
	public WebElement element_checkout;
	
	//webelements of form
	@FindBy(id = "billing_first_name")
	public WebElement element_fname;
	@FindBy(id = "billing_last_name")
	public WebElement element_lname;
	@FindBy(id = "billing_company")
	public WebElement element_billing_company;
	//@FindBy(id = "billing_address_1_field")
	@FindBy(xpath = "//input[@id ='billing_address_1']")
	public WebElement element_address1;
	@FindBy(id = "billing_address_2")
	public WebElement element_address2;
	@FindBy(id = "billing_city")
	public WebElement element_billing_city;
	@FindBy(id = "select2-billing_state-container")
	public WebElement element_billing_state;
	@FindBy(xpath = "//span[@class='select2-results']//li[2]")
	public WebElement elementBillingState;
	@FindBy(id = "billing_postcode")
	public WebElement elementBillingPostcode;
	@FindBy(id = "billing_phone")
	public WebElement elementBillingPhone;
	@FindBy(id = "billing_email")
	public WebElement elementBillingEmail;
	@FindBy(id = "account_username")
	public WebElement elementAccountUsername;
	@FindBy(id = "account_password")
	public WebElement elementAccountPassword;
	@FindBy(id = "terms")
	public WebElement elementTerms;
	@FindBy(id = "place_order")
	public WebElement elementPlaceOrder;
	
	
	
	
	
	public Dashboard(WebDriver Driver)
	{
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}

	public void sendElements()
	{
		 elements.sendKeys("tea");
	 }
	public void sendElementsInForm() 
	{
		element_fname.sendKeys("Santu");
		element_lname.sendKeys("Shaw");
		element_billing_company.sendKeys("xyz");
		element_address1.sendKeys("5th lane(Right),xyz");
		element_address2.sendKeys("Kanchan Apartment");
		element_billing_city.sendKeys("Kolkata");
		element_billing_state.click();
		elementBillingState.click();
		elementBillingPostcode.sendKeys("700153");
		elementBillingPhone.sendKeys("9876543210");
		elementBillingEmail.sendKeys("abc@gmail.com");
		elementAccountUsername.sendKeys("abc999");
		elementAccountPassword.sendKeys("abc12345");
		elementTerms.click();
		elementPlaceOrder.click();
	}
	
	//Test case 2
	@FindBy(className ="product-btn")
	public WebElement elementProductBtn;
	

}


