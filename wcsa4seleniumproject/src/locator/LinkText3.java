package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91772/Desktop/sonu/selenium.html");
		driver.findElement(By.linkText("Selenium")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
