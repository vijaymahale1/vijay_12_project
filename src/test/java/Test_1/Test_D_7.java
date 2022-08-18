package Test_1;

import org.testng.annotations.Test;

public class Test_D_7 {

	//2)enabled=false
	//3)dependsonMethod=test case
	
	@Test
	public void A() {
		System.out.println("Test_A");
	}
	
    @Test(priority=0,enabled=false)
    
    public void B() {
    	System.out.println("Test_B");
    }
	
    @Test
    public void C() {
    	System.out.println("Test_C");
    }
    
  // 3)dependsonMethod(Test_D depends on Test_E
    
    @Test(dependsOnMethods="C")
    public void D() {
    	
    	System.out.println("Test_D");
    }
}

