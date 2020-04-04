package Selenium_Deopdown_CheckBox_ETC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitTimehandale {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1447866\\Desktop\\Selenium\\chromedriver.exe");

//diference between Thread.sleep(2000L); and dynamic wait?
//Ans: if selectet the thread.sleep it will must pause the test for partiular time , it is the hard wait for all time 
//if select the dynamic wait time : if the page will loaded within 2 seconds rest of 28 seconds totally ignore , it will save the time .

	


// to need to fully open the site it will take some time because lot of image and contain 
//TimeUnit seccond for that used dynamic wait time

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ebay.com/");//get the url
		
		driver.manage().window().maximize();  // after open the window then  maximize the windows
		driver.manage().deleteAllCookies(); // After maxmize the widow delete all cookies

		//below two is  dynamic wait : 
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//page load time out //give the maximum time to open the pate then perform the actions
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // implicitlywait for all the elements for web
		
		
	}

}
