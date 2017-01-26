package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_creation {

	public static void main(String[] args) {
		
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.amazon.in/");
		d.manage().window().maximize();
		
		
		//identify the search box
		d.findElement(By.xpath
				("//div[@class='nav-search-field']/input[@id='twotabsearchtextbox']"))
		                               .sendKeys("java");
		
		

	}

}
