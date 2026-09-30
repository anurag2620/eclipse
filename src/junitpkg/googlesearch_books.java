package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch_books {

    WebDriver driver;
    String url = "https://www.google.com";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void googleSearch() throws InterruptedException {

        driver.findElement(By.name("q")).sendKeys("books");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);
    }

    @Test
    public void googleSearch1() {

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("books");
        search.submit();
    }

    @Test
    public void googleSearch2() {

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("books", Keys.ENTER);
    }

    @Test
    public void googleSearch3() {

        driver.findElement(By.name("q")).sendKeys("books", Keys.ENTER);
    }

    @After
    public void browserClose() {
        driver.quit();
    }
}