package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskk {

    WebDriver driver;
    String url = "https://www.amazon.in";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    
    @Test
    public void urlverification() {

        String url = driver.getCurrentUrl();
        System.out.println("Url = " + url);

        String exp = "https://www.amazon.in/";

        if (url.equals(exp)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
    
    @Test
    public void titleVerification() {

        String actualresult = driver.getTitle();
        System.out.println("Actual Result = " + actualresult);

        String expectedresult = "amazon.in";

        if (actualresult.equals(expectedresult)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
    
    @Test
    public void textcontains() {

        String src = driver.getPageSource();
        String txt = "Prime Vedio";

        if (src.contains(txt)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
    
    @Test
    public void searchMobile() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
        Thread.sleep(2000);
        
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("ap_email_login")).sendKeys("uvwxyz123@gmail..com");
        Thread.sleep(2000);
        
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        
        driver.navigate().back();
        
        
    }
	}