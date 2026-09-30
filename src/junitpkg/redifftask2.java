package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redifftask2 {

    WebDriver driver;
    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void country() {
        WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
        Select s = new Select(ele);
        s.selectByValue("99");
    }

    @Test
    public void logo() {
        Boolean b = driver.findElement(By.xpath("//img[@alt='Rediffmail']")).isDisplayed();
        System.out.println(b);

        if (b == true) {
            System.out.println("displayed");
        } else {
            System.out.println("not displayed");
        }
    }
}