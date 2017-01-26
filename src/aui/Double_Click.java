package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Double_Click {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.manage().window().maximize();
		
		WebElement src= d.findElement(By.linkText("Gmail"));
		
		Actions rc=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		rc.doubleClick(src).perform();
	}

}

