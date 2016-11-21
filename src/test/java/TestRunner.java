import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses({Class_1.class, Class_2.class})
public class TestRunner {
    public  class tstRunner{
    }
}
