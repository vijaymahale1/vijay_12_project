package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_E {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    WebElement text_email=driver.findElement(By.id("ap_email"));
	    text_email.sendKeys("vijaycgjgjgkh@gamil.com");
	    
	    WebElement btn_continue =driver.findElement(By.id("continue"));
	    Thread.sleep(3000);
	    btn_continue.click();
	    
	   

	}

}
