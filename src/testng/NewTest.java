package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
  
	@Test
  public void f() {
	  System.out.println("SECOND");
  }
  
	@Test
	  public void h() {
		  System.out.println("thirs");
	  }
	  
	  @Test
	  public void hg() {
		  System.out.println("fffff");
	  }
  
 /* @BeforeClass
  public void beforeMethod() {
	  
	  System.out.println("START");
  }

  @AfterClass
  public void afterMethod() {
	  System.out.println("STOP");
	  
  }
*/
}
