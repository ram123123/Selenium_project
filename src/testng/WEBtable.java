package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;

public class WEBtable {
	
	WebDriver d;
	
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
	  
		Sleeper.sleepTightInSeconds(2);
	  
	  WebElement table=d.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
	  
	   List<WebElement> rowws= table.findElements(By.tagName("tr"));
	   
	   System.out.println(rowws.size());
	   
	   for (int i = 0; i < rowws.size(); i++)
	   {
		   
		   List<WebElement> cols= rowws.get(i).findElements(By.tagName("td"));
		   
		   System.out.println(cols.size());
		   
		   for (int j = 0; j < cols.size(); j++) 
		   {
			 String str= cols.get(j).getText();
			 System.out.println(str);
		}
		
	}
	   
	  
	   Sleeper.sleepTightInSeconds(1);
	  
	   d.quit();
	  
  }
  
 

}
