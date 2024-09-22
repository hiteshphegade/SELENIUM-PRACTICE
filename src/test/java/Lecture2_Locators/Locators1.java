package Lecture2_Locators;

import java.util.List;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Element location by Name
//		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//Element location by id
//		  boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
//		  System.out.println(logoDisplayStatus);
		
		//Element location by linkText
//		driver.findElement(By.linkText("Desktops")).click();
		
		//Element location by partialLinkText
//		driver.findElement(By.partialLinkText("Desk")).click();
		
		//Element location by className
//		List <WebElement>headerLinks = driver.findElements(By.className("list-inline-item"));
//		System.out.println(headerLinks.size());
		
		//Element location by tagName
//		List <WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("Number of links on webpage = " + links.size());
		
//		List <WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println("Number of images on webpage = "+ images.size());
		
		

	}

}
