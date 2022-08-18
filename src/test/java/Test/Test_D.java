package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// identify the element by Locator-->id
		
		Thread.sleep(3000);
	 WebElement text_email = driver.findElement(By.id("email"));
	 text_email.sendKeys("vidggfjdg@gmil.com");
	
     WebElement  text_Password =driver.findElement(By.id("pass"));
     text_Password.sendKeys("123456789");
    
     WebElement btn_login =driver.findElement(By.name("login"));
     Thread.sleep(5000);
     btn_login.click();
     Thread.sleep(5000);
     
     String title =driver.getTitle();
     System.out.println(title);
     
     String url=driver.getCurrentUrl();
     System.out.println(url);
     
     driver.close();
     
     
     

     
	
      	}
	

}
