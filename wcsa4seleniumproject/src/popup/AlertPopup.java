package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("file:///C:/Users/91772/Desktop/sonu/Alert%20popup.html");
		WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		button.click();

		// now switch ur control to Alert pop up

		Alert al = driver.switchTo().alert();

		// accept the Alert pop up..
		Thread.sleep(4000);
		//  al.accept();

		// dismiss the alert pop up

		// al.dismiss();

		// text of alert pop up

		String textOfAlert = al.getText();
		System.out.println(textOfAlert);
            
		//al.sendKeys("admin");

	}
}
