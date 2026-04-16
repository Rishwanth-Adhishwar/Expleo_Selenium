package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.testim.io/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File("./Screenshots/Selenium"+System.currentTimeMillis()+".png"));
	System.out.println("ScreenShot Taken");
	driver.quit();
	}

}
