package Selenium_Deopdown_CheckBox_ETC;
//nobin automation lab
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropElement {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();  // after open the window then  maximize the windows
		driver.manage().deleteAllCookies(); // After maxmize the widow delete all cookies
		
		
		//Interview question : how to handale drag and drop element ?
		//Ans : used actions object
		
		
		driver.switchTo().frame(0); //make sure this site has iframe or not , if not there no need to perform driver.switchTo().frame(0);
		// how to check if there are iframe or not : just right click and go to view soruce page and ctrl+F = type iframe
		
		Actions action =new Actions(driver);  //create actions classs
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver
				.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();
		//above click on the source and hold , move to target and relese ,built, and finally perform 
		
		
		
	}

}
