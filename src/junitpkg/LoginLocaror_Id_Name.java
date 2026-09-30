package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLocaror_Id_Name {

    WebDriver driver;
    String url = "https://practicetestautomation.com/practice-test-login/";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void loginValidation() throws InterruptedException {

        // locate user name field
        driver.findElement(By.name("username")).sendKeys("anuragg");
        Thread.sleep(1000);

        // locate password field
        driver.findElement(By.name("password")).sendKeys("anurag@123");
        Thread.sleep(1000);

        // locate submit button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
    }

    @After
    public void browserClose() {
        driver.close();
    }
}