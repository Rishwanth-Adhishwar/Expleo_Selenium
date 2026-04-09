package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		String domain=jse.executeScript("return document.domain;").toString();
		System.out.println("Domain Name: "+domain);
		String url=jse.executeScript("return document.URL;").toString();
		System.out.println("Website URL: "+url);
		
		jse.executeScript("document.getElementsByName('name')[0].click();");
		jse.executeScript("document.getElementsByName('name')[0].value='Rishwa';");
		
		jse.executeScript("document.getElementsByName('name')[1].click();");
		jse.executeScript("document.getElementsByName('name')[1].value='Adhi';");
		
		jse.executeScript("document.getElementsByTagName('input')[2].click();");
		jse.executeScript("document.getElementsByTagName('input')[2].value='rish@gmail.com';");
		
		jse.executeScript("document.getElementsByTagName('input')[3].click()");
		jse.executeScript("document.getElementsByTagName('input')[3].value='12345';");

		jse.executeScript("document.getElementsByTagName('input')[4].click();");
		jse.executeScript("document.getElementsByTagName('input')[4].value='12345';");
		
		jse.executeScript("document.getElementsByTagName('button')[0].click();");
		
		if(!url.equals(jse.executeScript("return document.URL;").toString()))
		{
			System.out.println("Registered Successfully");
		}
		else
		{
			System.out.println("Registeration in unsuccessfull");
		}
		driver.close();
	}

}
