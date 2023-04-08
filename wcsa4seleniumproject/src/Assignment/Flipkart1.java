package Assignment;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
	Thread.sleep(2000);
	//apply the filters
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Brand')]")).click();
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 11']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
	Thread.sleep(2000);
	
	String priceOfFirstsuggestion = driver.findElement(By.xpath("(//div[.='HP Intel Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s- fr4000TU Thin and Light Laptop']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	System.out.println(priceOfFirstsuggestion+" : is the price of laptop");
	driver.quit();
	
	
}
}
