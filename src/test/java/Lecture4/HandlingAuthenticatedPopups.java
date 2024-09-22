package Lecture4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticatedPopups {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Special type of alert - Authentication Alert
		/* before using this method, first check whether it is authenticated 
		alert or normal alert manually */
//		driver.get("http://the-internet.herokuapp.com/basic_auth");		//1st run this to see the alert
		
		// In this case,we need to inject username and password with the URL.
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
	}

}
