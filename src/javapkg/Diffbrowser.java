package javapkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Diffbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("http://www.google.com");
		
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("http://www.amazon.com");
		
		driver1.close();
		driver2.close();
	}

}
