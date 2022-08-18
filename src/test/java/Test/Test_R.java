package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_R {

	public static void main(String[] args) throws Exception {
		//1) Alert Handling------->POpup Handling
		
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        // identify WebElement 
    WebElement text_custid= driver.findElement(By.xpath("//input[@name='cusid']"));
    
    text_custid.sendKeys("4555554555");
    
     WebElement btn_submit= driver.findElement(By.xpath("//input[@type='submit']"));
     btn_submit.click();
      
       // how to handle Alert
      
     
    Alert alt= driver.switchTo().alert();
    String text=  alt.getText();
    System.out.println(text); //Do you really want to delete this Customer?
    
    //alt.dismiss();
   
    alt.accept();// click on OK button
    
    Thread.sleep(3000);
    
    String text1= alt.getText();
    System.out.println(text1); //Customer Successfully Delete!
    
    alt.accept();
    
    
    

	}

}
