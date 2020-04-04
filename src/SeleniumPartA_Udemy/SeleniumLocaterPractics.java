package SeleniumPartA_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocaterPractics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //create driver object for chrome browser 
		
		driver.get("https://www.facebook.com/");
		
		
		
		
		driver.findElement(By.id("email")).sendKeys("Rabiulislam3628@gmail.com"); //pass the username in the edit box
		

		driver.findElement(By.name("pass")).sendKeys("Rizvan"); //pass the password 
		
		driver.findElement(By.linkText("Forgot account?")).click(); // click on the forgot account link 
		
		//driver.findElement(By.className("inputtext")).sendKeys("Password");// same classname in the 2 object but it is taking first one like userName   
	}

}
