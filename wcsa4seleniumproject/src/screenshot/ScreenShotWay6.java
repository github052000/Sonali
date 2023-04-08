package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenShotWay6 {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		WebElement seleniumIde = driver.findElement(By.xpath("//h4[.='Selenium IDE']/ancestor::div[@class='card-body']"));
		File src = seleniumIde.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ssWay6.jpg");
		Files.copy(src, dest);
}
}