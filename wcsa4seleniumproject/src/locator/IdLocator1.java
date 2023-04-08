package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator1{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/91772/Documents/TextBox.html");
	driver.findElement(By.tagName("input")).sendKeys("manager");
	Thread.sleep(2000);
	driver.navigate().to("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
	driver.findElement(By.tagName("select")).click();
	Thread.sleep(2000);
	driver.close();
}
}
