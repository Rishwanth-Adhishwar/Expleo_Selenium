package sereialization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='adder']")).click();
		WebElement e=driver.findElement(By.cssSelector("div.redbox"));
		System.out.println(e.getCssValue("height"));
		System.out.println(e.getCssValue("background-color"));
		System.out.println(e.getAttribute("class"));
		

	}

}
