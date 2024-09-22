package Lecture4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unselect_Randomly_Selected_checkboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		//To demonstrate, 1st we will select some boxes
		for(int i=2; i<5; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);		// Intentionally used to see the boxes are checked
		//Now, we unselect those boxes which are selected, but remaining boxes should not get selected
		
		for(int i=2; i<5; i++) {
			if(checkboxes.get(i).isSelected()==true) {
			checkboxes.get(i).click();
		}
		}
		
		
		
	}

}
