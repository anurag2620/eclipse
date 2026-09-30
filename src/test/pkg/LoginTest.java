package test.pkg;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest {

    WebDriver driver;
    String url = "https://practicetestautomation.com/practice-test-login/";

    @BeforeTest
    public void browserSet() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void loginTest() throws InterruptedException {

        LoginPage lp = new LoginPage(driver); // creating object for that class

        lp.setValue("anurag@gmail.com", "anurag223");
        lp.clickSubmit();
    }
}