package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
  
	  static WebDriver driver;
	  @Test(enabled = true)
	  public void mt() {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com/");
		  driver.switchTo().activeElement().sendKeys("Manual Testing");
		  Reporter.log("method of Class2!!",true);
		  driver.quit();
  }
}
