package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontask {

    WebDriver driver;
    String url = "https://www.amazon.in/";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void amazonSearch() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void linkClick() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
    }

    @Test
    public void emailEntering() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("diyadiaaa");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

        driver.navigate().back();

        // Today's Deal link click
        driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div/a")).click();

        // Cart click
        driver.findElement(By.id("nav-cart")).click();

        // Hamburger menu click
        driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
    }
}