package practice;

import org.junit.Ignore;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MyTheoryTest {
	@DataPoint public static String bill ="Bill";
	@DataPoint public static String joe ="Joe";
	
	@DataPoints  public static char[] chars = new char[] {'A', 'B', 'C'};
	
	@Theory
	@Ignore
	public void build(char c, char d) {
		System.out.println(c+" "+d);
	}
	
	@Theory
	
	public void sanity(String firstName, String lastName) {
		System.out.println("Sanity check "+firstName+", "+lastName);
	}
}
