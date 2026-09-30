package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

    WebDriver driver;

    String url = "https://register.rediff.com/register/register.php?FormName=user_details";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

//    @Test
//    public void links() {
//
//        List<WebElement> li = driver.findElements(By.tagName("a"));
//
//        System.out.println("List count = " + li.size());
//
//        for (WebElement ele : li) {
//            String link = ele.getAttribute("href");
//            String linkText = ele.getText();
//
//            System.out.println(linkText + " --> " + link);
//        }
//    }
//}
@Test
public void link1() {
	 List<WebElement> li = driver.findElements(By.tagName("a"));
         System.out.println("List count = " + li.size());
         
         for(int i=0;i<li.size();i++) {
        	 WebElement s =li.get(i);
        	 String link = s.getAttribute("href");
             String linkText = s.getText();
             System.out.println(linkText + " --> " + link);
         }
}}