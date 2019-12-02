package guru.guruBank;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruBank_NewCustomer extends MainDriver {

	@BeforeTest
	public void getLogeed()
	{
		GuruBank_LandingPage_Test login = new GuruBank_LandingPage_Test();
		login.LaningPageTest();
	}

	@Test
	public void getNewCustomer()
	{
		GuruBank_Locators obj = new GuruBank_Locators(driver);
		obj.getNewCustomer().click();
		obj.getCustomerName().sendKeys(GuruBank_TestData.CUSTOMERNAME);
		
		if(obj.getGender().isSelected())
		{
			System.out.println("gender male is selected");
		}
	
		obj.getDOB().sendKeys("02091989");
		obj.getAddresstArea().sendKeys("Riyadh  Hai al quds");
		obj.getCity().sendKeys("Riyadh");
		obj.getState().sendKeys("test");
		
	}



}
