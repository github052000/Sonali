package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test
  public void login() {
	  
	  int res=5/0;
	  Reporter.log("Login Method!!",true);
  }
  
  @Test(dependsOnMethods="login",alwaysRun=true)
  public void CreateUser() {
	  Reporter.log("CreateUserMethod!!",true);
  }
  
  @Test
  public void logout() {
	  Reporter.log("Logout Method!!",true);
  }
}
