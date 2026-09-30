package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpath {

    WebDriver driver;
    String url = "https://automationexercise.com/login";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void loginvalues() {

        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("anuragmc@gmail.com");

        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("anurag@123");

        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
    }
}