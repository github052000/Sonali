package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/downloads/");
	
	WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
    String attributevalue = download.getAttribute("class");
    System.out.println(attributevalue);
}
}
