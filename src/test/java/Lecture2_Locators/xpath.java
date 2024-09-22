package Lecture2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
//		//Xpath with single attribute
//		driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).sendKeys("Mac");
//		
//		//Xpath with multiple attributes
//		driver.findElement(By.xpath("//*[@placeholder=\"Search\"][@name='search'][@type='text']")).sendKeys("Mac");
//		
//		//Xpath with and operator = all attributes must be correct
//		driver.findElement(By.xpath("//*[@placeholder=\"Search\" and @name='search']")).sendKeys("Mac");
//		
//		//Xpath with or operator = at least one attribute must be same
//		driver.findElement(By.xpath("//*[@placeholder=\"Search\" or @name='search']")).sendKeys("Mac");
//		
//		//Xpath with text {it can consider innertext or linktext}
//		boolean status = driver.findElement(By.xpath("//span[text()='$123.20']")).isDisplayed();
//		System.out.println(status);
//		
//		//Xpath - parent node from child node
//		driver.findElement(By.xpath("//a[text()='Cameras']/parent::li")).click();
		
		
		
		
		
		
		
		
		

	}

}
