package Assignment;

import java.time.Duration;



import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliminatesduplicate1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("file:///C:/Users/91772/Desktop/sonu/MultiDropDown.html");
	
	WebElement dropDownElement = driver.findElement(By.id("menu"));
	Select sel = new Select(dropDownElement);
	//HashSet<String> hs=new HashSet<String>();
	TreeSet<String> hs = new TreeSet<String>();//()output is in alphabetical order
	//LinkedHashSet<String> hs = new LinkedHashSet<String>();
	//get the list of webelemnt
	
	List<WebElement> allops = sel.getOptions();
	
	//read the list and get the text
	for(int i=0;i<allops.size();i++)
	{
		WebElement option = allops.get(i);
		String text = option.getText();
		
		//add the text to set so that duplicates won't be accepted and insertion order is won't be maintained
		
		hs.add(text);
	}
	
	//read the set
		
		for(String value:hs)
		{
			System.out.println(value);
		}
	
}
}
