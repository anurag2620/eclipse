package page.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

//Webelement Locator - object repository

By username = By.name("username");
By password = By.name("password");
By submit = By.id("submit");

public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
//Action methods
public void setValues(String UN,String PSWD)throws InterruptedException {
	
	//user name
	driver.findElement(username).clear();
	driver.findElement(username).sendKeys(UN);
	Thread.sleep(1000);
	
	//password
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(PSWD);
		Thread.sleep(1000);
	}
	public void buttonClick()
	{
		driver.findElement(submit).click();
	}
}