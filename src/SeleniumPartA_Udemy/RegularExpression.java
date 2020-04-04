package SeleniumPartA_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //create driver object for chrome browser 
		

//driver.get("https://www.facebook.com/");
driver.get("https://login.salesforce.com/");
//driver.get("https://www.rediff.com/");
//driver.get("https://www.google.com");

//for salesforce
driver.findElement(By.cssSelector("#username")).sendKeys("GM");// css: when id used the #idName 
driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("pass");//CSS: Class used .ClassName  and if it is space put .in the space 


/* 1. Verify in Chrompath before u run the script 
 * 2. Css customize id and class name below
 * 3. #idName
 * 4. .ClassName
 * 5. analyze the componint/element and pick of unique one */
 

driver.findElement(By.cssSelector("a[title*='Sign in']")).click();  // Css regular expression 
driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("GM Islam");//own xpath used 
driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("RizvanPassword");
driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();  //regular expression with xpath , here value took only procee not proceed
//using here sub txet of proceed 

//driver.findElement(By.xpath("//div[@id='fakebox']/div/div/[2]input")).sendKeys("Rabiul");
	}

}
