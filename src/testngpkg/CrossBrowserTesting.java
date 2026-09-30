package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

    WebDriver driver;
    String url = "https://www.google.com";

    @Parameters({"Browser"})
    @BeforeTest
    public void browserSetUp(String browser) {

        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        }
        else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        }
        else if (browser.equals("Safari")) {
            driver = new SafariDriver();
        }
        else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
    }
    
    @BeforeMethod
    public void urlSetup() {
    	driver.get(url);
    	driver.manage().window().maximize();
    }

    @Test
    public void googlesearch() throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("books");
    }

    @AfterTest
    public void browserClose() {
        driver.quit();
    }
}
