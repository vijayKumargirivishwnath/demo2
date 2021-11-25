package allTestCasesClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ModuleLevelClass {
 
  @BeforeTest
  public void adminpresetting() {
 System.out.println("admin >>modulelevel start");
  }

  @AfterTest
  public void adminpostsetting() {
  System.out.println("amdin >> modulelevel end");
  }

}
