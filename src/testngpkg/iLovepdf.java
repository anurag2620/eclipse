package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iLovepdf {
	   WebDriver driver;
	    String URL = "https://www.ilovepdf.com/pdf_to_word";

	    @BeforeClass
	    public void envSetUp() {

	        driver = new ChromeDriver();
	        driver.get(URL);
	        driver.manage().window().maximize();
	    }

@Test
public void fileUpload1() throws AWTException {
    driver.findElement(By.xpath("//a[@id='pickfiles']")).click();

    fileUploadCode("C:\\Users\\Admin\\OneDrive\\Documents\\Custom Office Templates");
}

public void fileUploadCode(String file) throws AWTException {

    StringSelection strSelection = new StringSelection(file);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);

    Robot robot = new Robot();

    robot.delay(3000);

    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
}