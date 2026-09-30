package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookrelativexpath {

    WebDriver driver;
    String url = "https://www.facebook.com/";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void loginFacebook() {

        driver.findElement(By.xpath("//input[@name='email']"))
              .sendKeys("diya");

        driver.findElement(By.xpath("//input[@name='pass']"))
              .sendKeys("diya@123");

        driver.findElement(By.xpath("//button[@type='log in']"))
              .click();
    }
}