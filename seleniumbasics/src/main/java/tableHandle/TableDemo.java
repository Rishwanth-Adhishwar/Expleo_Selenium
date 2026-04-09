package tableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
//      Heading Values
//		List<WebElement> e=driver.findElements(By.xpath("//table[@id='table1']//th"));
//		System.out.println(e.size());
	
		
//      All Data in table
//		List<WebElement> e=driver.findElements(By.xpath("//table[@id='table1']//tbody//td"));
//		System.out.println(e.size());

//      First row value
//		List<WebElement> e=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]//td"));
//		System.out.println(e.size());
	
//      Second row Third Column
//		List<WebElement> e=driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td[3]"));
//		System.out.println(e.size());
		
		
//		Data only in 2nd Column
		List<WebElement> e=driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));
		System.out.println(e.size());
		
		for(WebElement w:e)
		{
			System.out.println(w.getText());
		}
	}

}
