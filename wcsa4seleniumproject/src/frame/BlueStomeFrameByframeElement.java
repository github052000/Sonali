package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlueStomeFrameByframeElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		
		// switch the controls to frame
		
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.findElement(By.id("chat-icon")).click();// clicking on chat box
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
		
}
}