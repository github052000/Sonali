package xpathlocator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/login");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@name,'userLoginId')]")).sendKeys("kapilmundkar@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("kapu1234");
	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	driver.quit();
}
}
