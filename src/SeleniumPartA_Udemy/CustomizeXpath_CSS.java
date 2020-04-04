package SeleniumPartA_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath_CSS {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //create driver object for chrome browser 
		

//driver.get("https://www.facebook.com/");
driver.get("https://login.salesforce.com/");

//used my own Xpath:   //TagName[@Attributes=’Values’] or //*[@Attributes=’Values’]    when tag name is unknow used * key 

/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gm.islam@tcs.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("gm111111111111");
driver.findElement(By.xpath("//*[@name='Login']")).click();*/


//used my won CSS : TagName[Attributes='Values'] or *[Attributes='Values']   //used * insted of tagname

//driver.findElement(By.cssSelector("input[id='username'")).sendKeys("gmislam");
driver.findElement(By.cssSelector("*[id='username'")).sendKeys("gmislam");

	driver.findElement(By.cssSelector("*[id='Login'")).click();
		driver.findElement(By.cssSelector("*[id='forgot_password_link'")).click();
		
		driver.quit();

	}

}
