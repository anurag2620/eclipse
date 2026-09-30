package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {

    @BeforeTest
    public void envsetup() {
        System.out.println("browser loading...");
    }

    @BeforeMethod
    public void urlsetup() {
        System.out.println("url loading");
    }

    @Test
    public void currenturlverf() {
        System.out.println("current url verified");
    }

    @Test(priority = -1)
    public void titleverification() {
        System.out.println("title verified");
    }

    @Test
    public void buttonverification() {
        System.out.println("button verified");
    }

    @Test(priority = 2)
    public void dropDownVerf() {
        System.out.println("drop down verification");
    }

    @AfterMethod
    public void tabClosing() {
        System.out.println("tab is closed");
    }

    @AfterTest
    public void browserClosing() {
        System.out.println("browser closing...");
    }
}