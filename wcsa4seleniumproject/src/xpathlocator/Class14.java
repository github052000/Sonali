package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class14 {
//irctc.com
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ')]")).sendKeys("Pune");
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='PUNE JN - PUNE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corn')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c57-9 ng-star-inserted') and (.='MUMBAI CENTRAL - MMCT')]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext') ]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ng-tns-c58-10 ng') and (.='11') ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c65-11 ui-dropdown-label ui') ]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='AC First Class (1A) ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c65-12 ui-dropdown-label ui') ]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='LADIES') ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'search_btn train_Search') ]")).click();
		
		
	}
}
