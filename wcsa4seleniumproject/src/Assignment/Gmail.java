package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	WebElement checkbox = driver.findElement(By.xpath("//div[@class='T-Jo-auh']"));
	Select sel = new Select(checkbox);
	sel.getAllSelectedOptions();
}
}
