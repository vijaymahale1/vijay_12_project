package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_k {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		// check program correction
		// search on mobile Redmi note pro
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("dairy milk fruit");
      Thread.sleep(3000);
	List<WebElement> List=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
    
	System.out.println(List.size());
	
	System.out.println(List.get(5).getText());
	
	List.get(5).click();

	//for(int i=0;i<List.size();i++) {  // All List print on console
		
	//	System.out.println(List.get(i).getText());
		
		//if(List.get(i).getText().equals("redmi note pro mobile 2022")) {
			
		//	List.get(i).click();
			
		//	break;
		
	
		
		
	
	
	
	
}
	}
