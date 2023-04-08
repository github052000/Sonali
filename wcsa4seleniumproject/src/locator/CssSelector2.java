package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='use']")).sendKeys("sonali");
		driver.findElement(By.cssSelector("input[name*='wo']")).sendKeys("sony123");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		driver.quit();
}
}
