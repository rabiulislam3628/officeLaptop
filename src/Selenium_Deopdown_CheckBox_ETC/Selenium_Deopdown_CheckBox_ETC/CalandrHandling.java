package Selenium_Deopdown_CheckBox_ETC;
//Radio button, dynamic dropdown, calander handaling 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalandrHandling {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//Radio button 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //radio for round trip
		
		//dynamic dropdown // 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //select the departure city 
				driver.findElement(By.xpath("//a[contains(text(),'Delhi (DEL)')]")).click(); //departure city 
				//Thread.sleep(2000L); //sleep time wati for 2 second for open the apprival list 
				
		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click(); //arrival city , here [2] is the second pune selectecd 
				
			//calander handling: You must select first . 1. Oneway , deperture and arrival city then clander date 
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();//Defart clander date for deperture date  will be selected or current date 
	
		//driver.findElement(By.className(".ui-state-default.ui-state-active")).click(); arival date is not working here 
	
			

	}

}
