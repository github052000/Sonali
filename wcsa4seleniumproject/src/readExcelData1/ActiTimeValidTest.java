package readExcelData1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeValidTest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Thread.sleep(2000);
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
	
	//to read the valid username and password from validcreds
	
	FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("validcreds");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	String Username = cell.getStringCellValue();
	
	FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
	Workbook wb2 = WorkbookFactory.create(fis2);
	Sheet sheet2 = wb2.getSheet("validcreds");
	Row row2 = sheet2.getRow(1);
	Cell cell2 = row2.getCell(1);
	String Password = cell2.getStringCellValue();
	
	driver.findElement(By.name("username")).sendKeys(Username);
	driver.findElement(By.name("pwd")).sendKeys(Password);
	driver.findElement(By.id("loginButton")).click();
	
	
	
}
}
