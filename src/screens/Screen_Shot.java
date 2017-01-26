package screens;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		//take screen shot for app
	    File  src=	((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
	
	
	   d.navigate().to("http://google.com");
	
	 //take screen shot for another app
	   File  src12=	((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
	//compare two screens
	
		if(FileUtils.contentEquals(src, src12))
			System.out.println("Screens shots are same");
		else
			System.out.println("Screens shots are not same");

	}

}
