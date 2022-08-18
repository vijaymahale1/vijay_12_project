package Test_1;

import org.testng.annotations.Test;

public class Test_D_9 {
 
	//use groups
	
	@Test(groups="sanity")
	public void Test_A() {
		System.out.println("Test A");
	}
	
	@Test(groups="Critical regression")
	public void Test_B() {
		System.out.println("Test B");
		
	}
	
	@Test(groups="Regression")
	public void Test_C() {
		System.out.println("Test C");
			
	}
	
	@Test(groups="Regression")
	public void Test_D() {
		System.out.println("Test D");
		
	}
	
	
}
