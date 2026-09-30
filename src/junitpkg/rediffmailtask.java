package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffmailtask {

    WebDriver driver;
    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void envSetUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

     @Test
     public void DropdownList() {
         WebElement ele = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[1]"));
         Select s = new Select(ele);
         s.selectByValue("11");
    
         Select month = new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]")));
         month.selectByIndex(9);
    
         Select year = new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]")));
         year.selectByVisibleText("2005");
    }

    @Test
    public void radioButton() {

         Boolean b = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]/input")).isSelected();
         System.out.println(b);
         if(b == true) {
             System.out.println("selected");
         } else {
           System.out.println("not selected");
         }

        WebElement ele = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]"));
        Boolean radio = ele.isSelected();
        System.out.println(radio);

        if (!radio) {
            ele.click();
        }
    }

    @Test
    public void checkBox() throws InterruptedException {
        Thread.sleep(1000);

        WebElement ele1 = driver.findElement(By.xpath("//form[@name='register_mail']/div/div[15]/div/input"));
        Boolean check = ele1.isSelected();
        System.out.println(check);

        if (!check) {
            ele1.click();
        }
    }

    @After
    public void browserClose() {
        driver.quit();
    }
}