package TestCases;
import Utility.Base;

import org.testng.annotations.Test;

import PageObjects.Dashboard;

public class Test_2 extends Base {
	
	@Test
	public void ClickTest(){
		Dashboard db = new Dashboard(Driver);
		db.elementProductBtn.click();
		
		
		
	}

}
