package xpathlocator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
////  xpath by using Unique Attribute
public class Class4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='signIn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='heading-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("1234567890");
		
		driver.quit();
		
	}
}
