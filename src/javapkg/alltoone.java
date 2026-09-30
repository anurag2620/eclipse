package javapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alltoone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object creation
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://automationexersice.com/login");
	}


WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");

String actualresult =driver.getTitle();
System.out.println("Title : "+actualresult);

String expectedresult = "google";

if(actualresult.equalsIgnoreCase(expectedresult)) {
	System.out.println("PASS");
}
else {
	System.out.println("FAIL");
}
	}

}
