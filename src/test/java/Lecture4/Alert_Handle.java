package Lecture4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Type 1 - Normal alert with OK button
		
//		driver.findElement(By.xpath("//*[@onclick=\"jsAlert()\"]")).click();
//		Thread.sleep(2000);		//Intentionally added to see the changes
//		
//		Alert myAlert = driver.switchTo().alert();
//		System.out.println("Text associated with normal alert window - "+ myAlert.getText());		//for validation purpose
//		myAlert.accept();
		
		
		//Type 2 Confirmation Alert - {alert with OK button and Cancel button}
		
//		driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
//		Thread.sleep(2000);		//Intentionally added to see the changes
////		driver.switchTo().alert().accept();		//close alert using accept button
//		driver.switchTo().alert().dismiss();	//close alert using dismiss button
		
		
		//Type 3 Prompt Alert
		WebElement myPromptAlert = driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]"));
		myPromptAlert.click();
		
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);		//Intentionally added to see the changes
		
		promptAlert.sendKeys("Welcome!");	//In alert you cannot see the value entering runtime.
		Thread.sleep(2000);		//Intentionally added to see the changes
		
		promptAlert.accept();
		//{after closing the alert, the text entered is visible as a result}
	}

}
