package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void dm1() {
	
	  int a=6;
	  int b=0;
	  int res=a/b;
	  Reporter.log("mathod name is dm1"+res,true);
  }
  
  @Test
  public void dm2() {
	  Reporter.log("mathod name is dm2",true);
  }
  
  @Test
  public void dm3() {
	
	  Reporter.log("mathod name is dm3",true);
  }
}
