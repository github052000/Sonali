package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
	
	WebElement dropdownelement = driver.findElement(By.name("menu"));
	Select sel = new Select (dropdownelement);
	sel.selectByVisibleText("vadapav");
}
}
