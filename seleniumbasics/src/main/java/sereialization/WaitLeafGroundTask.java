package sereialization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitLeafGroundTask {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		WebElement c1=driver.findElement(By.xpath("//span[@id='j_idt87:show']/button/span"));
		c1.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt90']/child::span")));
		e.click();
		System.out.println(e.getText());
		

		WebElement e1=driver.findElement(By.cssSelector("button[id='j_idt87:j_idt92']"));
		e1.click();
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean display=wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[id='j_idt87:j_idt93']")));
		if(display)
		{
			System.out.println("Button got invisibled");
		}
		WebElement e2=driver.findElement(By.cssSelector("button[id='j_idt87:j_idt99'] span[class='ui-button-text ui-c']"));
		System.out.println("Before text: "+e2.getText());
		
		WebElement e3=driver.findElement(By.cssSelector("button[id='j_idt87:j_idt98']"));
		e3.click();
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean e4=wait2.until(ExpectedConditions.textToBe(By.cssSelector("button[id='j_idt87:j_idt99'] span[class='ui-button-text ui-c']"), "Did you notice?"));
		if(e4)
		{
			WebElement e5=driver.findElement(By.cssSelector("button[id='j_idt87:j_idt99'] span[class='ui-button-text ui-c']"));
			System.out.println("Changed: "+e5.getText());
		}
		else
		{
			System.out.println("Text Not Changed");
		}
		driver.close();
		
	}

}
