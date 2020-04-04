package SeleniumPartA_Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChormeBrowser1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();  //create driver object for chrome browser 
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize(); //Maximize the web page
	
	System.out.println(driver.getTitle());  //to validate the page titale is correct and print in the consloul 
	
	System.out.println(driver.getCurrentUrl()); //to validate right URL in the Browser and print in the consoul 
	
	//System.out.println(driver.getPageSource()); //print the page sources 
	
	driver.navigate().to ("https://yahoo.com"); //first open the google page then navigate to yahoo page 
	// driver.navigate().back(); //go back to the google page again 
	//driver.navigate().forward();//move forward the another page
	
	driver.close(); //Close the current browser 
	//driver.quit();  // all the browser will be close by the selenium script 
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
