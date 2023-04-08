package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//xpath by using Unique Attribute
public class Case6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/91772/Desktop/sonu/Checkbox.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='i1']")).click();
	driver.findElement(By.xpath("//input[@id='i2']")).click();
	driver.findElement(By.xpath("//input[@id='i3']")).click();
	driver.findElement(By.xpath("//input[@id='i4']")).click();
	driver.quit();
}
}
