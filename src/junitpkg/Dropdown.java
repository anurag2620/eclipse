package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    WebDriver driver;

    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
   
    public void check() {

        WebElement day = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[1]"));
        Select daySelect = new Select(day);
        daySelect.selectByVisibleText("21");

        WebElement month = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]"));
        Select monthSelect = new Select(month);
        monthSelect.selectByValue("05");

        WebElement year = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]"));
        Select yearSelect = new Select(year);
        yearSelect.selectByIndex(8);
    }}
