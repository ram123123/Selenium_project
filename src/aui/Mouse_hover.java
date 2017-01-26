package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_hover {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.emirates.com/in/English/");
		d.manage().window().maximize();
		
		
		Sleeper.sleepTightInSeconds(2);
		//identify the DESTINATIONS link
		WebElement dest= d.findElement(By.xpath(".//*[@id='destinations']/a/span[1]"));
		
		//identify the BOOK link
		 WebElement book=  d.findElement(By.xpath(".//*[@id='book']/a/span[1]"));
		
		Sleeper.sleepTightInSeconds(2);
		
		Actions mo=new Actions(d);
		mo.moveToElement(dest).moveToElement(book).build().perform();
		
		//mo.moveToElement(log).perform();
		
		
	}

}
