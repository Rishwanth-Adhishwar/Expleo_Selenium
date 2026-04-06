package locatingElementsTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.spicemarket.in");
		System.out.println("----------BrandName---------");
		WebElement brandName1=driver.findElement(By.className("merchant-name"));
		System.out.println("Class Name: "+brandName1.getText());
		WebElement brandName2=driver.findElement(By.xpath("//div[text()='Spice Market']"));
		System.out.println("Xpath: "+brandName2.getText());
		WebElement brandName3=driver.findElement(By.xpath("//div[@class='brand-logo-container']/following-sibling::div"));
		System.out.println("Xpath: "+brandName3.getText());
		
		System.out.println("----------BrandLogoImage---------");
		WebElement img1=driver.findElement(By.className("b-logo"));
		System.out.println("Logo Located Done using class name");
		WebElement img2=driver.findElement(By.xpath("//div[@class='brand-logo-container']/child::img"));
		System.out.println("Logo Located Done using Xpath");
		WebElement img3=driver.findElement(By.xpath("//div[text()='Spice Market']/preceding-sibling::div/child::img"));
		System.out.println("Logo Located Done using Xpath");
		
		System.out.println("----------SwiperImage---------");
		WebElement swipeimg1=driver.findElement(By.className("swiper-img"));
		System.out.println("Swiper image located using className");
		WebElement swipeimg2=driver.findElement(By.xpath("//div[@aria-live='polite']/div[1]/img"));
		System.out.println("Swiper image located using xpath");	
		WebElement swipeimg3=driver.findElement(By.xpath("//div[@class='swiper-main-container']/descendant::div[contains(@class,'swiper-wrapper')]/child::div/img[1]"));
		System.out.println("Swiper image located using xpath");	
		
		System.out.println("----------DeliverTab(Text)---------");
		WebElement tab1=driver.findElement(By.className("md-text15"));
		System.out.println("Class Name: "+tab1.getText());
		WebElement tab2=driver.findElement(By.xpath("//span[text()='Delivery']"));
		System.out.println("Xpath: "+tab2.getText());
		WebElement tab3=driver.findElement(By.xpath("//div[@class='store-detail-inner-wrapper']/descendant::div[2]/span"));
		System.out.println("Xpath: "+tab3.getText());
		
		System.out.println("--------Current Location button-------------");
		WebElement cl1=driver.findElement(By.className("primary-cta"));
		System.out.println("Class Name: "+cl1.getText());
		WebElement cl2=driver.findElement(By.xpath("//div[text()='Use my current location']"));
		System.out.println("Xpath: "+cl2.getText());
		WebElement cl3=driver.findElement(By.xpath("//div[text()='Search street, locality…']/preceding-sibling::div[2]"));
		System.out.println("Xpath: "+cl3.getText());
		
		
		Thread.sleep(5000);
		System.out.println("-----------Delivery Page Search Box---------");
		driver.navigate().to("https://www.spicemarket.in/store/3/delivery");
		
		WebElement sb1=driver.findElement(By.xpath("//input[@placeholder='Search for items…']"));
		System.out.println("SearchBox Located Successfully by Xpath");
		WebElement sb2=driver.findElement(By.className("search-bar-input"));
		System.out.println("SearchBox Located Successfully by Class Name");
		
		Thread.sleep(2000);
		System.out.println("-------------Veg Only------------");
		WebElement veg1=driver.findElement(By.className("toggle-title"));
		System.out.println("Class Name: "+veg1.getText());
		WebElement veg2=driver.findElement(By.xpath("//label[@for]/preceding-sibling::span"));
		System.out.println("Xpath: "+veg2.getText());
		
        driver.quit();

	}

}
