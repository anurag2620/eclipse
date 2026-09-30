package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookandor {

    WebDriver driver;
    String url = "https://www.facebook.com/";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void loginFacebook() {

        driver.findElement(By.xpath("//input[@type='text' and @name='email']"))
              .sendKeys("anurag777");
    }
}