package Test_P;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_3 {
   
	WebDriver driver;
    @Test
   public void Test_A() throws Exception {
    	
    	WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        WebElement src= driver.findElement(By.xpath("//input[@type='text']"));
        src.sendKeys("mobile");
        
        
        WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
        
        WebElement spc=driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
        
        spc.click();
       
        String title3=driver.getTitle();
        System.out.println(title3);
       
       
        String path="C:\\Users\\uSER\\eclipse-workspace\\Batch_12_Project\\ScreenShot";
       
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        
        File spc1=  ts.getScreenshotAs(OutputType.FILE);
        
        File distn1 =new File(path+"\\test5.png");   //OR hard file (path+"\\test.png");
        
        FileUtils.copyFile(spc1, distn1);
        
        WebElement Actual=driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
        
        String Act="Best sellers";
        
        String Expected="Best sellers";
        
        Assert.assertEquals(Act, Expected);
      
        
        
      
        
   
    }
}
