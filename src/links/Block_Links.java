package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Block_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.bing.com/");
		d.manage().window().maximize();
		
		//identify the Block 
		WebElement block= d.findElement(By.id("sc_hdu"));
		
		//identify the block links
		List<WebElement> links=  block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for (int i = 0; i < links.size(); i++) 
		{
			String linkname= links.get(i).getText();
			System.out.println(linkname);
		}
	}
}


