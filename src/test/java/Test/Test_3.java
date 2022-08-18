package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup();// i want the cross browser testing ..then how
		WebDriver driver=new EdgeDriver();
		driver.get("https://majhinaukri.in/");
		driver.manage().window().maximize();
		
    
	
	}
	
}
