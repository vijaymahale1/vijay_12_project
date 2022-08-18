package Test_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_6 {

	// Test case EXecutions Handle help of keyword
	//1)priority-----------0,-1 
	//2)enabled=false
	//3)dependsonMethod=test case
	//4)IncoationCount
	
	//1)priority( B,A,C)// ParticularTest case shows False the method used--->Assert.assertTrue(False) 
	
	@Test(priority=2)
	public void A() {
		System.out.println("Test_A");
		Assert.assertTrue(false);
	}
	
	@Test(priority=1,dependsOnMethods="A") // Skip That Method
	
	public void B() {
		System.out.println("Test_B");
	}
	
	@Test(priority=3)
	public void C() {
		System.out.println("Test_C");
	}
	
	//priority=0
	
	@Test(priority=0)
	public void D() {
		
		System.out.println("Test_Zero");
	}
	
	//priority=-1
	
	@Test(priority=-1)
	public void E() {
		System.out.println("Test_First");
	}
}
