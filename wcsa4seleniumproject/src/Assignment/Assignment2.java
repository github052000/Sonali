package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/91772/Desktop/sonu/Checkbox1.html");
	Thread.sleep(2000);
	WebElement automationChkbox = driver.findElement(By.id("i4"));
	System.out.println("automationChkbox");
	automationChkbox.click();
	Thread.sleep(2000);
	
	driver.navigate().to("http://hp/user/submit_tt.do");
	driver.manage().window().maximize();
	WebElement usn = driver.findElement(By.name("username"));
	usn.sendKeys("admin");
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.quit();
	}
}
