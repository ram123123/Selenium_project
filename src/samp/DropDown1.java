package samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown1 {

	public static void main(String[] args)throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in");
		
		d.manage().window().maximize();
		
		
		//identify the drop down
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		Thread.sleep(3000);
		//	//identify the search box
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		
		//identify the search box
		d.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		

	}

}



