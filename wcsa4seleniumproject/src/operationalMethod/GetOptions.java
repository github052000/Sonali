package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/91772/Desktop/sonu/Dropdown.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownelement);
		System.out.println(sel.isMultiple());
		
		//all options of dropdown
		
		List<WebElement> allops = sel.getOptions();
		for(int i=0;i<allops.size();i++)
		{
			//print the text of options from dropdown
			
			String options = allops.get(i).getText();
			System.out.println(options);
		}
//---------------------------------------------------------------------------------------------------------------
//options of multiselectdropdown
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
		WebElement dropdownelement1 = driver.findElement(By.id("menu"));
		Select sel2 = new Select(dropdownelement1);
		System.out.println(sel2.isMultiple());
		
		//all options of multidropdown
		
		List<WebElement> allops1 = sel2.getOptions();
		for(int i=0;i<allops1.size();i++)
		{
			//print the text of options from multidropdown
			
			String options1= allops1.get(i).getText();
			System.out.println(options1);
		}
		
     }
}