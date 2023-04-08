package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
	WebElement usn = driver.findElement(By.name("username"));
	usn.sendKeys("admin");
	WebElement password = driver.findElement(By.name("pwd"));
	password.sendKeys("manager");
	WebElement loginbutton = driver.findElement(By.xpath("//a[@id='loginButton']"));
	loginbutton.click();
	Thread.sleep(2000);
	WebElement task = driver.findElement(By.xpath("//div[.='Tasks']"));
	task.click();
	WebElement project = driver.findElement(By.xpath("a[.='Projects & Customers']"));
	project.click();

	
}
}
