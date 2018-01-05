package practice;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static practice.LessThanOrEqual.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;;



public class AssertThatTest {
	
	@Test
	public void verify_Matcher() throws Exception {
		
		int age = 30;
		
		assertThat(age, is(30));
		
		
		assertThat(age, not(equalTo(33)));
	}
	
	@Test
	public void verify_multiple_values() throws Exception {
		
		double marks = 100.00;
		
		assertThat(marks, either(is(100.00)).or(is(90.9)));
		
		assertThat(marks, both(not(99.99)).and(not(60.00)));
		
		assertThat(marks, anyOf(is(100.00), is(1.00) ,is(55.00)
				,is(88.00) ,is(67.8)));
		
		assertThat(marks, not(anyOf(is(0.00), is(200.00))));
		
		assertThat(marks, not(allOf(is(1.00), is(100.00), is(30.00))));
	}
	
	@Test
	public void verify_Collection_Values() throws Exception {
		
		List<Double> salary = Arrays.asList(50.0, 200.0, 500.0);
		
		assertThat(salary, hasItem(50.0));
		
		assertThat(salary, hasItems(50.0, 200.0));
		
		assertThat(salary, not(hasItem(1.00)));
	}
	
	@Test
	public void verify_Strings() throws Exception {
		
		String name = "John Jr Dale";
		
		assertThat(name, startsWith("John"));
		
		assertThat(name, endsWith("Dale"));
		
		assertThat(name, containsString("Jr"));
	}
	
	@Test
	public void lessThanOrEqual_custom_matcher() throws Exception {
		int actualPointsScored = 21;
		assertThat(actualPointsScored, lessThanOrEqual(28));
		assertThat(actualPointsScored, lessThanOrEqual(21));
		
		double originalPI = 3.14;
		assertThat(originalPI, lessThanOrEqual(7.00));
		
		String localTeam = "Phila";
		assertThat(localTeam, lessThanOrEqual("Philadelphia"));
		
		int maxInt = Integer.MAX_VALUE;
		assertThat(maxInt, not(lessThanOrEqual(Integer.MIN_VALUE)));
	}

}
