package SeleniumPartA_Udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	//private static final TimeUnit  = null;
	//private static final String SECONDS = null;
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
	 driver = new ChromeDriver();  // lunch chrome driver 
		
	driver.manage().window().maximize(); //Maximize the web page

	driver.get("https://www.google.com/");
		
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	@Test
	public void googleTitleTest() {
	
		String title =driver.getTitle();
		System.out.println(title);
	
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("quit the browser");
		
	}
	
	
			
	
	
	
		
		
	}

	

}
