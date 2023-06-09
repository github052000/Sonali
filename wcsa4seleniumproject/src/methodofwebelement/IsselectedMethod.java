package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsselectedMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://hp/login.do");
	
    WebElement verify = driver.findElement(By.xpath("//input[@name='remember']"));
    boolean status1 = verify.isSelected();
    System.out.println(status1);
    Thread.sleep(2000);
    verify.click();
    boolean status2 = verify.isSelected();
    System.out.println(status2);
}
}
