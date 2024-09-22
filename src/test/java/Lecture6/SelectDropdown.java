package Lecture6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement countryElement = driver.findElement(By.id("country"));
		
		Select dropdownCountry = new Select(countryElement);
		
		// Select options from the dropdown
//		dropdownCountry.deselectByVisibleText("India");
		
		//capture the options from the dropdown
		List<WebElement> options = dropdownCountry.getOptions();
		System.out.println("Number of options available in th dropdown = "+options.size());
		
		/* We cannot print all the options, as theses are WebElements.
		 So, to print these options in the console, we need to use for loop
		 and with the help of get method and get text method, we can print these options.
		 */
		//printing the options
//		for(int i=0; i<options.size();i++) {
//			String textOption = options.get(i).getText();
//			System.out.println(textOption);
//		}
		
		//print options using enhanced for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	}

}
