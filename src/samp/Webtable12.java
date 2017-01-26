package samp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Webtable12 {
  @Test
  public void f() throws Exception {
	  
	  
	  WebDriver driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	  
	
	//WebElement table= driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
	
	
	
	String str1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[2]/td[";
	
	String str2= "]";
	
	
	for (int i = 1; i <= 5; i++) 
	{
		String res=driver.findElement(By.xpath(str1+i+str2)).getText();
		System.out.println(res);
	}
	
	  
	  
  }
}
