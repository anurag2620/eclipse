package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
WebDriver driver;
String url = "https://www.google.com";
@Before
public void envSetUp() {
	driver = new ChromeDriver();
	driver.get(url);
}
@Test
public void links() {
	List<WebElement> li =driver.findElements(By.tagName("a"));
	System.out.println("List count ="+li.size());
	
	for(WebElement ele : li) {
		
	}
}
private By BytagName(String string) {
	// TODO Auto-generated method stub
	return null;
}
}