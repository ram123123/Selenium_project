package desktop;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;



public class AutoIT_Uploadfile {
  
	 WebDriver d;
	
	 @BeforeTest
	  public void setUp() {
		  
		   d=new FirefoxDriver();
			d.navigate().to("http://toolsqa.com/automation-practice-form/");
			d.manage().window().maximize();
		  
	  }
	
	@Test
  public void f() throws IOException 
	{
	  d.findElement(By.id("photo")).click();
	  
	  Sleeper.sleepTightInSeconds(3);
	  
	  Runtime.getRuntime().exec("D:\\Demo\\Autoit\\Upload_730.exe");
	  
		
  }

}



