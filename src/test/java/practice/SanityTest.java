package practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SanityTest {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("*** Before Class is invoked.");
		
	}
	
	@Before 
	public void before() {
		System.out.println("____________________________");
		System.out.println("Invoked before each method.");
	}
	
	@Test
	public void test1() {
		
		System.out.println("\t\t Test1 invoked.");
	}
	
	@Test
	public void test2() {
		
		System.out.println("\t\tTest2 invoked.");
	}
	
	@After
	public void after() {
		System.out.println("Invoked after each method.");
		System.out.println("=============================");
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("*** After Class is invoked");
		
	}

}
