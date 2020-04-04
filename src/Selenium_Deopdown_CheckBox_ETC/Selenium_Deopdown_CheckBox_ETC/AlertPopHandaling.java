package Selenium_Deopdown_CheckBox_ETC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopHandaling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// handling Alert button

		String text = "Rabiul";
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.id("alertbtn")).click(); // click on alert button

		System.out.println(driver.switchTo().alert().getText()); // after click on alert grap the test message and show
		// in the console

		driver.switchTo().alert().accept();

		// driver will find the alert message and accetpt
		// driver.switchTo().alert().dismiss(); //if you not accetp click on cancel or
		// no by dismiss method

		// handaling conform button

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText()); //
		driver.switchTo().alert().dismiss(); // here not accept

	}

}
