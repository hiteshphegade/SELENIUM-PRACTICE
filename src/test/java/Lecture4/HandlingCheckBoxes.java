package Lecture4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alldays = driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
//		//Scenario 1 - To select all the check boxes
//		for(WebElement day:alldays) {
//			System.out.println(day.getText());
//			day.click();
//		}
		
		//Scenario 2 - To select last 3 checkboxes
		/* Formula to select'n' number of check boxes from last
		  Total no. od check boxes - how many checkboxes want to select = starting index (i) */
		// e.g. in this case, ((alldays.size)-3) = i	
//		for(int i=(alldays.size()-3); i<alldays.size();i++) {
//			
//			alldays.get(i).click();
//			
//		}
		
		//Scenario 2 - To select first 3 checkboxes
			for(int i=0; i<3; i++) {
			
			alldays.get(i).click();
			}
		
	}

}
