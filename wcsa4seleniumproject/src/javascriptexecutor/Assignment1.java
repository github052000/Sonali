package javascriptexecutor;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/91772/Desktop/sonu/Lp.html");
		
		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block is executed");
		}
		else 
		{
			jse.executeScript("document.getElementById('i1').value='admin'");
			System.out.println("else block is executed");
		}
		
		
		Thread.sleep(4000);
		
		if(password.isEnabled())
		{
			password.sendKeys("manager");
			System.out.println("if block is executed");
		}
		else 
		{
			jse.executeScript("document.getElementById('i2').value='manager'");
			System.out.println("else block is executed");
		}
		
		
	}

}
