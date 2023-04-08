package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/downloads/");
	WebElement js = driver.findElement(By.xpath("(//div[@class='card-header bg-transparent border-0 text-center py-0'])[5]"));
	String value = js.getCssValue("font-weight");
	System.out.println(value);
}
}
