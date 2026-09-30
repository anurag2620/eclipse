package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FrameHandling {
	    WebDriver driver;
	    
	@BeforeTest
	public void envSetUp() {
	driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	   }
@Test
public void FrameHolder() {
	driver.switchTo().frame(0);
	WebElement clickMeBtn=driver.findElement(By.id("Click"));

}
