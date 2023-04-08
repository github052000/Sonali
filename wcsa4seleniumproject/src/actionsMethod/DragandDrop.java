package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::li[1]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src,target).perform();
		
				
				
	}
}
