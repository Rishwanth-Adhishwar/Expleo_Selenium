package SelectClassDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownAccessWithActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.cssSelector("input[id='j_idt87:auto-complete_input']"));
		e1.click();
		String s="Appium";
		e1.sendKeys(s);
		
		WebElement e2=driver.findElement(By.cssSelector("li[data-item-label='Appium']"));
		act.moveToElement(e2).click().perform();
		

	}

}
