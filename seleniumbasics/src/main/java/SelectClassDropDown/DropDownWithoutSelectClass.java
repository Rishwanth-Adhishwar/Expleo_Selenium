package SelectClassDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.cssSelector("input[id='j_idt87:auto-complete_input']"));
		e1.click();
		String s="Appium";
		e1.sendKeys(s);
		List<WebElement> allOptions=driver.findElements(By.cssSelector(".ui-autocomplete-items.ui-autocomplete-list.ui-widget-content.ui-widget.ui-corner-all.ui-helper-reset li"));
		System.out.println(allOptions.size());
		for(WebElement o:allOptions)
		{
			if(o.getText().equals(s)||o.getText().equals("AWS")||o.getText().equals("Selenium WebDriver"))
			{
				o.click();
				break;
			}
		}
		
		

	}

}
