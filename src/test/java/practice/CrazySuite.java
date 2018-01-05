package practice;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(CrazyTests.class)
@SuiteClasses({SomeTest.class, OtherTest.class})
public class CrazySuite {

}
