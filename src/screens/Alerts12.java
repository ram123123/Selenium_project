package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts12 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		//click Find Flights btn
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//Alert
		
		String str= d.switchTo().alert().getText();
		
		System.out.println(str);
		Thread.sleep(2000);
		
		//click OK button in Alert
		d.switchTo().alert().accept();
	
	}

}
