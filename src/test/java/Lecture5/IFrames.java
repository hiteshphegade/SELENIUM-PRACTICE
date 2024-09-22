package Lecture5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//*[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("This is frame 1.");
		
		driver.switchTo().defaultContent();
		
		//Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name=\"mytext2\"]")).sendKeys("This is frame 2.");
		
		driver.switchTo().defaultContent();
		
		//Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//*[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		
		//Interacting with iframe which is part of frame 3
		driver.switchTo().frame(0);		//In frame 3, there is only 1 iframe, so used index as 0.
		
		/* Some times it is difficult to get attributes for the elements in the iframe
		 * so better way is to copy the link of that iframe and put in another tab, 
		 * it will help to locate the elements easily. 
		 * */
		
		//Try to click on radio button - I am a human
		driver.findElement(By.id("i8")).click();
		
		//Capturing the check boxes of - "How do you plan to use the software"
		// and selecting 1st and 3rd check box
		
		//driver.findElement(By.id("i19")).click();
		}
		}


