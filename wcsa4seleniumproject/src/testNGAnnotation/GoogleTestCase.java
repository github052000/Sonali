package testNGAnnotation;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleTestCase extends Basetest{
	
  @Test
  public void Search1() throws InterruptedException {
	  
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void Search2() throws InterruptedException {
	  
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void Search3() throws InterruptedException {
	  
	  driver.switchTo().activeElement().sendKeys("TestNG",Keys.ENTER);
	  Thread.sleep(2000);
	  
  }
}
