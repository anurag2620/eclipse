package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookabsolutexpath {

    WebDriver driver;
    String url = "https://www.facebook.com/";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void loginvalues() {

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/input"))
                .sendKeys("anurag");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/input"))
                .sendKeys("anurag@123");

        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button"))
                .click();
    }
}