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

public class Excel_POI {
  @Test
  public void f() throws BiffException, IOException {
	  
	  FileInputStream fis=new FileInputStream("D:\\Workspace630pm\\SSSSS\\TestData\\test123.xlsx");
	  @SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws= wb.getSheet("Sheet1");
	  
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://professional.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		d.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		d.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		d.findElement(By.id("btnLogin")).click();
		
		
		
		
		
		
		
		
		
		
		
  }
}
