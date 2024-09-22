package Lecture3_WebDriverMethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMultiWindows_1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
		List<WebElement> urls = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
			
		for(WebElement getURL: urls) {
			getURL.click();
			Thread.sleep(3000);			//intentionally added to see tabs
			
			}
		Set<String> windowids = driver.getWindowHandles();
		for(String win_id:windowids) {
				String pageTitle = driver.switchTo().window(win_id).getTitle();
					if(pageTitle.equals("JavaScript - Wikipedia") || pageTitle.equals("Javanese language - Wikipedia")) {
						driver.close();
					}
		}
			}

}
