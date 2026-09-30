package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

    WebDriver driver;
    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void pageScreenshot() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("C:\\automation\\screenshot\\redifff.png"));
    }

    @Test
    public void elementScreenshot() throws IOException {
        WebElement ele = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input"));
        File src = ele.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("C:\\automation\\screenshot\\fullnamee.png"));
    }
}