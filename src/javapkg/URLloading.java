package javapkg;

import org.openqa.selenium.edge.EdgeDriver;

public class URLloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object creation
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://automationexersice.com/login");
	}
}