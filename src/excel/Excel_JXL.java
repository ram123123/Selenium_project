package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_JXL {
	  @Test
	  public void f() throws BiffException, IOException {
		  
		  FileInputStream fis=new FileInputStream("D:\\Workspace630pm\\SSSSS\\TestData\\test123.xlsx");
		 
		Workbook wb=Workbook.getWorkbook(fis);
		  Sheet ws= wb.getSheet("Sheet1");
		  
		  
		  WebDriver d=new FirefoxDriver();
			d.navigate().to("http://professional.demo.orangehrmlive.com/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
			
			d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(1, 0).getContents());
			d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
			d.findElement(By.id("btnLogin")).click();
			
				
			
	  }
	}

