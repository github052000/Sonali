package dataDrivenFramewwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeInvalidLogin {
	public static void main(String[] args ) throws InterruptedException, EncryptedDocumentException, IOException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://hp/login.do");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","invalidcreds");

		for(int i=1;i<=rc;i++)
	   {
        String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i,0);
		String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i,1);
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	    driver.findElement(By.name("username")).clear();
	   }
		
		driver.close();
		
}
}