package popup;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowBasedPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://hp/user/submit_tt.do");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");


		driver.findElement(By.xpath("//a[.='Login']")).click();// by using text.

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='aligned_radio_button_text'])[2]")).click();

		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(2000);
		// target.click();

		Actions act = new Actions(driver);
		// to perform double click action
		act.doubleClick(target).perform();


	    File file = new File("./autoIT/auto3.exe");
		String abs = file.getAbsolutePath();
		Runtime.getRuntime().exec(abs);
		Thread.sleep(3000);
		Runtime.getRuntime().exec(abs);
	}
}
