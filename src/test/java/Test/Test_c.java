package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_c {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// identify the webElement ---->Locators---id
		Thread.sleep(3000);
	WebElement text_email=driver.findElement(By.id("email"));
    text_email.sendKeys("Vbjdvjxvj@gamail.com");
	       
	       
	WebElement text_password=driver.findElement(By.id("pass"));
	 text_password.sendKeys("12545588888");
	       
	       // identify webElement-Name
	       
	WebElement btn_login= driver.findElement(By.name("login"));
	Thread.sleep(5000);
	btn_login.click();
	Thread.sleep(3000);
    String title=driver.getTitle();
    System.out.println(title);
    Thread.sleep(3000);
    String url=driver.getCurrentUrl();
    System.out.println(url);
    Thread.sleep(3000);
    driver.close();
   
   
	

	}

}
