package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	  Reporter.log("This is demo method!!",true);
  }
  @Test
  public void demo1() {
	  
	  Reporter.log("This is demo1 method!!",true);
  }
  @Test
  public void demo2() {
	  
	  Reporter.log("This is demo2 method!!",true);
  }
}
