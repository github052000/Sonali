package javascriptexecutor1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/91772/OneDrive/Documents/disabled.html");
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     
     //handle disable Webelement
     
     Thread.sleep(2000);
     jse.executeScript("document.getElementById('i1').value='admin'");
}
}

