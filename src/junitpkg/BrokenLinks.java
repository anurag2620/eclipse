package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    WebDriver driver;
    String url = "https://www.luminartechnolab.com";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void brokenLinks() {

        List<WebElement> li = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links : " + li.size());

        for (WebElement data : li) {

            String links = data.getAttribute("href");
            String linkText = data.getText();

            System.out.println(linkText + "\t" + links);

                verify(links);
            }
        }
    

    public void verify(String u) {

        try {
            URL ul = new URL(u);
            HttpURLConnection con = (HttpURLConnection) ul.openConnection();
            con.setConnectTimeout(3000);
            con.connect();

            if (con.getResponseCode() == 200) {
                System.out.println("Valid = " + u);
            } else {
                System.out.println("Broken = " + u);
            }

        } catch (Exception e) {
            System.out.println("Invalid URL = " + u);
        }
    }
}
