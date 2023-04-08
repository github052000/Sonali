package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
	WebElement dropdown = driver.findElement(By.id("menu"));
      Select sel = new Select(dropdown);
       for(int i=0;i<7;i++)
       {
    	   sel.selectByIndex(i);
    	   
       }
       
       List<WebElement> options = sel.getAllSelectedOptions();
       for(WebElement ops:options)
       {
    	   String opt = ops.getText();
    	   System.out.println(opt);
       }
}
}
