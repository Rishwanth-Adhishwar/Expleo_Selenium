package tableHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamicDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com");
		WebElement un=driver.findElement(By.cssSelector("#email"));
		un.click();
		un.sendKeys("mp3gaming12@gmail.com");
		WebElement up=driver.findElement(By.cssSelector("#password"));
		up.click();
		up.sendKeys("rishnavi");
		WebElement submit=driver.findElement(By.cssSelector("#submit"));
		submit.click();
		List<WebElement> rows=driver.findElements(By.xpath("//table/tr/td"));
		for(WebElement we:rows) {
			System.out.print(we.getText()+" | ");
		}
		

	}

}
