package Lecture3_WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//System.out.println(driver.getTitle());	//return title of the webpage in form of string
		
		//System.out.println(driver.getCurrentUrl());	//returns current url of the page in the form of string
		
		//String windowID = driver.getWindowHandle();
		//System.out.println("ID of current window = " + windowID);
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//Set <String> windowIDs = driver.getWindowHandles();		// It will return the values in the form set
															//If we want to extract each value, then use looping.
		//System.out.println(windowIDs);
		
		//isDisplayed() method
		WebElement logoOrangeHRM = driver.findElement(By.className("orangehrm-login-branding"));
		System.out.println("Is logo displayed = " + logoOrangeHRM.isDisplayed());
		
		
		
	}

}
