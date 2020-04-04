package SeleniumPartA_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_CSS_locatorPractics {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //create driver object for chrome browser 
		

//driver.get("https://www.facebook.com/");
driver.get("https://login.salesforce.com/");


//driver.findElement(By.id("email")).sendKeys("Rabiulislam3628@gmail.com"); //pass the username 
		
//driver.findElement(By.name("pass")).sendKeys("Rizvan"); //pass the password 

// below used the xpath 

//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rabiulislam3628@gmail.com"); //xpath 

//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rizven"); //xpath used for pass the password
      
//driver.findElement(By.xpath("//label[@id='loginbutton']")).click();//Xpath used for click on login 

//below used CSS
driver.findElement(By.cssSelector("#username")).sendKeys("rabi.shafi@yahoo.com");

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1111111fdsfsdf");

driver.findElement(By.xpath("//input[@id='Login']")).click();
driver.findElement(By.cssSelector("#forgot_password_link")).click();



//driver.findElement(By.cssSelector("#email")).sendKeys("rabi.shafi@yahoo.com");
//driver.findElement(By.cssSelector("#pass")).sendKeys("111111");
//driver.findElement(By.xpath("//input[@id='u_0_2']")).click();


//driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();

//System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getText());  
    
    //how Customize Xpath 
//Rules:  //tagname[@attribute='vlues']    //tagname= input, attribute==class/name 

//driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("rabi.shafi@yahoo.com");

//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("111111");

//driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	

		
		

	}

}
