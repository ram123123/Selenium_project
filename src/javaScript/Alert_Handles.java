package javaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Alert_Handles {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		// Create Alert through JSE
		js.executeScript("alert('helloooo')");
		 
		Sleeper.sleepTightInSeconds(2);
		
		d.switchTo().alert().accept();
		
		
		
		
  }
}
