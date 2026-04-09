package tableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowAndColCount {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> rs=driver.findElements(By.xpath("//table[@id='table1']//th"));
		List<WebElement> cs=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		int r=rs.size();
		int c=cs.size();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{

				if(i==1)
				{
					System.out.println(driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]//th["+j+"]")).getText());
				}
				else
				{
					System.out.println(driver.findElement(By.xpath("//table[@id='table1']//tr["+(i-1)+"]//td["+j+"]")).getText());
				}
			}
			
		}
		

	}

}
