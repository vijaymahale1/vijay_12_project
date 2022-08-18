package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_G {

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login.php/");
		 driver.manage().window().maximize();
		
		 //WebElement identify
		
	     WebElement text_email =driver.findElement(By.xpath("//input[@id='email']"));
	     text_email.sendKeys("vijsyhfhhfhh@1245.com");
	    
	   
	    WebElement text_pass=driver.findElement(By.xpath("//input[@id='pass']"));
	    text_pass.sendKeys("1545999999");
	   
// dynamic -->	  // WebElement login=driver.findElement(By.xpath("//button[@id='u_0_5_']"));
	  // login.click();
	       // OR used  name="login"----->attribute used
	     
	     WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	     login.click();
	     
	     //OR used Xpath by contains:
	     
   //   WebElement login=driver.findElement(By.xpath("//button[contains@id,'u_0_5_']"));
	 //   login.click();
	     
	     
	     WebElement btn=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
	     btn.click();
	     
	     
	     
	    
	    
	}

}
