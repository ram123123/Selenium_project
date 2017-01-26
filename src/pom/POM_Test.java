package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_Test {
  
	@Test
  public void f() {
	  
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();	
		
		 POM_Obj obj= PageFactory.initElements(d, POM_Obj.class);
		 
		 obj.loginApp();
		 
		   
  }
}


