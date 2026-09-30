package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logo {

    WebDriver driver;
    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    
    @Test
    public void logodisplayeddOrNot() { 
    	boolean logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img")).isDisplayed();
    	System.out.println(" Logo " +logo);
    	if(logo) {
    		System.out.println("logo is displayed");
    	}
    	else {
    		System.out.println("logo is not displayed");
    	}
    }}