package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement e1 =driver.findElement(By.cssSelector("#alert1"));
		e1.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(4000);
		WebElement e2=driver.findElement(By.cssSelector("#prompt"));
		e2.click();
		Alert b=driver.switchTo().alert();
		Thread.sleep(5000);
		b.sendKeys("Rishwa");
		Thread.sleep(5000);
		b.accept();
		
		
		WebElement e3=driver.findElement(By.cssSelector("#confirm"));
		e3.click();
		Alert c=driver.switchTo().alert();
		System.out.println(c.getText());
		c.dismiss();
		

	}

}
