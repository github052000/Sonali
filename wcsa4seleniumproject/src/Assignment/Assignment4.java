package Assignment;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> priceOfMobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	for(int i=0;i<mobiles.size();i++)
	{
		String op = mobiles.get(i).getText();
		
		for(int j=i;j<=i;j++)
		{
			String opt = priceOfMobiles.get(j).getText();
			System.out.print(op+" :"+opt);
			Thread.sleep(2000);
		}
		System.out.println();
	}
}
}
