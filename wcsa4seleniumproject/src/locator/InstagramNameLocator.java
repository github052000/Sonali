package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramNameLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("mundkarsonali939@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("sonalipatil5516");
    Thread.sleep(2000);
    driver.findElement(By.className("_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm")).click();
    driver.quit();
    
    
}
}

