package guru.guruBank;

import org.testng.annotations.Test;

public class GuruBank_LandingPage_Test extends MainDriver {

	@Test
	public void LaningPageTest()
	{
		GuruBank_Locators obj = new GuruBank_Locators(driver);


		driver = baseDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		obj.getUserID().sendKeys(GuruBank_TestData.USERID);
		obj.getPassword().sendKeys(GuruBank_TestData.PASSWORD);
		obj.getLogin().click();








	}

}
