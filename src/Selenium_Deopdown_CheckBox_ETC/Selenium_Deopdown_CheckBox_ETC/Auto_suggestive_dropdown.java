package Selenium_Deopdown_CheckBox_ETC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestive_dropdown {
	public static void main(String[] args) throws InterruptedException{

	//public static void main(String[] args){
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		
		driver.findElement(By.id("fromCity")).clear(); //first clear the defult borowser
		driver.findElement(By.id("fromCity")).sendKeys("MUM");
		Thread.sleep(2000L); 
		
	driver.findElement(By.id("Thread.sleep(2000L); ")).sendKeys(Keys.ENTER);
	}

}
