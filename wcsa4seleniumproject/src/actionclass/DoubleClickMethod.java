package actionclass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("http://hp/login.do");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 
		 
		 driver.findElement(By.xpath("//a[.='Login']")).click();// by using text.
		
		 driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		 driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		 
		 WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		    //Thread.sleep(2000);
		     target.click();
		 
		      Actions act = new Actions(driver);
		       // to perform double click action
		      act.doubleClick(target).perform();
		 
		 
		
		 
		 
	}
}