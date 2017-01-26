package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_Selector {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.amazon.in/");
		d.manage().window().maximize();
		
		d.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox"))
		            .sendKeys("java");
		
		
	}

}
