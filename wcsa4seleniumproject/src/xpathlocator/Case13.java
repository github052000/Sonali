package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case13 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shine.com/registration/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("kapil mundkar");
	driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("kapilmundkar@gmail.com");
	driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("kapu1234");
	driver.findElement(By.xpath("//button[contains(@id,'registerButton')]")).click();
	driver.quit();
}
}
