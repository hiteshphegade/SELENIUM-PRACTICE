package Lecture4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));	//Explicit wait declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	
	
	
	driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();
	Thread.sleep(2000);		//Intentionally added to see the changes
	
	Alert promptAlert = mywait.until(ExpectedConditions.alertIsPresent());	//capture alert
		
	Thread.sleep(2000);		//Intentionally added to see the changes
	
	promptAlert.sendKeys("Welcome!");	//In alert you cannot see the value entering runtime.
	Thread.sleep(2000);		//Intentionally added to see the changes
	
	promptAlert.accept();
	//{after closing the alert, the text entered is visible as a result}
}
}