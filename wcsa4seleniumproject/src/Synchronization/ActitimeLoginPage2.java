package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginPage2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://hp/login.do");
		String loginpageActualTitle = driver.getTitle();
		if(loginpageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test is passed Login page verified!!");
		}
		else
		{
			System.out.println("Test is Failed Login page not verified");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String homepageActualTitle = driver.getTitle();
		if(homepageActualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test is passed home page verified");
		}
		else
		{
			System.out.println("Test is failed home page not verified");
		}
	}
}
