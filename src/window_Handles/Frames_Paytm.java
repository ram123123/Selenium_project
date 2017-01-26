package window_Handles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Frames_Paytm {
  
	WebDriver d;
	
	
	@BeforeTest
	public void setUp()
	{
		 d=new FirefoxDriver();
		d.navigate().to("https://paytm.com/");
		d.manage().window().maximize();
		
	}
	
	
	
	@Test
  public void f() {
		
		//Click login link
		d.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).
		                                                                      click();
		
		//identify the no.of frames
		List<WebElement> frame= d.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		for (int i = 0; i < frame.size(); i++) 
		{
			//switch window to frame
			d.switchTo().frame(i);
			
			try 
			{
				d.findElement(By.id("input_0")).sendKeys("1234567677");
				d.findElement(By.id("input_1")).sendKeys("password123");
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			
			}
			
			//switch frame to window
			d.switchTo().defaultContent();
		
		}
  }
  
	
  
  
  
}
