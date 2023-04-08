package windowbasedpopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver,chrome,driver","./driver/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Thread.sleep(2000);
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='content administration']")).click();
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
	WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
	
	
	File file = new File("./autoit/FileUpload1.exe");
	String abs=file.getAbsolutePath();
	Runtime.getRuntime().exec(abs);
	Thread.sleep(6000);
	Runtime.getRuntime().exec(abs);
}	
}

