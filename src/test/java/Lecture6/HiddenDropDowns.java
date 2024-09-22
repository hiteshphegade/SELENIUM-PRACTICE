package Lecture6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDowns {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login to OrangeHRM
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//click on PIM	
		driver.findElement(By.xpath("(//*[@class=\"oxd-main-menu-item-wrapper\"])[2]")).click();
		
		//click on Job Title drop-down
		driver.findElement(By.xpath("(//*[contains(@class,\"oxd-select-text--after\")])[3]")).click();
		
		//Capturing all the elements available in the list
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		//If above element is giving StaleElementReferenceException, then use explicit wait
		
		System.out.println("Size of the dropdown = " + options.size());
		
		//printing all the elements
		for(WebElement opt:options) {
			System.out.println(opt.getText());
			if(opt.getText().equalsIgnoreCase("QA Lead")) {
				opt.click();
			}
		}
		}

}
