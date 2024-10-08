package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		
		String year = "1994";
		String month = "June";
		String date	 = "12";
		
		
		
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  	//to select month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();		//to select year
			
						if(currentMonth.equals(month) && currentYear.equals(year)) {
								break;
					}
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
					}
		
		List <WebElement>allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));	// to select date
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
			
		}
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		//ax5 manual   both price same
		//mx3 auto
		
		
		
	}


}
