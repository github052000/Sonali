package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Poha");
	
	Thread.sleep(2000);
	 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
	 for(WebElement suggest:suggestions)
	 {
	              String opt = suggest.getText();
	              Thread.sleep(2000);
	              System.out.println(opt);
	 }
}
}
