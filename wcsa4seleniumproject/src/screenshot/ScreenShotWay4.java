package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {
public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	
	//way4 create the object of EventfiringWebDriver
	
    EventFiringWebDriver evf = new EventFiringWebDriver(driver);
    File src = evf.getScreenshotAs(OutputType.FILE);
    File dest = new File("./Screenshots/ssWay4.png");
    Files.copy(src, dest);
}
}
