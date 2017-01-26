package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.amazon.in/");
		d.manage().window().maximize();
		
		
		//identify the Drop down
		 WebElement drop=   d.findElement(By.id("searchDropdownBox"));
		 
		//identify the Drop down Items
		 List<WebElement> links= drop.findElements(By.tagName("option"));
		 System.out.println(links.size());
		 
		 
		 for (int i = 0; i < links.size(); i++) 
		 {
			System.out.println(links.get(i).getText());
			 
			 
		}
		 

	}

}
