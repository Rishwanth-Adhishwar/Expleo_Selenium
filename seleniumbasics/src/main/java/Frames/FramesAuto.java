package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAuto {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(e);
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://www.google.com");
		
		String innertext=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text in Frame: "+innertext);
		
		driver.switchTo().defaultContent();
		WebElement e1=driver.findElement(By.cssSelector(".text-center"));
		
		System.out.println("Main Window Content: "+e1.getText());
		driver.switchTo().frame(0);
		String innertext1=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text in Frame: "+innertext1);
		
		driver.quit();
		
		

	}

}
