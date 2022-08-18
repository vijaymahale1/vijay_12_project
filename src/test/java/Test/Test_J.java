package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_J {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//Autosuggestion 
		
	WebElement text_searchBar = driver.findElement(By.xpath("//input[@name='q']"));
	text_searchBar.sendKeys("Maven");
	
	
	Thread.sleep(3000);
	List<WebElement> List =driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	System.out.println(List.size());//  total drop down  10 elements
	
    //used ForLoop
	
	for(int i=0;i<List.size();i++) {  // All List print on console
		
		System.out.println(List.get(i).getText());
		
		if(List.get(i).getText().equals("maven interview questions")) {
			
			List.get(i).click();
			break;
		}
		
	}
	
	//System.out.println(List.get(4).getText());
	
	
	//List.get(4).click();// 

	}

}
