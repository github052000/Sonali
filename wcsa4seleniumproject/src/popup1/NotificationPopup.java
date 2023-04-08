package popup1;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--disable-notifications");
	Thread.sleep(2000);
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.irctc.co.in/nget/train-search");
}
}
