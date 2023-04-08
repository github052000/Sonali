package Assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");

	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Brand')]")).click();
	
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and  .='Operating System']")).click();
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 10']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
    
	String priceoffirstsuggestion = driver.findElement(By.xpath("//div[.='HP Chromebook Intel Core i7 11th Gen - (16 GB/1 TB SSD/Windows 10 Home) 14-dv0058TU Thin and Light Lap...']/ancestor::a[@class='_1fQZEK']/descendant::div[.='₹88,390']")).getText();
    
    System.out.println(priceoffirstsuggestion + ": is the price of laptop");
}
}
