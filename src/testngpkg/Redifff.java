package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Redifff {

    WebDriver driver;
    String URL = "https://register.rediff.com/register/register.php?FormName=user_details";

    @BeforeClass
    public void envSetUp() {

        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void register() throws InterruptedException {

        // Full Name
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Anu");
        Thread.sleep(2000);

        // Rediffmail ID
        driver.findElement(By.xpath("//input[contains(@placeholder,'Rediffmail ID')]"))
                .sendKeys("anu123456");
        Thread.sleep(2000);

        // Password
        driver.findElement(By.xpath("//input[@id='newpasswd']"))
                .sendKeys("Anu@12345");
        Thread.sleep(2000);

        // Retype Password
        driver.findElement(By.xpath("//input[@id='newpasswd1']"))
                .sendKeys("Anu@12345");
        Thread.sleep(2000);

        // Day
        WebElement day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
        Select d = new Select(day);
        d.selectByVisibleText("10");
        Thread.sleep(2000);

        // Month
        WebElement month = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
        Select m = new Select(month);
        m.selectByVisibleText("JAN");
        Thread.sleep(2000);

        // Year
        WebElement year = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
        Select y = new Select(year);
        y.selectByVisibleText("2003");
        Thread.sleep(2000);

        // Gender
        driver.findElement(By.xpath("//input[@value='f']")).click();
        Thread.sleep(2000);

        // Country
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select c = new Select(country);
        c.selectByVisibleText("India");
        Thread.sleep(2000);

        // City
        WebElement city = driver.findElement(By.xpath("//select[@id='div_city']"));
        Select ct = new Select(city);
        ct.selectByVisibleText("Kochi");
        Thread.sleep(2000);

        // Recovery Email
        driver.findElement(By.xpath("//input[contains(@placeholder,'recovery email')]"))
                .sendKeys("anu@gmail.com");
        Thread.sleep(2000);

        // Mobile Number
        driver.findElement(By.xpath("//input[@id='mobno']"))
                .sendKeys("9876543210");
        Thread.sleep(2000);
    }
}