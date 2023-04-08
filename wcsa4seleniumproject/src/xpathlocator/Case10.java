package xpathlocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//xpath by using contains()
import org.openqa.selenium.chrome.ChromeDriver;

public class Case10 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("sonalipatil123@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,'pas')]")).sendKeys("sonu1234");
	driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	driver.quit();
}
}
