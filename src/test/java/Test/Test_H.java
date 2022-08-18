package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_H {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		WebElement text_1=driver.findElement(By.xpath("(//input[@name='firstname'])[1]"));
		text_1.sendKeys("vijay");
		Thread.sleep(3000);
		
		WebElement text_2=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		text_2.sendKeys("mahale");
		
		Thread.sleep(3000);
		WebElement text_3=driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		text_3.sendKeys("visysy@gmail.com");
		
		Thread.sleep(3000);
		WebElement text_4=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		text_4.sendKeys("visysy@gmail.com");
		
		
		Thread.sleep(2000);
		
		WebElement text_5=driver.findElement(By.xpath("//input[@data-type='password']"));
		
		text_5.sendKeys("1254566655");
		
		
		
		
		
		

	}
	

}
