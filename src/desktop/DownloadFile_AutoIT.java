package desktop;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;



public class DownloadFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		d.findElement(By.linkText("3.0.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		Runtime.getRuntime().exec("D:\\Demo\\Autoit\\Download_730.exe");
  }
}




