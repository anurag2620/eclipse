package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");

String actualurl = driver.getCurrentUrl();
System.out.println("URL = "+actualurl);
if(actualurl.equals("https://www.google.com"));
System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
}
