package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

    WebDriver driver;
    String url = "https://automationexercise.com/login";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void loginValues() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anurag");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anurag@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}