package samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SAmple1 {

	public static void main(String[] args) throws Exception  {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the search box
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		
		d.findElement(By.id("twotabsearchtextbox")).clear();
		
		Thread.sleep(4000);
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("c language");
		
		//identify the search button
		d.findElement(By.className("nav-input")).click();
		
	
	}

}


