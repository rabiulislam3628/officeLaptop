package Selenium_Deopdown_CheckBox_ETC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// instated of used the same code again and agian used for loop or wile loop Ex;if you add 50 passanger reservation
// used for loop .
public class Static_Dropdown {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click(); //open the passanger static drop down box
	//	Thread.sleep(2000L); //wait for 2 second and then move forwoad 
		
		//while loop 
		/*int i=1;
		while (i<10)
		{
		driver.findElement(By.id("hrefIncAdt")).click();i++; //add 9 passanger: add one passanger then chek the condition then clik agian until contional will met
		}
		{
		driver.findElement(By.className("buttonN")).click(); }// after 9 passanger add done*/
		//click on done 
		
		
		
	//for loop: when we execute the code for many time , we used for loop
		
		for(int A=1;A<5;A++) //add 4 times 
		{
			driver.findElement(By.id("hrefIncAdt")).click();//add passanger 1 ,2,3,4, 5 then execute )
			
		}
		{
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//after execute the code get the result by text inthe console for validate the result.
			
		
		}
		
	}

}
