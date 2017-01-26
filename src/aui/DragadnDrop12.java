package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragadnDrop12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		 d.switchTo().frame(0);
		
		 //identify the source element
	    WebElement src= 	d.findElement(By.id("draggable"));
		
	    //identify the target element
	    WebElement targ= 	d.findElement(By.id("droppable"));
		
	    Sleeper.sleepTightInSeconds(2);
	    
	    Actions dd=new Actions(d);
	    dd.dragAndDrop(src, targ).build().perform();

	}

}

