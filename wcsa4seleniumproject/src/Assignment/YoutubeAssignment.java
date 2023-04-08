package Assignment;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAssignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.youtube.com/");
	 List<WebElement> shorts = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
	 List<WebElement> views = driver.findElements(By.xpath("//span[@id='video-title']/ancestor::div[@class='style-scope ytd-rich-grid-slim-media']/descendant::div[@class='style-scope ytd-video-meta-block']"));
	 for(int i=0;i<shorts.size();i++)
	{
		String sh = shorts.get(i).getText();
		for(int j=i;j<=i;j++)
		{
			String vie = views.get(j).getText();
			System.out.print(sh+" :"+vie);
		}
		System.out.println();
	}
    
    }
}

