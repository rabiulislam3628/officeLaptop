package Selenium_Deopdown_CheckBox_ETC;
//Check box dropdown and dynamic dropdown
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class DynamicDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		
		
		
		
	//dynamic dropdown
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //select the departure city 
		driver.findElement(By.xpath("//a[contains(text(),'Delhi (DEL)')]")).click(); //departure city 
		//Thread.sleep(2000L); //sleep time wati for 2 second for open the apprival list 
		
		//driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click(); //arrival city , here [2] is the second pune selectecd 
				
	//parents and child relationship xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//td[@class='mapbg'] //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Pune (PNQ)')]"));
		
	
	}

	
	
}
