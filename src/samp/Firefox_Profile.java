package samp;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	public static void main(String[] args) {
		
		//create Profile Object
		ProfilesIni pr=new ProfilesIni();
		
		//create FirefoxProfile Object
		FirefoxProfile fp= pr.getProfile("selenium8");
		
		
		FirefoxDriver d=new FirefoxDriver(fp);
		
		d.get("http://google.com");

	}

}
