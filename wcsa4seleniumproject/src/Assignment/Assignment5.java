package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.get("https://www.shoppersstack.com/");
	WebElement santoor = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__l4gLE']/descendant::img[@alt='Santoor']"));
	santoor.click();
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("665544");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement checkbutton = driver.findElement(By.xpath("//button[.='Check']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkbutton)).click();
	//checkbutton.click();
}
}
