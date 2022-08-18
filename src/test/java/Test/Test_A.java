package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_A {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?");
		driver.manage().window().maximize();
	
	   
		String title=driver.getTitle();
		System.out.println(title); // Login � Instagram
		
		
	    String url=driver.getCurrentUrl();//https://www.instagram.com/accounts/login/?
	    System.out.println(url);
	    
	    
	    driver.navigate().to("https://www.facebook.com/");
	    Thread.sleep(5000); //  5sec
	    driver.navigate().back();
	    Thread.sleep(5000);
	    driver.navigate().forward();
	    
	    driver.navigate().refresh();
	    driver.close();
	    
		
		}
	
    

}
