package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();

		WebElement e4=driver.findElement(By.cssSelector("div[id='form:drag_content']"));
		WebElement e5=driver.findElement(By.cssSelector("div[id='form:drop_content']"));
		
		act.clickAndHold(e4).moveToElement(e5).release().build().perform();
	}

}
