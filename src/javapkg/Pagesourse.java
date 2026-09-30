package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver - new ChromeDriver();
driver.get("https://www.google.com");
String src = driver.getPageSource();

if (src.contains("Google Search")) {
	System.out.println("PASS : Text contains");
}
else {
	System.out.println("FAIL : Text not contain");
}
	}

}
