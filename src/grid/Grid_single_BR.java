package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_single_BR {
  
	@Test
  public void f() throws MalformedURLException   {
	  
	
	  
	  DesiredCapabilities capb=null;
	  
	 capb= DesiredCapabilities.chrome();
	  
	  capb.setBrowserName("chrome");
	  capb.setPlatform(Platform.WINDOWS);
	  
	  
	  RemoteWebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capb);
	  
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
	  
	  
  }
}
