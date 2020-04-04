package Selenium_Deopdown_CheckBox_ETC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationWebSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");

                WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				

				driver.get("https://www.google.com");//  first open the google page 
				
				driver.navigate().to("https://www.ebay.com/"); //then nevegate to the ebay page
				driver.navigate().back(); //back to the again google page 
				
		        Thread.sleep(3000); // wait for 3 seconds
		        
		        // this is called Back and forward simulation 
		        
		        driver.navigate().forward(); //again go to the ebay page
		        
		        Thread.sleep(2000);
		        
		        driver.navigate().back();// again back to google page
		        driver.navigate().refresh(); //refersh the browser 
		        
		//question : difference between  get(),vs naviage().to 
		        //Ans: get ().methods lunch the url first time but navitage().to methods used for lunching  extranal URL
		        
		        
		        
				
				
				
				
	
				

	}

}
