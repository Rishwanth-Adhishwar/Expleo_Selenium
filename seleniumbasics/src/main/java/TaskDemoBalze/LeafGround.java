package TaskDemoBalze;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.cssSelector("button[id='j_idt88:new']")).click();
		String etitle=driver.getTitle();
		String childWindow=driver.getWindowHandle();
		
		Set<String> allWindow=driver.getWindowHandles();
		System.out.println("Current Window Count: "+allWindow.size());
		
		
		for(String s:allWindow)
		{
			driver.switchTo().window(s);
			
			if(etitle.equals(driver.getTitle()))
			{
				driver.switchTo().window(parentWindow);
			}

		}
	}

}
