package practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AssertTest.class, ExecutionOrderAscending.class, ExecutionOrderJVM.class})
public class TestSuite {

}
