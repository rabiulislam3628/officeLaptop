package Selenium_Deopdown_CheckBox_ETC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementAndDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();  // after open the window then  maximize the windows
		driver.manage().deleteAllCookies(); // After maxmize the widow delete all cookies
		
		Actions actions =new Actions(driver); //actions class object 
		//Mouse movement done by actions class 
		actions.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();//Mouse movemient is done
	
		Thread.sleep(3000L);
		
     driver.findElement(By.linkText("Hot Meals")).click(); //click on the hot meals 
     

	}

}
