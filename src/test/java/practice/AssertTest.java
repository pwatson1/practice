package practice;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.math.BigDecimal;


public class AssertTest {
	
	@Test
	public void assertTrueAndFalse () throws Exception {
		
		Assert.assertTrue(true);
		
		Assert.assertFalse(false);
		
	}
	
	@Test
	public void assertNullAndNotNull() throws Exception {
		
		Object myObject = null;
		
		Assert.assertNull(myObject);
		
		myObject = new String("I'm alive!");
		
		Assert.assertNotNull(myObject);
		
	}
	
	@Test
	public void assertEqualsTest() throws Exception {
		
		Integer i = new Integer("5");
		
		Integer j = new Integer("5");
		
		assertEquals(i,j);
		
	}
	
	@Test
	public void assertEqualsDouble() throws Exception {
		
		Double a = new Double("2.51");
		Double b = new Double("2.51");
		Double c = new Double(".01");
		
		assertEquals(a,b,c);
	}
	
	@Test
	public void assertEqualsBigDecimal() throws Exception {
		
		BigDecimal a = new BigDecimal("2.51");
		BigDecimal b = new BigDecimal("2.51");
		
		assertEquals(a,b);
	}
	
	
	@Test
	public void assertSameTest() throws Exception {
		
		Integer i = new Integer("5");
		
		Integer j =  i;
		
		assertSame(i,j);
		
	}
	
	@Test
	public void assertNotSameTest() throws Exception {
		
		Integer i = new Integer("5");
		
		Integer j = new Integer("5");
		
		assertNotSame(i,j);
	}
	
	@Test(expected=RuntimeException.class)
	public void exceptionTest() {
		throw new RuntimeException();
	}
	
	@Test
	@Ignore("Incomplete algorythm for Tariq's code.")
	public void AI() throws Exception {
		
	}

}
