package practice;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class ExecutionOrderJVM {
	
	@Test
	public void edit() throws Exception {
		System.out.println("edit executed");
	}
	

	@Test
	public void create() throws Exception {
		System.out.println("create executed");
	}
	
	
	@Test
	public void remove() throws Exception {
		System.out.println("delete executed");
	}

}
