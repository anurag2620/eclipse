package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {
    WebDriver driver;
    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void titleVerification() {

        String actualResult = driver.getTitle();
        System.out.println("Actual Result = " + actualResult);

        if (actualResult.equals("google")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    @Test
    public void urlVerification() {

        String url = driver.getCurrentUrl();
        System.out.println("URL = " + url);
        String exp = "https://www.google.com/";

        if (url.equals(exp)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    @Test
    public void textContains() {
        String src = driver.getPageSource();
        String txt = "About";

        if (src.contains(txt)) {
            System.out.println("PASS : Text Present");
        } else {
            System.out.println("FAIL : Text is not Present");
        }
    }

    @After
    public void browserClose() {
    	driver.close();
    }
}