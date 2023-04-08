package popup1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirationPopup {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("file:///C:/Users/91772/Desktop/sonu/confirmation%20popup.html");
		 driver.findElement(By.xpath("//button[.='Submit!']")).click();
		 Alert al = driver.switchTo().alert();
		 Thread.sleep(2000);
		 String text = al.getText();
		 System.out.println(text);
}
}