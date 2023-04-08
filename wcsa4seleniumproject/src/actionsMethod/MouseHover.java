package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch J')]"));
	
	//to perform mouse action create object of action class
	
	Actions act = new Actions(driver);
	
	//to perform mouseHover action
	
	act.moveToElement(target).perform();
	
	driver.findElement(By.xpath("//a[.='Band']")).click();
}
}
