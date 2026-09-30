package junitpkg;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import java.time.Duration;
public class AmaznTestSearchTest {
  private WebDriver driver;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
  }
  @Test
  public void amaznTestSearch() throws InterruptedException{
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().setSize(new Dimension(1264, 695));
    driver.findElement(By.id("twotabsearchtextbox")).click();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
    driver.findElement(By.id("nav-search-submit-button")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.name("submit.addToCart")).click();
    Thread.sleep(1000);
   // driver.close();
    }
  }
