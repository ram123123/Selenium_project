package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;






public class CheckBox {

	public static void main(String[] args) throws Exception {
		
		
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	
	Sleeper.sleepTightInSeconds(3);
	
		driver.findElement(By.id("Email")).sendKeys("qedge.ram");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		
	//identify the check box
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		System.out.println(check.getAttribute("checked"));
		
		if (check.isSelected()) 
		{
			check.click();
			System.out.println(check.getAttribute("checked"));
			
			driver.findElement(By.id("Passwd")).sendKeys("password12345");
			
		}
	}
}

