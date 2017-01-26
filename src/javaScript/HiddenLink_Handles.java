package javaScript;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;

public class HiddenLink_Handles {
	 WebDriver d;
	
	 @BeforeTest
	  public void setUp() {
		  
		   d=new FirefoxDriver();
			d.navigate().to("http://www.hdfcbank.com/");
			d.manage().window().maximize();
		  
	  }
	 
	 
	 
  @Test
  public void Hiddenlink() {
	  
	//identify the Carloan Link under Apply Now Link
			WebElement src= d.findElement(By.xpath("html/body.......li[5]/a"));
			
	          JavascriptExecutor js=(JavascriptExecutor)d;
			
	          Sleeper.sleepTightInSeconds(2);
	          
			js.executeScript("arguments[0].click()",src);
	  
  }
  

}




