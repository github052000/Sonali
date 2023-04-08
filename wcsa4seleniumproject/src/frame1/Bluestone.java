package frame1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bluestone {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Thread.sleep(2000);
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("denyBtn")).click();
	WebElement frameElement = driver.findElement(By.id("fc_widget"));
    driver.switchTo().frame(frameElement);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
    
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("admin");
}
}
