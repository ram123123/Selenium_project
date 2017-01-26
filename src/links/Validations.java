package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://orangehrm.qedgetech.com");
		d.manage().window().maximize();
		
		String expres= "orangehrm";
		
		String actres= d.getTitle();
		System.out.println("The Actuall Title is==="+actres);
		
		
		if(expres.equalsIgnoreCase(actres))
			System.out.println("Launch Sucessssss");
		else
			System.out.println("Launch not  Sucessssss");
		
		
		//Login App
		
		Thread.sleep(2000);
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("Admin");
		d.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		
		String explog="Welcome Admin";
		
		//identify Welcome Admin link
		String actlog= d.findElement(By.id("welcome")).getText();
		System.out.println("The Actuall Link NAme===="+actlog);
		
		if(explog.equals(actlog))
			
			System.out.println("Login Sucessssss");
		else
			System.out.println("Login not  Sucessssss");
	}

}
