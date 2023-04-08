package assertionTesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assert1 {
  @Test
  public void validLogin() {
	  
	  Reporter.log("launch the browser",true);
	  Reporter.log("launch the web app by using url",true);
	  
	  SoftAssert sa = new SoftAssert();//soft Assert
	  sa.assertEquals(false, true);
	  
	  Reporter.log("login page will be displyed!!",true);
	  
	  Reporter.log("perform the login operation!!",true);
	  
	  Assert.assertEquals(true, false);//hard Assert
	  Reporter.log("Home page will be displayed!!",true);
	  Reporter.log("log Out",true);
  }
}
