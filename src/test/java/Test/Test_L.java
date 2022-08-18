package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_L {

	public static void main(String[] args) throws Exception {
	        
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		// identify
	WebElement	drp_country=driver.findElement(By.xpath("// select[@name='country']"));
	
//	 HandleDropDown(drp_country,"BERMUDA");
	 
	Select sel=new Select (	drp_country);
	
	System.out.println(sel.getFirstSelectedOption().getText());// by default value(Country all ready present)
	
	// SelectByIndex method used
	sel.selectByIndex(8); 
	
	Thread.sleep(5000);
	
	// SelectByValue method
	
	sel.selectByValue("AUSTRALIA");
	
	// SelectByVisibleText method mostly used
	Thread.sleep(5000);
	sel.selectByVisibleText("BERMUDA");
	
	// particular Field how many Element present identify=264
	
	List<WebElement> List=sel.getOptions();
	System.out.println(List.size());
	
	// particular field  Country present or not identify to used for Loop
	
	
	//for(int i=0;i<List.size();i++) {
		

//	String text=List.get(i).getText();
//	System.out.println(text);
	
	//if(text.equals("CENTRAL AFRICAN REPUBLIC"));
	
	//sel.selectByVisibleText("CENTRAL AFRICAN REPUBLIC");
	
	
	//break;
	
	}
	
//

public static void HandleDropDown(WebElement element,String text) {
	
	Select select=new Select(element);
	select.selectByVisibleText("text");
	
	
	
 }
	
}
