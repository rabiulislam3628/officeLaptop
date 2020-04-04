package Selenium_Deopdown_CheckBox_ETC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Assertion= my expetion is true and assertion is true=== then execute the code otherwise it will fail 
/*Assertion : to validate the test used the assertion 
 * Assert.assertequal === it will compare actual code that I writen in the scripts
True + True ==True
True + False ==False
False+False== False*/

public class AssertionValidationTest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //click on the round trip
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
	//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		
		
		
		 
		 //System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //total check box (6) size of the check box in the site showing in the consoel

		 //Assertion 
	    // Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 
		
		
		
		

	//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		// calander 
	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
	}
	

}
