package guru.guruBank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDriver {

	public static WebDriver driver ;
	public Properties prop ;


	public WebDriver baseDriver()
	{
		prop=new Properties();
		try {
			FileInputStream fls = new FileInputStream ("C:\\Users\\Mustafa\\eclipse-workspace2\\guruBank\\prop.properties");
			prop.load(fls);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		//String browsername = prop.getProperty("browser");
		String browsername=System.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();


		}
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		return driver ;


	}


}
