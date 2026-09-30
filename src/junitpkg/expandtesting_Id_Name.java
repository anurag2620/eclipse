package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expandtesting_Id_Name {

    WebDriver driver;

    String url = "https://practice.expandtesting.com/login";

    @Before
    public void envSetUp() {

        driver = new ChromeDriver();
        driver.get(url);
       
    }

    @Test
    public void loginValidation() throws InterruptedException {

        // Locate username field
        driver.findElement(By.name("username")).sendKeys("student");
        Thread.sleep(1000);

        // Locate password field
        driver.findElement(By.name("password")).sendKeys("Password123");
        Thread.sleep(1000);

        // Locate submit button
        driver.findElement(By.id("submit-login")).click();
        Thread.sleep(1000);
    }

    @After
    public void browserClose() {

        driver.quit();
    }
}