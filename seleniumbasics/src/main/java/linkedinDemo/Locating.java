package linkedinDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.linkedin.com/home");
		driver.manage().window().maximize();
		System.out.println("Website Launched");
		WebElement e=driver.findElement(By.cssSelector("a.nav__button-secondary "));
		e.click();
		WebElement un=driver.findElement(By.cssSelector("input#username"));
		un.sendKeys("krishwanthadhiswar@gmail.com");
		WebElement up=driver.findElement(By.cssSelector("input#password"));
		up.sendKeys("Rishwa16.");
		WebElement login=driver.findElement(By.cssSelector("button.btn__primary--large"));
		login.click();
		String good=driver.getCurrentUrl();
		//System.out.println(good);
		if(good.contains("feed/?trk=guest_homepage-basic_nav-header-signin"))
		{
			System.out.println("Login Sucessful");
			driver.close();
		}
		else
		{
			System.out.println("Not Successful");
			driver.close();
		}
		
		

	}

}
