package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
    WebElement UTB = driver.findElement(By.name("username"));
    UTB.sendKeys("admin");
    WebElement PTB = driver.findElement(By.name("pwd"));
    PTB.sendKeys("manager");
    Thread.sleep(2000);
    UTB.clear();
    Thread.sleep(4000);
    PTB.clear();
	
}
}
