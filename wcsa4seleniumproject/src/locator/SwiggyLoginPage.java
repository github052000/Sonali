package locator;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyLoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("r2iyh")).click();
		driver.findElement(By.id("mobile")).sendKeys("9356681997");
		driver.findElement(By.id("name")).sendKeys("sonali biradar");
		driver.findElement(By.id("email")).sendKeys("mundkarsonali939@gmail.com");
		driver.quit();
	}

}
