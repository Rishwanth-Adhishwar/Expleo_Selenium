package TaskDemoBalze;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> count=driver.getWindowHandles();
		System.out.println("Current Window Count: "+count.size());
		
		driver.findElement(By.id("windowButton")).click();
		Set<String> newcount=driver.getWindowHandles();
		System.out.println("New Window Count: "+newcount.size());
		
		String ParentHandle=driver.getWindowHandle();
		System.out.println("Parent Window: "+ParentHandle);
		
		Iterator<String> iterator=newcount.iterator();
		String mainwindow=iterator.next();
		String childWindow=iterator.next();
		System.out.println("Parent Window: "+mainwindow);
		System.out.println("ChildWindow: "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("Child_Title: "+text.getText());
		
		driver.close();
		driver.switchTo().window(ParentHandle);
		System.out.println("Parent Title: "+driver.getTitle());
		
		driver.quit();
		
		
	}

}
