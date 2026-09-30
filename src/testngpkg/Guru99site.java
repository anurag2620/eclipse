package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99site {

    WebDriver driver;
    String url = "https://demo.guru99.com/test/upload/";

    @BeforeTest
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void uploadFile() {

        WebElement upload = driver.findElement(By.id("uploadfile_0"));
        upload.sendKeys("C:\\Program Files\\Acer\\User Experience Improvement Program Service\\Plugin\\AppMonitor");

        WebElement checkbox = driver.findElement(By.id("terms"));
        checkbox.click();

        WebElement submitfile = driver.findElement(By.id("submitbutton"));
        submitfile.click();
    }
}