package page.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPage {
WebDriver driver;

//object repositivity using page factory
@FindBy(name = "username")
WebElement username;

@FindBy(name = "password")
WebElement password;

@FindBy(id = "submit")
WebElement submit;
public PageFactoryLoginPage(WebDriver driver) {
	//TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//Action methods
public void setValues(String UN,String PSWD)
{
	username.sendKeys(UN);
	password.sendKeys(PSWD);
}
public void btnClk()
{
	submit.click();
	}
}