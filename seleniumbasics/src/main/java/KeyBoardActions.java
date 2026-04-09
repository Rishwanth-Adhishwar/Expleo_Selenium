import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement e=driver.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(e).click().keyUp(Keys.CONTROL).build().perform();
		
		String parent=driver.getWindowHandle();
		
		Set<String> allWindows=driver.getWindowHandles();
		for(String s:allWindows)
		{
			driver.switchTo().window(s);
		}
		System.out.println("Child Window: "+driver.getWindowHandle());
		driver.switchTo().window(parent);
		System.out.println("Parent Window: "+driver.getWindowHandle());
	}
}
