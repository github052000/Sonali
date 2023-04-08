package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDeselectByText {
	public static void main(String[] args) throws InterruptedException {
		//Chakli
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		Select sel = new Select(dropDownElement);
		Thread.sleep(5000);
		sel.selectByVisibleText("Chakali");
		Thread.sleep(5000);
		sel.deselectByVisibleText("Chakali");
	}  

}
