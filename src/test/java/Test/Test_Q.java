package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Q {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		// identify webElement fb Excelsheet
		
		
	WebElement text_email=	driver.findElement(By.xpath("//input[@name='email']"));
	
	WebElement text_pass=driver.findElement(By.xpath("//input[@name='pass']"));
	

	String path="C:\\Users\\uSER\\eclipse-workspace\\Batch_12_Project\\Test Data\\Testdata.xlsx";


   FileInputStream fis=new FileInputStream(path);
 
  XSSFWorkbook Wb=new XSSFWorkbook(fis);
 
  // sheet 1(0,0)
  
  String data_1=Wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
  
  System.out.println(data_1);
  
  //sheet 1(0,1)
  
  String data_2=Wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
  System.out.println(data_2);

  //sheet 1(0,2)
  
  String data_3=Wb.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
 
  System.out.println(data_3);
  
  
String data_4=Wb.getSheet("sheet2").getRow(2).getCell(1).getStringCellValue();
  
  System.out.println(data_4);
  
  text_email.sendKeys(data_1);
  text_pass.sendKeys(data_2);

	}

}
