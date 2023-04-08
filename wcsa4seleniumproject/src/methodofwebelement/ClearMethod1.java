package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.instagram.com/");
		
		 WebElement UsernameTextBox = driver.findElement(By.name("username"));
		 UsernameTextBox.sendKeys("mundkarsonali939@gmail.com");
		
		 WebElement PasswordTextBox = driver.findElement(By.name("password"));
		 PasswordTextBox.sendKeys("Sonalipatil5516");
		 
		 Thread.sleep(2000);
		 UsernameTextBox.clear();
		 PasswordTextBox.clear();
}
}