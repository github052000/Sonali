package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/91772/Desktop/sonu/confirmation%20popup.html");
		
		driver.findElement(By.xpath("//button[.='Submit!']")).click();
		
		Alert al = driver.switchTo().alert();
		// dismiss the pop up
		//al.dismiss();
		
		Thread.sleep(2000);
		// accept the pop up
		//al.accept();
		
		String textOfConfirm = al.getText();
		System.out.println(textOfConfirm);
		
	}

}
