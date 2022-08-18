package Test_1;

import org.testng.annotations.Test;

public class Test_D_8 {
	//4)IncoationCount
	
	@Test
	public void A() {
		System.out.println("Test_1");
	}
	
	@Test(invocationCount=3)
	public void B() {
		System.out.println("Test_2");
	}
	
	@Test(priority=1)
	public void C() {
		
		System.out.println("Test_3");
	}
	
	@Test
	public void D () {
		System.out.println("Test_4");
	}
	@Test
	public void E() {
		
		System.out.println("Test_5");
	}
}


