package Lecture6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//used contains method to revise it
		//It will open the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//1) Select single option, focus on checkbox and not the tag
		driver.findElement(By.xpath("//input[@value=\"Python\"]")).click();
		
		//2) Capture all the options and find the size of dropdown
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("size of the dropdown = "+ options.size());
		
		//Printing the options 
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		
		//Selecting multiple options
		for(WebElement opt:options) {
			if(opt.getText().equals("Angular") || opt.getText().equals("Oracle") || opt.getText().equals("CSS")) {
				opt.click();
			}
		}
		
	}

}
