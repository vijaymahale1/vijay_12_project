package Test_P;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_p1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/hotels/");
		driver.manage().window().maximize();
		
		
	    WebElement btn1=driver.findElement(By.xpath("//span[@class='switcherDownArrow appendLeft10']"));
	    btn1.click();
	    
	    WebElement btn2=driver.findElement(By.xpath("//p[@class='selectConInput']"));
        
	    Actions act1=new Actions(driver);
	    
	    act1.moveToElement(btn2).click().build().perform();
	    
	    Thread.sleep(3000);
	    
	    WebElement ss1=driver.findElement(By.xpath("(//p[@class='listRow'])[3]"));
	    //act1.moveToElement(act2).click().build().perform();
	    
	    ss1.click();
	}

}
