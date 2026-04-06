package sereialization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#timerButton"))).click();
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(25));
		boolean is=wait1.until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector("div#deletesuccess"),"This text will disappear after 25 seconds"));
		if(is)
		{
			
		}
	}

}
