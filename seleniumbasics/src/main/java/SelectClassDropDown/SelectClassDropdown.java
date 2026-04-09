package SelectClassDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		Select s=new Select(driver.findElement(By.className("ui-selectonemenu")));
		List<WebElement> options=s.getOptions();
		System.out.println(options.size());
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("Playwright");
		Thread.sleep(3000);
		s.selectByContainsVisibleText("Sele");
		Thread.sleep(3000);
		s.getFirstSelectedOption();
		Thread.sleep(3000);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByVisibleText("PlayWright");
		Thread.sleep(3000);
		s.deselectAll();
		

	}

}
