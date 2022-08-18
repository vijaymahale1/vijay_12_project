package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_T {

	public static void main(String[] args) throws Exception {
		//Child browser Popup Handling
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		
		String parentwindowAdd=driver.getWindowHandle();//taken  only parent adress
		System.out.println(parentwindowAdd);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		Set<String> AllAdress=driver.getWindowHandles();//// to give all Adress  parents as well as child
		
		System.out.println(AllAdress);
		
		Iterator<String> it=AllAdress.iterator();
		
			while(it.hasNext()) {
			
			
	String childwindowAdd=it.next();
		
	if(!parentwindowAdd.equals(childwindowAdd)){
			
		driver.switchTo().window(childwindowAdd);
			
        WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
		email.sendKeys("vijaymahale@55666.com");
		WebElement sbbtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		sbbtn.click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
		}
	driver.switchTo().window(parentwindowAdd);
	driver.close();
		
		
		
	
		
		
		
		

	}

}
