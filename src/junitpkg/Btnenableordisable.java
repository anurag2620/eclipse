package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Btnenableordisable {

    WebDriver driver;

    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void buttonenabledOrNot() {

        boolean btn = driver.findElement(By.id("Register")).isEnabled();

        if (btn) {
            System.out.println("Button is enabled");
        } else {
            System.out.println("Button is disabled");
        }
    }
}