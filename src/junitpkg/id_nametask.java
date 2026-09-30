package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_nametask {

    WebDriver driver;
    String url = "https://practice.expandtesting.com/login#google_vignette";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void loginValidation() {

        driver.findElement(By.name("username")).sendKeys("anurag");
        driver.findElement(By.name("password")).sendKeys("anurag@123");
        driver.findElement(By.id("submit-login")).click();
    }

    @After
    public void browserClose() {
        driver.quit();
    }
}