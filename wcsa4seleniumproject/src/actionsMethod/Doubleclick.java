package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
	WebElement target = driver.findElement(By.xpath("//a[.='Logo & Color Scheme']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	target.click();
	Thread.sleep(2000);
	driver.findElement(By.id("uploadNewLogoOption")).click();
	
	WebElement target1 = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	act.doubleClick(target1).perform();
}
}
