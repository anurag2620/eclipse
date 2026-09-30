package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonin {
WebDriver driver;
String URL = "https://www.amazon.in";

@Before
public void envSetUp() {
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
}

@Test
public void linkClick() {
	driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div/a")).click();
}
}
