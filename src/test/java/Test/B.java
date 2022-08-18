package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {

	public static void main(String[] args) throws Exception {
	   
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/instagram/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		

	}

}
