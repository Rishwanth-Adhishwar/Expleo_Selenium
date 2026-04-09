package tableHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecordsFetchInDynamicTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
		String name="Tamil A";
		List<WebElement> contactNames=driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));
		int count=contactNames.size();
		System.out.println("Total Contact: "+count);
		
		for(WebElement e:contactNames)
		{
			System.out.println(e.getText());
		}
		
		int i=1;
		for(WebElement e1:contactNames)
		{
			if(e1.getText().equals(name))
			{
				List<WebElement> actualData=driver.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
				for(WebElement row:actualData)
				{
					System.out.println(row.getText());
				}
			}
			else
			{
				System.out.println("Data Not Found on Specified Name");
				break;
			}
			i++;
		}
		driver.quit();
	}

}
