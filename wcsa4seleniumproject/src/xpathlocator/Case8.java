package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//xpath by using text()
public class Case8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91772/Desktop/sonu/selenium.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Selenium']")).click();
		driver.quit();
	}

}
