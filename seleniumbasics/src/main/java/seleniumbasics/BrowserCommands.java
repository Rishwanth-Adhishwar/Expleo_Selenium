package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		System.out.println("Title Length: "+title.length());
		String Currenturl=driver.getCurrentUrl();
		String expectedUrl="http://www.flipkart.com";
		if(Currenturl.equals(expectedUrl))
		{
			System.out.println("Url is Correct");
		}
		else
		{
			System.out.println("Url is not Correct");
		}
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source Length: "+pageSource.length());
		driver.close();

	}

}
