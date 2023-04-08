package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question4 {
//close only child window
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
		 
		Thread.sleep(2000);
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{	
			driver.switchTo().window(wh).close();
			}
			else
			{
				
			}
		}
}
}