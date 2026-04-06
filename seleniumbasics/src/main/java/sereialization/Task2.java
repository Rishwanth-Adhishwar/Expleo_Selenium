package sereialization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.cssSelector("#reveal"));
		e.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#revealed")));
		e1.click();
		e1.sendKeys("Rishwa");
		System.out.println(e1.getAttribute("value"));

	}

}
