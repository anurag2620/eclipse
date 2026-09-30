package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerr {
	 WebDriver driver;
	 @BeforeTest
	 public void browserSetup() {
		 driver= new ChromeDriver();
	 }	
	 
	 @BeforeMethod
	 public void urlSetup() {
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 
	@Test
	public void test() {
	//button
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div/input")).click();
		
		while(true) {
		
		  String monthtext = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		  System.out.println(monthtext);
		
		  if (monthtext.equals("November 2026")) {
		      break;
		  } 
		  else {
		      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();
		  }
		}
		//date
		List<WebElement> datelist = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//table/tbody/tr/td/a"));
		for (WebElement dateElement : datelist) {
			String date = dateElement.getText();
			System.out.println(date);
			if (date.equals("13")) {
				dateElement.click();
		  	}
		}	
	}
}