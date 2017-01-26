package samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_sampe {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		
		
		
		d.findElement(By.xpath
				("html/......................input[1]")).sendKeys("selenium");

	}

}
