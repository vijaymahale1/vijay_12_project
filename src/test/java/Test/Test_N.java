package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_N {

	public static void main(String[] args) throws Exception {
		//Drag and drop Method
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// to CREAT object for Actions class 
		
		 Actions act=new Actions(driver);
		 
		 
	WebElement text_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	
    WebElement distn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    
    act.dragAndDrop(text_src, distn).build().perform();
    
    Thread.sleep(3000);
    WebElement text1_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
    
    WebElement distn1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    
    act.dragAndDrop(text1_src, distn1).build().perform();
    
    Thread.sleep(3000);
    
    WebElement text2_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
    
    WebElement  distn2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
   
    act.dragAndDrop(text2_src, distn2).build().perform();
    
    Thread.sleep(3000);
    WebElement text3_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
    WebElement distn3=driver.findElement(By.xpath("//li[@class='placeholder']"));
    
    act.dragAndDrop(text3_src, distn3).build().perform();
    
	}
	

}
