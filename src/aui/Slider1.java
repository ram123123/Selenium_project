package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Slider1 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/#slider-vertical");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		d.switchTo().frame(0);
		
		//identify the moving element
		WebElement slider= d.findElement(By.xpath(".//*[@id='slider-vertical']/span"));
		
	  int y=  slider.getLocation().y;
	    
	    
	    Actions sl=new Actions(d);
	    
	sl.dragAndDropBy(slider, 60, y).build().perform();
  
	    
	    
	    
	  
	    
	    
	    
	    
	    
	    
	    

	}

}
