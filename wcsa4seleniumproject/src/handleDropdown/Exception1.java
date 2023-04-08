package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exception1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/91772/Desktop/sonu/Dropdown.html");
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='menu']"));
	Select sel = new Select(dropdown);
	sel.selectByVisibleText("samosa");
	Thread.sleep(2000);
	sel.deselectByVisibleText("samosa");
}
}
