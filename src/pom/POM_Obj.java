package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class POM_Obj {
	
	@FindBy(id="txtUsername") 
	WebElement un;
	
	@FindBy(id="txtPassword") 
	WebElement psd;
	
	@FindBy(id="btnLogin") 
	WebElement logbtn;
	
	
	public void loginApp()
	{
		un.sendKeys("Admin");
		psd.sendKeys("admin");
		logbtn.click();
	}
  
}
