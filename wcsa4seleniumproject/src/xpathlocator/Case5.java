package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//by using unique attribute
public class Case5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("sonalipatil@gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sony123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Forgotten your password?']")).click();
		driver.quit();
		
	}
}
