package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D_4 {
	
	@Test
	
	public void Verify_test1() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//scroll by Pixel
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement shoes=driver.findElement(By.xpath("//img[@alt='Campus Footwear']"));
		
		shoes.click();
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)", "");
		
		//scroll By Element
		
		Thread.sleep(5000);
	//	WebElement Australia=driver.findElement(By.xpath("//a[text()='Australia']"));
	//	js.executeScript("arguuments[0].scrollIntoView()", Australia);
		
		
	//	cutom_ScrollByElement(driver,Australia);
}
	
	public static void cutom_ScrollByElement(WebDriver driver,WebElement Australia) {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguuments[0].scrollIntoView()", Australia);

		
		
	}

}
