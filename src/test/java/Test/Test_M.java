package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_M {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//driver.get("https://www.google.co.in/"); 
		driver.manage().window().maximize();

	WebElement drp_selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	
	   // WebElement email= driver.findElement(By.xpath("//a[text()='Gmail']"));
   
	 Actions act=new Actions(driver);
	
	 // 1)moveToElement Method
	 
	 act.moveToElement( drp_selenium).click().build().perform();//move and click on selenium_
	 
	 
	// act.moveToElement( email).click().build().perform();//move  overview on email on click
	 
	// 2)right click(mouse) Method
	
	 WebElement  rightclick_ele= driver.findElement(By.xpath("//span[text()='right click me']"));
	
	act.contextClick(rightclick_ele).build().perform();
	 
	// 3)Double click Method
	
     WebElement Double_ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(Double_ele).build().perform();
	 
	 
	}

}
