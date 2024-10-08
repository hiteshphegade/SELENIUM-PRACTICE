package Lecture7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Web Table Handling
		
		//to capture the number of rows from the table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//int rows1 = driver.findElements(By.tagName("tr")).size();
		
		for(int i=1; i<=rows;i++) {
			
		}
	}

}
