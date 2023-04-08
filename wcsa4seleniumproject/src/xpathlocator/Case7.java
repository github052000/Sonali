package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
////  xpath by using Unique Attribute
public class Case7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fsso%3Freferrer%3Dhttps%253A%252F%252Fweb.snapchat.com%252F%253Fref%253Dsnapchat_dot_com_login_cta%26client_id%3Dweb-calling-corp--prod");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='loginTrigger']")).click();
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kapilmundkar123@gmail.com");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kapu12345");
   
    driver.quit();
}
}