package Lecture6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Select the search box and enter the word
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Javascript");
		
		//Capture all the elements from the Options available
		List<WebElement> optionsAvailable = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
		System.out.println("Options available for the search = "+optionsAvailable.size());
		
		//Print all options from the list
		for(WebElement list:optionsAvailable) {
			System.out.println(list.getText());
			}
		
		
		//Select specific from search
		for(int i=0; i<optionsAvailable.size(); i++) {
			optionsAvailable.get(i).getText();
				if(optionsAvailable.get(i).getText().equalsIgnoreCase("Javascript")) {
					optionsAvailable.get(i).click();
				}
		}
		
		
		
		
		
		
		
		
		
	}

}
