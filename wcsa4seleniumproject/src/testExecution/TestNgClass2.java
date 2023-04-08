package testExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNgClass2 extends BaseTest{
  @Test
  public void Search2() {
	  
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
}
