package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 10']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='3★ & above']")).click();
	Thread.sleep(2000);
	
	}
}
