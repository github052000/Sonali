package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
////  xpath by using Unique Attribute
public class Case3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sonalipatil");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sony123");
	driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	driver.quit();
	
}
}
