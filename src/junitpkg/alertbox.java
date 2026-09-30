package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

    WebDriver driver;

    String url = "file:///C:/Users/Admin/OneDrive/Desktop/prgm.html";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void alerthandling() throws InterruptedException{
         //display alert box
    	driver.findElement(By.xpath("/html/body/input[1]")).click();
    	Thread.sleep(1000);
    	Alert a = driver.switchTo().alert();
    	String alerttext = a.getText();
    	if (alerttext.equals("Hello im Cristiano Ronaldo suuiiii!!!")) {
    		System.out.println();
    	}
    	a.accept();
        // First name
        driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("cristiano");
        
        // Last name
        driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("CR7");
        
        // Submit button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}