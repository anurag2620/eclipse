package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoft {

    WebDriver driver;
    String url = "https://www.google.com";

    @BeforeMethod
    public void pageLoad() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void SoftAssertion() {

        SoftAssert soft = new SoftAssert();

        // Title verification
        String actualResult = driver.getTitle();
        System.out.println("Title is " + actualResult);

        String expectedResult = "gogle";

        soft.assertEquals(actualResult, expectedResult);

        System.out.println("Hello");

        soft.assertAll();
    }
}