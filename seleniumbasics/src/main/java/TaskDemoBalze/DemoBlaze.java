package TaskDemoBalze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement login=driver.findElement(By.cssSelector("#login2"));
		login.click();
		
		WebElement un=driver.findElement(By.xpath("//input[@id='loginusername'][1]"));
		un.click();
		un.sendKeys("Rishwa");
		
		WebElement up=driver.findElement(By.xpath(("//input[@id='loginpassword'][1]")));
		up.click();
		up.sendKeys("rishnavi");
		WebElement l=driver.findElement(By.cssSelector("button[onclick='logIn()']"));
		l.click();
		
		String expected="Welcome Rishwa";
		
		WebElement wel=driver.findElement(By.cssSelector("#nameofuser"));
		String actual=wel.getText();
		System.out.println(actual);
		if(expected.equals(actual))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Unsuccessful");
		}
	}

}
