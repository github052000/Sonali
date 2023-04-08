package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://www.selenium.dev/");
	Thread.sleep(2000);
	WebElement target = driver.findElement(By.xpath("//span[.='Downloads']"));
	Actions act = new Actions(driver);
	//to perform right click
	act.contextClick(target).perform();
}
}
