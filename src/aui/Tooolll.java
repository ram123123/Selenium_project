package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Tooolll {

	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://demoqa.com/tooltip/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement element = driver.findElement(By.xpath(".//*[@id='age']"));
	  
	    Actions toolAct = new Actions(driver);
	    
	    toolAct.moveToElement(element).build().perform();
	    
	    String toolTipText = driver.findElement(By.cssSelector(".ui-tooltip-content")).getText();
	    
	   // String toolTipText = toolTipElement.getText();
	    
	    System.out.println(toolTipText);

	}

}
