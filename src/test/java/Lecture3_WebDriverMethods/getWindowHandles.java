package Lecture3_WebDriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids= driver.getWindowHandles();
		
		//Approach 1 - to extract individual ID
	/*	
	  	List<String> windowIDList = new ArrayList(windowids);
		String parentID = windowIDList.get(0);
		String childID = windowIDList.get(1);
		
		System.out.println("Title of the parent page = "+driver.getTitle());
		driver.switchTo().window(childID);
		System.out.println("Title of the child page = "+driver.getTitle());			
	*/
		
		//Approach 2 - to extract individual ID using enhanced for loop
		for(String pageID:windowids) {
			String title = driver.switchTo().window(pageID).getTitle();
			if(title.equalsIgnoreCase("Human Resources Management Software | OrangeHRM")) {
				System.out.println("URL of the child page = "+ driver.getCurrentUrl());
			}
		}
		
		driver.quit();
		}

}
