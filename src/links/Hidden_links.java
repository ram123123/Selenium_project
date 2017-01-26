package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;




public class Hidden_links {

	public static void main(String[] args) throws Exception {
		
		  ProfilesIni pr=new ProfilesIni();
		  FirefoxProfile fp= pr.getProfile("selenium8");
		  
		  FirefoxDriver d=new FirefoxDriver(fp);
		  d.get("http://www.amazon.in/");
		  
		  Thread.sleep(2000);
		  
		  //identify the no.of links
		  
		List<WebElement> links=  d.findElements(By.tagName("a"));
		System.out.println("Total links===="+links.size());
		
		int count=0;  
		
		  for(int i=0;i<links.size();i++)
		  {
			
			  //if the link text is not empty (i.e Visible link )
			 
			  
			  if(  !  links.get(i).getText().isEmpty())
			  {
				  
				  count=count+1;   //count++;
			  }
			    
		  }
		  
           System.out.println("visible links are===="+ count);
		  
           // Total links - visible links= invisble links
           
		  int hidden=links.size()-count;
		  System.out.println( "Invisible links======" + hidden);
		  
	}

}
