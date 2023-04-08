package testNGDynamicScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ActiTimeLogin extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		intaa();
	}
	

	@Test
	public void loginpageMethod()
	{
		String loginpage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginpage,"loginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test(dependsOnMethods="loginpageMethod")
	public void homepageMethod() throws InterruptedException
	{
		String loginpage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginpage,"loginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement saveleavetime = driver.findElement(By.id("SubmitTTButton"));
		
		
		if(saveleavetime.isDisplayed())
		{
			Assert.assertEquals(true, true);
		}
		else
		{
			sa.assertEquals(true, true);
		}
		
WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Logout']"));
		
		if(logoutLink.isDisplayed())
		{
			logoutLink.click();
		}
		else
		{
			System.out.println("will get Exception!!!");
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		close();
	}
			
		
	}


