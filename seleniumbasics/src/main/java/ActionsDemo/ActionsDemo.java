package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("blogsmenu"));
		act.moveToElement(e).perform();
		
		WebElement e1=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		act.moveToElement(e1).click().build().perform();
		
		driver.navigate().back();
		
//		WebElement e2=driver.findElement(By.cssSelector("input[title='search'][name='q']"));
//		act.contextClick().perform();
		
		WebElement e3=driver.findElement(By.cssSelector("button[ondblclick='dblclickAlert()']"));
		act.doubleClick().perform();
		
		WebElement e4=driver.findElement(By.cssSelector("div[id='form:drag_content']"));
		WebElement e5=driver.findElement(By.cssSelector("div[id='form:drop_content']"));
		
		act.dragAndDrop(e4, e5);

	}

}
