package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTesting {
    WebDriver driver;
    String url = "https://practicetestautomation.com/practice-test-login/";

@BeforeTest
public void envSetUp() {
driver = new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
   }

@Test
public void readExcel() throws IOException ,InterruptedException{
FileInputStream f = new FileInputStream("C:\\automation\\login.xlsx");
XSSFWorkbook wb = new XSSFWorkbook(f);
XSSFSheet sh = wb.getSheet("Sheet1");
int row = sh.getLastRowNum();
System.out.println("Total Rows: " + row);

for(int i=1;i<=row;i++){
	String username = sh.getRow(i).getCell(0).getStringCellValue();
	System.out.println("Username : "+username);
	String password = sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println("Password : "+password);
	
	//username
	//clear
	driver.findElement(By.name("username")).clear();
	//pass values
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(1000);
	//password
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(password);
	//submit
	driver.findElement(By.id("submit")).click();
		}
	}
}
