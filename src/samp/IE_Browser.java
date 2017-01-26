package samp;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
