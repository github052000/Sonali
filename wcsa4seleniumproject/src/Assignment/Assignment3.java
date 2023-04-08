package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//by using findelements method
public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("iphones");
	List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	//for(int i=0;i<options.size();i++)
	//{
		//WebElement opt = options.get(i);
		//String iphones = opt.getText();
		//System.out.println(iphones);
		//Thread.sleep(2000);
	//}
	for(WebElement opt:options)
	{
		String iphones = opt.getText();
		System.out.println(iphones);
		Thread.sleep(2000);
	}
}
}
