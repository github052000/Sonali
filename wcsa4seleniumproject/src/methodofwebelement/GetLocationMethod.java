package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Point Loc = download.getLocation();
		
		int xaxis = Loc.getX();
		int yaxis = Loc.getY();
		
		System.out.println(xaxis+": is the x axis "+ yaxis +" : is the y axis");
	

}
}
