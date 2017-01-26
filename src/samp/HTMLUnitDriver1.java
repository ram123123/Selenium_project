package samp;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HTMLUnitDriver1 {

	public static void main(String[] args) {
		
		
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://google.com");
		
		 String str=driver.getTitle();
		 System.out.println(str);
		

	}

}
