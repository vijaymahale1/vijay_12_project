package Test_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    WebDriver driver;
    
    @Parameters({"BrowserName"})// cross browser testing
	@BeforeMethod
	public void BM(String  BrowserName) {
		
    	
    	if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
    	}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
			
		
    }
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		} 
    
	@AfterMethod
	public void AM() {
		
		driver.close();
	}
}
