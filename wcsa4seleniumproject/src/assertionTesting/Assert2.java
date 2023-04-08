package assertionTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
	
	static WebDriver driver;
	
@BeforeMethod
public void launchBrowser() {
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("http://hp/login.do");
}

  @Test
  public void login() throws InterruptedException {
	  
	  String actualLoginPageTitle = driver.getTitle();
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(actualLoginPageTitle, "loginPage");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  
	  String actualHomePageTitle = driver.getTitle();
	  Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track");
	  driver.findElement(By.className("logout")).click();
  }
  
  @BeforeTest
  public void property()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
