package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionHard {

    WebDriver driver;
    String url = "https://www.google.com";

    @BeforeMethod
    public void pageLoad() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void hardAssertion() {
        // Title verification
        String actualResult = driver.getTitle();
        System.out.println("Title is: " + actualResult);

        String expectedResult = "Google";

        Assert.assertEquals(actualResult, expectedResult);

        System.out.println("Hello");
    }
}