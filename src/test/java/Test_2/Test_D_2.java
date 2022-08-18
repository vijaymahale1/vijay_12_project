package Test_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_2 {
	
	@Test
	public void test_1 () {
		// used Hard assert
		
		System.out.println("Email enter");
		System.out.println("Enter Password");
		System.out.println("Login botton click");
		
		String expected="BugSpotter";
	//	String actual="bugSpotter";  fail then go to next Test case(Test_2) but can not run Next steps(Test Done)
		String actual="BugSpotter"; //passed
		Assert.assertEquals(actual, expected); 
		
		System.out.println("Test Done");
	}
	
	@Test
	public void Test_2() {
		
		System.out.println("test_2");
	}

}
