package Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_S {

	public static void main(String[] args) throws Exception {
		// Task Alert
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//identify WebElement
		
	WebElement fst_name=driver.findElement(By.xpath("//input[@name='firstName']"));
	fst_name.sendKeys("vijay");
	
    WebElement lst=driver.findElement(By.xpath("//input[@name='lastName']"));
    lst.sendKeys("Mahale");
    
    
     WebElement mob= driver.findElement(By.xpath("//input[@name='phone']"));
     mob.sendKeys("15544566224");
     
    WebElement text_email= driver.findElement(By.xpath("//input[@name='userName']"));
    text_email.sendKeys("vnvgfghfjhg45g@bjkh.com");
    
    Thread.sleep(3000);
    
    WebElement adrs=driver.findElement(By.xpath("//input[@name='address1']"));
    adrs.sendKeys("vijsff dhghjjj hbhjhj ");
    
    
     WebElement ct=  driver.findElement(By.xpath("//input[@name='city']"));
     ct.sendKeys("PUNE");
     
     WebElement MH= driver.findElement(By.xpath("//input[@name='state']"));
     MH.sendKeys("MAHRASHTRA");
     
     
     WebElement ps=driver.findElement(By.xpath("//input[@name='postalCode']"));
     ps.sendKeys("554556");
     
     Thread.sleep(3000);
     
     WebElement country= driver.findElement(By.xpath("//select[@name='country']"));
   
   
     Select ctr=new Select(country);
   
     ctr.selectByIndex(107);
     
     Thread.sleep(3000);
   
    WebElement usr= driver.findElement(By.xpath("//input[@name='email']"));
    usr.sendKeys("vijay@45155");
  
    WebElement psd=driver.findElement(By.xpath("//input[@name='password']"));
    psd.sendKeys("455566565");
    
    WebElement cnfps= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
    cnfps.sendKeys("455566565");
    
    Thread.sleep(3000);
   
    WebElement btn=driver.findElement(By.xpath("//input[@ name='submit']"));
    
    btn.click();
    

    String path="C:\\Users\\uSER\\eclipse-workspace\\Batch_12_Project\\ScreenShot";
   
    
    TakesScreenshot ts=(TakesScreenshot) driver;
    
    File src=  ts.getScreenshotAs(OutputType.FILE);
    
    File distn =new File(path+"\\test1.png");   //OR hard file (path+"\\test.png");
    
    FileUtils.copyFile(src, distn);
    
    
    Thread.sleep(3000);
    
    driver.get("https://demo.guru99.com/test/newtours/login.php");
    
    WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
    user.sendKeys("vijay@45155");
    
    WebElement psd1=driver.findElement(By.xpath("//input[@name='password']"));
    psd1.sendKeys("455566565");
    
   WebElement sbmt_btn= driver.findElement(By.xpath("//input[@name='submit']"));
   sbmt_btn.click();
   
   
   
   String path1="C:\\Users\\uSER\\eclipse-workspace\\Batch_12_Project\\ScreenShot";
  
   
   TakesScreenshot ts1=(TakesScreenshot) driver;
   
   File src1=  ts.getScreenshotAs(OutputType.FILE);
   
   File distn1 =new File(path+"\\test.png");   //OR hard file (path+"\\test.png");
   
   FileUtils.copyFile(src1, distn1);
   
   
   
   
  
    

    
    
    
  
  
  
  
  
   
   
     
    
    
    
    
    
	}

}
