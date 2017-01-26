package links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_present {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.icicibank.com/");
		d.manage().window().maximize();
		
		//get HTML source code of the webPage
		String str= d.getPageSource();
		
		if(str.contains("ICICI Twitter Page"))
		{
			System.out.println("Element Present");
		}

		else
			
		{
			System.out.println("Element not Present");
		}
		
		
	}

}
