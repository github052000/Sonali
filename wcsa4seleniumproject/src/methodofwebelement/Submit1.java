package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
	
	WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
	usn.sendKeys("admin");
	
	WebElement psd = driver.findElement(By.xpath("//input[@name='pwd']"));
	psd.sendKeys("manager");
	
	WebElement loginbutton = driver.findElement(By.xpath("//a[.='Login']"));
	loginbutton.submit();
	
}
}
