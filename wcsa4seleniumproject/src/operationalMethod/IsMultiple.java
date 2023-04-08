package operationalMethod;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IsMultiple {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/91772/Desktop/sonu/Dropdown.html");
	WebElement dropdownelement = driver.findElement(By.id("menu"));
	Select sel = new Select(dropdownelement);
	//System.out.println(sel.isMultiple());
	//without using selection method select the option from dropdown
	//Thread.sleep(2000);
	//driver.navigate().to("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
	//WebElement dropDownelement1 = driver.findElement(By.id("menu"));
	List<WebElement> allops = sel.getOptions();
	for(WebElement option:allops)
	{
		if(option.getText().equals("samosa"))
		{
			option.click();
			break;
		}
	}
	
}
}
