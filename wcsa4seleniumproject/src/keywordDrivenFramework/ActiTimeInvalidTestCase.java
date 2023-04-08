package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidTestCase extends BaseTest{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
		for(int i=1;i<=rc;i++)
		{
			String invalidusn = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0);
			String invalidpass = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1);
			
			driver.findElement(By.name("username")).sendKeys(invalidusn);
			driver.findElement(By.name("pwd")).sendKeys(invalidpass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
		bt.tearDown();
	}
}
