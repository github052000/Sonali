package dataDrivenFramewwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeValidLogin {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Thread.sleep(2000);
	
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://hp/login.do");
	
	Flib flib = new Flib();
	//String Username = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,0);
	//String Password = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,1); OR
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,0));
	driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,1));
	driver.findElement(By.id("loginButton")).click();
	
	
}
}
