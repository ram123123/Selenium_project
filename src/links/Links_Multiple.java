package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Multiple {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.icicibank.com/");
		d.manage().window().maximize();
		
		//identify the No.of links 
		List<WebElement> linksss =d.findElements(By.tagName("a"));
		
		//size of the webelement
		
		int total= linksss.size();
		System.out.println(total);
		
		
		for(int i=0;i<total;i++)
		{
			//get text of the element
			String linkname= linksss.get(i).getText();
			System.out.println(linkname);
			
		}
		
	
	}

}


