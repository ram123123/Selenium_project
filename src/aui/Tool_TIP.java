package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_TIP {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/#slider-vertical");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		WebElement tt= d.findElement(By.id("age"));
		
		Actions sl=new Actions(d);
		sl.moveToElement(tt).perform();
		
		
		

	}

}
