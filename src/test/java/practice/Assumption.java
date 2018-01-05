package practice;

import org.junit.Assume;
import org.junit.Test;

public class Assumption {
	
	boolean isSonarRunning = false;
	
	@Test
	public void codeQualityTest() throws Exception {
		
		isSonarRunning = true;
		
		Assume.assumeFalse(isSonarRunning);
	}

	@Test
	public void codeQualityRun2() throws Exception {
		
		isSonarRunning = true;
		
		Assume.assumeTrue(isSonarRunning);
	}

}
