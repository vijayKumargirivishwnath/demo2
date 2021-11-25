package allTestCasesClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Testcasespassword {
  @Test
  public void checkpassword() {
System.out.println("test case in >> Testcasespassword");
  }
  @BeforeMethod
  public void loadbrowser() {
 System.out.println("loadbrowser >> Testcasespassword");
  }

  @AfterMethod
  public void closebrowser() {
System.out.println("closebrowser >>check password ");
  }

}
