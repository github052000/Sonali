package javascriptexecutor1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDowntillWebElementLocation {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("");
	
}
}
