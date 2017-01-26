package excel;

import org.testng.annotations.Test;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xerces.impl.dv.xs.DecimalDV;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class execel1 {
	

	@Test
	public void f() throws IOException, InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		FileInputStream f=new FileInputStream("D:\\Workspace630pm\\Selenium630_project\\excel_input\\links.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet3");
		
		Row r=null;
		Cell c=null;
		
		
		// multiple iterations on Sheet
	   Iterator<Row> row=ws.iterator();
		
	   //next row
	   row.next();
		
		while(row.hasNext())
		{
		r=row.next();
			
			Thread.sleep(1000);
			
			//click link
			driver.findElement(By.linkText(r.getCell(0).getStringCellValue())).click();
			//get current URL
			String acturl=driver.getCurrentUrl();
			
			
					
			
			//stores the data into Excel sheet
			r.createCell(2).setCellValue(acturl);
			
			//  OR
			//c=r.createCell(2);
			//c.setCellValue(acturl);
			
			String expurl=r.getCell(1).getStringCellValue();
			
			if(acturl.equals(expurl))
			{
				r.createCell(3).setCellValue("PASS");
			}
			else
			{
				c=r.createCell(3);
				c.setCellValue("Failed");
			}
			driver.navigate().back();
			
		}
		
		//stores the data into excel with new file 
		FileOutputStream f1=new FileOutputStream("D:\\Workspace630pm\\Selenium630_project\\excel_input\\eveningNum.xlsx");
		wb.write(f1);
		f1.close();
		

	}

}




/* int i= ws.getLastRowNum();
 System.out.println(i);
 
 for(int j=1;j<=i;j++)
 {
	 
 }*/
 