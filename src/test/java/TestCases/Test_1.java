package TestCases;

import org.testng.annotations.Test;

import PageObjects.Dashboard;
import Utility.Base;

public class Test_1 extends Base{
	
	@Test
	public void clickTest()
	{
		Dashboard db = new Dashboard(Driver);
		db.sendElements();
		db.element_click.click();
		db.element_cart.click();
		db.element_checkout.click();
		db.sendElementsInForm();
		
		/*db.element_fname.sendKeys("Santu");
		db.element_lname.sendKeys("Shaw");
		db.element_billing_company.sendKeys("xyz");
		db.element_address1.sendKeys("5th lane(Right),xyz");
		db.element_address2.sendKeys("Kanchan Apartment");
		db.element_billing_city.sendKeys("Kolkata");
		db.element_billing_state.click();
		db.elementBillingState.click();
		db.elementBillingPostcode.sendKeys("700153");
		db.elementBillingPhone.sendKeys("9876543210");
		db.elementBillingEmail.sendKeys("abc@gmail.com");
		db.elementAccountUsername.sendKeys("abc999");
		db.elementAccountPassword.sendKeys("abc12345");
		db.elementTerms.click();
		db.elementPlaceOrder.click();*/
	}

}
