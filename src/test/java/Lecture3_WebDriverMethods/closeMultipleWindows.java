package Lecture3_WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(3000);			//applied intentionally to see all windows
		Set<String> windowids= driver.getWindowHandles();
		
		for(String pageID:windowids) {
			String title = driver.switchTo().window(pageID).getTitle();
			if(title.equalsIgnoreCase("OrangeHRM")) {
				driver.close();	//It will close parent window.
			}
		}

}
}