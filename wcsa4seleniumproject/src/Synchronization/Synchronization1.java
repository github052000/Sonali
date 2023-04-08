package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.findElement(By.name("username")).sendKeys("sonalipatil12@gmail.com");
	driver.findElement(By.name("password")).sendKeys("sonu12345");
	driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	driver.quit();
}
}
