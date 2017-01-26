package desktop;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class UploadFILE_Robot{

	@Test
	public void fileUpload() throws AWTException, Exception
	{
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		






		
	    StringSelection path=new StringSelection
	    		    ("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	    
	   
	    d.findElement(By.id("photo")).click();
		
		Robot robot = new Robot();
		Thread.sleep(1000);
		
		//Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);		 
		
		 // Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);	 
		 robot.delay(2000);		        
		
		 //Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
	}

}



