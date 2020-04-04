package Selenium_Deopdown_CheckBox_ETC;

//Ctrl+Shift+F == orgainze the code and looks nice

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

public class TakeScreenShort {

	private static final String OutPutType = null;

	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com");//  first open the google page 
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("I am a software engineer");
	
	TakesScreenshot ss= (TakesScreenshot)driver;
	
	File Sources =ss.getScreenshotAs(OutputType.FILE);
	
	Utils.copyFile(Sources, new File("./ScreenShot/GoogleFirstPage.png"));
	
	
	
	
	driver.quit();
	

	}

}
