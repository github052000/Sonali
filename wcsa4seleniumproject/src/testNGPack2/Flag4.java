package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logInMethod() {
	  Reporter.log("Log IN is Done!!",true);
  }
  @Test(dependsOnMethods = "loginInMethod")
  public void createUser() {
	  Reporter.log("User Created!!",true);
  }
  @Test(dependsOnMethods = "CreateUser")
  public void logOutMethod() {
	  Reporter.log("Log Out Done!!",true);
  }
}
