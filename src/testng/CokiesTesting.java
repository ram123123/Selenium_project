package testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CokiesTesting {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.fb.com");	
		driver.manage().window().maximize();
	}
	
	@Test
	public void cookiesTest()
	{
		Set<Cookie> myCookies= driver.manage().getCookies();
		System.out.println(myCookies.size());
		
		Iterator<Cookie> it=myCookies.iterator();
	
		while(it.hasNext())	
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"--"+c.getValue()+
					                          "--"+c.getDomain());
		}
		
		driver.manage().deleteAllCookies();
		
		Sleeper.sleepTightInSeconds(2);
		myCookies=driver.manage().getCookies();
		
		
		System.out.println(myCookies.size());
		
	}

}

