package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait_WebDriverwait {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
	}
	@Test
	public void waitTest()
	{
		WebDriverWait mywait=new WebDriverWait(driver, 20);
		
		//click Secure Login
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/div[2]/div/span/span/a/span")).click();
		
		//mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
	
		//username
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_emailgfhfhgfhg"))).sendKeys("dgfdgfgf");
		
		//password
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password"))).sendKeys("nnnnnndf343453534");
	}

}




