package Selenium_Deopdown_CheckBox_ETC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAndRadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				/*check box
				driver.findElement(By.id("checkBoxOption1")).click(); //click on the check box
				//.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //in console show the it check or unchecked 
				

				//count of the check box: input[type*='checkbox']
				driver.findElements(By.cssSelector("input[type*='checkbox']")).size(); //size of the check box
				
				System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());*/
				
				
				
				/*Radio button
				
				driver.findElement(By.name("radioButton")).click(); //click on the radio button
				
				//size of the radio button
				
				driver.findElements(By.cssSelector("input[type*='radio']")).size();
				System.out.println(driver.findElements(By.cssSelector("input[type*='radio']")).size());*/
				
				//Assertion : 
				
				Assert.assertTrue(true);
				driver.findElement(By.name("radioButton")).click(); //click on the radio button
				
				//driver.findElements(By.cssSelector("input[type*='radio']")).size();
				System.out.println(driver.findElements(By.cssSelector("input[type*='radio']")).size());
				
				
				
				Assert.assertEquals("driver.findElements(By.cssSelector(\"input[type*='radio']\")).size();", "3");
				

				
				
	
		
				//Assertion= my expetion is true and assertion is true=== then execute the code otherwise it will fail 
						/*Assertion : to validate the test used the assertion , you need to download jar file and added to the package  
						 * Asset.assertequal === it will compare actual code that I writen in the scripts
						True + True ==True
						True + False ==False
						False+False== False*/
				
				
				
				
				
				
				
			
				
				
	}

}
