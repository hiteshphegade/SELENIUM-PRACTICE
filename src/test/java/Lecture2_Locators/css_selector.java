package Lecture2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//cssSelector - tag id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shoes");
		
		//cssSelector - tag class
//		driver.findElement(By.cssSelector("input.form-control")).sendKeys("mac");
		
		//cssSelector - tag attribute
//		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("mac");
		
		//cssSelector - tag class attribute
//		driver.findElement(By.cssSelector("button.btn[data-lang=\"en-gb\"]")).click();
		
		

	}

}
