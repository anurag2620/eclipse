package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class enabled {

    @BeforeTest
    public void envsetup() {
        System.out.println("browser loading...");
    }

    @BeforeMethod
    public void urlsetup() {
        System.out.println("url loading");
    }

    @Test(groups = {"smoke","regression"},enabled = false)
    public void currenturlverf() {
        System.out.println("correct url");
    }

    @Test(groups = {"regression"})
    public void titleverification() {
        System.out.println("title verified");
    }

    @Test(groups = {"smoke"})
    public void buttonverification() {
        System.out.println("button verified");
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