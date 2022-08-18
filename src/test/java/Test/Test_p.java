package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_p {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		
	WebElement text_email=driver.findElement(By.xpath("//input[@name='email']"));
		
	Actions act=new Actions(driver);
	
	Thread.sleep(3000);
	//UPERCASE TO LOWERCASE
	act.keyDown(text_email,Keys.SHIFT).sendKeys("vijay").keyUp(Keys.SHIFT).build().perform();
	
	Thread.sleep(3000);
	// select all value
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(3000);
	// copy the value
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	Thread.sleep(3000);
	
	//select path password
     WebElement text_password=driver.findElement(By.xpath("//input[@name='pass']"));
     
 	Thread.sleep(3000);
 	// paste the copy value
 	act.keyDown(text_password,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
 	Thread.sleep(3000);
 	
 	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
 	
 	btn_login.sendKeys(Keys.ENTER);
 	
 	
	
	

	}
	

}
