package Lecture3_WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class conditionalMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));	//Explicit wait declaration
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
		
		
		
		
		//isEnabled() method
		boolean status = driver.findElement(By.id("name")).isEnabled();
		//Thread.sleep(2000);
		System.out.println("Status of the input box = " + status);
		
		//ischecked() method
		boolean isChecked = driver.findElement(By.id("male")).isSelected();
		System.out.println("Male radio button is checked or not = " + isChecked);
		
		driver.quit();
		
	}

}
