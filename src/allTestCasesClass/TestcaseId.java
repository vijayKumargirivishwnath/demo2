package allTestCasesClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestcaseId {
  @Test
  public void checkid() {
  System.out.println("test case in >> TestcaseId");
  }
  @BeforeMethod
  public void loadbrowser() {
 System.out.println("loadbrowser >> TestcaseId");
  }

  @AfterMethod
  public void closebrowser() {
System.out.println("closebrowser >>Testcaselogin ");
  }

  @BeforeClass
  public void beforeallTestCasecurrentclass() {
	  System.out.println("fil correct id");
  }

  @AfterClass
  public void afterallTestCasecurrentclass() {
  System.out.println("black and invalid not fil");
  
  }

}
