package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//xpath by using multiple attributes

public class Class12 {
public static void main(String[] args) throws InterruptedException   {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();or
	driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder' and contains(text(),'Search')]")).click();
	driver.quit();
}
}
