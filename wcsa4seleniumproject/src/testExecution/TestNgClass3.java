package testExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNgClass3 extends BaseTest{
  @Test
  public void Search3() {
	  
	  driver.switchTo().activeElement().sendKeys("Automation",Keys.ENTER);
  }
}
