package testExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNgClass1 extends BaseTest{
	@Test
	public void Search1() throws InterruptedException {
		
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		Thread.sleep(1000);
	}
	
	
}