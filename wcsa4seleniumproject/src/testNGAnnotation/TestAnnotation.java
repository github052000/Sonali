package testNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotation {
	
  @BeforeSuite
  public void beforeSuite() {
	 Reporter.log("beforeSuite",true);
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforeMethod",true);
  }


  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeClass",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterClass",true);
  }

 
  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest",true);
  }


  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite",true);
  }
  
  
  @Test
  public void f() {
	  Reporter.log("testCase1",true);
  }
  
  @Test
  public void g() {
  Reporter.log("testcase2",true);
  }
  
  @Test
  public void h() {
  Reporter.log("testcase3",true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("afterMethod",true);
  }


}
