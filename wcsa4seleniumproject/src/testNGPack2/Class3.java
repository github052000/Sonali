package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 {
   static WebDriver driver;
	  @Test(enabled = true)
	  public void java() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com/");
		  driver.switchTo().activeElement().sendKeys("JAVA");
		  Reporter.log("method of Class3!!",true);
		  driver.quit();
  }
}
