package allTestCasesClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SetEnvirment {
  
  @BeforeSuite
  public void presettingofproject() {
  System.out.println("beforesuite >> presettingofproject");
  }

  @AfterSuite
  public void postsettingofproject() {
System.out.println("beforesuite >> postsettingofproject");  
  }

}
