package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Links_URLs {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		  d.get("http://www.amazon.in");
		  d.manage().window().maximize();
		  
		  //identify the no.of links
		List<WebElement> links=  d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for (int i = 0; i < links.size(); i++) 
		{
			 Sleeper.sleepTightInSeconds(1);
			
			if(  !  links.get(i).getText().isEmpty())
			{
			//click the links
			links.get(i).click();
			 String url= d.getCurrentUrl();
			System.out.println(url);
			
			//d.navigate().back();
			
			links= d.findElements(By.tagName("a"));
			}
			
		}
		  

	}

}
