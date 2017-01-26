package desktop;

import java.awt.AWTException;
//import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

//import com.thoughtworks.selenium.webdriven.commands.KeyEvent;





public class FileDownloadFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		d.findElement(By.linkText("3.0.1")).click();
		
		
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}
