package testExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void method1() {
	  
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid+"is the threadid",true);
	  Reporter.log("method1",true);
	  
  }
  
  @Test
  public void method2() {
	  
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid+"is the threadid",true);
	  Reporter.log("method2",true);
	  
  }
}
