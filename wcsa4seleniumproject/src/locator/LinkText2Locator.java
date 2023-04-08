package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText2Locator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.linkText("Open a popup window")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
