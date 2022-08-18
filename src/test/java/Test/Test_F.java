package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_F {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		// Webelement --> Xpath  By Attribute--->//tagname[@attribute name='value']
		
		WebElement text_email=driver.findElement(By.xpath("//input[@id='email']"));
		text_email.sendKeys("vhkjgkjhkhk@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement text_Password=driver.findElement(By.xpath("//input[@id='pass']"));
		text_Password.sendKeys("fgfghjggj455666");
		
		Thread.sleep(3000);
		
    	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
		
		Thread.sleep(3000);
		
		WebElement btn_forgotten=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		
		btn_forgotten.click();
		
	  
		WebElement pass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		pass.click();
		
		
		
	
	//	WebElement btn_login=driver.findElement(By.xpath("//button[@id=\'loginbutton\']"));
	//	btn_login.click();
		
  	 //   WebElement btn_login=driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
	
		
	
		
		
	}

}
