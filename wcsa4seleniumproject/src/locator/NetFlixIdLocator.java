package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixIdLocator {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/Login");
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("mundkarsonali939@gmail.com");
	driver.findElement(By.id("id_password")).sendKeys("sonalipatil5516");
	driver.findElement(By.id("id_password_toggle")).click();
	driver.quit();
	
}
}