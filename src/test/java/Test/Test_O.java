package Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_O {

	public static void main(String[] args) throws Exception {
	
		
		// Screenshot
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        
        
     WebElement text_email= driver.findElement(By.xpath("//input[@name='email']"));
     text_email.sendKeys("vijayydggdhhhdhh@.com");
     
     Thread.sleep(3000);
     
     WebElement text_pass=driver.findElement(By.xpath("//input[@name='pass']"));
     text_pass.sendKeys("a142356455");
     
     Thread.sleep(3000);
     
     WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
     
     btn_login.click(); 
     
     String path="C:\\Users\\uSER\\eclipse-workspace\\Batch_12_Project\\ScreenShot";
     
     
     String rm= RandomString.make(3);// one screenshot multiple name in three words
     
     TakesScreenshot ts=(TakesScreenshot) driver;
     
     File src=  ts.getScreenshotAs(OutputType.FILE);
     
     File distn =new File(path+"\\"+rm+".png");   //OR hard file (path+"\\test.png");
     
     FileUtils.copyFile(src, distn);
     
     
       
        
        
        
	}

}
