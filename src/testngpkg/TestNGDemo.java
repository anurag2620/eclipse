package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

    @BeforeTest
    public void browserSetUp() {
        System.out.println("Browser loading");
    }

    @BeforeMethod
    public void UrlSetUp() {
        System.out.println("URL Setup");
    }

    @BeforeMethod
    public void currentUrlVerification() {
        System.out.println("URL Verification");
    }

    @Test
    public void pageSourse() {
        System.out.println("Page Text contains");
    }

    @Test
    public void dropDown() {
        System.out.println("Drop-Down handling");
    }

    @AfterMethod
    public void tabClose() {
        System.out.println("Tab closing");
    }

    @AfterTest
    public void browserClosing() {
        System.out.println("Browser Close");
    }
}