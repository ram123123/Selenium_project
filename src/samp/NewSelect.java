package samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewSelect {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		//click on ONE way
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//click leaving from
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		Thread.sleep(2000);
		//click on hyd
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		Thread.sleep(2000);
		//click Banglore
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		//click on DAte
		d.findElement(By.linkText("22")).click();
		
		Thread.sleep(2000);
		
		//Select ADults
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).
		        selectByVisibleText("2 Adults");
		
		Thread.sleep(2000);
		//Select Childrens
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).
		             selectByVisibleText("1 Child");
		
		//clcik Find Flights Btn
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	}

}


