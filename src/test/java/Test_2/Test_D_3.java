package Test_2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3 {

	@Test
	public void verify_text_2() {
		
		//verify soft Assert
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Enter Email");
		System.out.println("Enter Password");
		System.out.println("Login button click");
		
	    String Expected="BugSpotter";
	    String Actual="bugSpotter"; //fail (can not print console) but pass to next steps(Test done)
	    
	    soft.assertEquals(Actual, Expected);
	    
	    System.out.println("Test done");
	    
	    soft.assertAll();// all fail test cases print on console
	}
	
}
