package guru.guruBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuruBank_Locators extends MainDriver{

	private By USERID = By.xpath("//input[@name='uid']");
	private By PASSWORD = By.xpath("//input[@name='password']");
	private By LOGIN = By.xpath("//input[@name='btnLogin']");
	private By NEWCUSTOMER = By.linkText("New Customer");
	private By CUSTOMERNAME = By.xpath("//input[@name='name']");
	private By GENDER = By.xpath("//input[@value='m']");
	private By DOB = By.xpath("//input[@id='dob']");
	private By ADDRESS = By.xpath("//textarea [@name='addr']");
	private By CITY = By.xpath("//input[@name='city']");
	private By STATE = By.xpath("//input [@name='state']");
	
	
	
	
	
	



	//**********************************************************

	//constructor
	public GuruBank_Locators(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver=this.driver;
	}

	//********************************************************

	//LandingPage locators
	public WebElement getLogin()
	{
		return driver.findElement(LOGIN);
	}

	public WebElement getPassword()
	{
		return driver.findElement(PASSWORD);

	}

	public WebElement getUserID()
	{
		return driver.findElement(USERID);
	}
	//************************************************************

	//create new customer locator
	
	public WebElement getNewCustomer()
	{
		return driver.findElement(NEWCUSTOMER);
	}
	
	public WebElement getCustomerName()
	{
		return driver.findElement(CUSTOMERNAME);
	}
	
	public WebElement getGender()
	{
		return driver.findElement(GENDER);
	}
	
	public WebElement getDOB()
	{
		return driver.findElement(DOB);
	}
	
	public WebElement getAddresstArea()
	{
		return driver.findElement(ADDRESS);
	}
	public WebElement getCity()
	{
		return driver.findElement(CITY);
	}
	public WebElement getState()
	{
		return driver.findElement(STATE);
	}
	//************************************************************
	


}
