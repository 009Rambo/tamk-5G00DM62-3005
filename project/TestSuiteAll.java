
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    Class1Test.class,
    Class2Test.class,
    Class3Test.class,
    Class4Test.class,
    // Add other test classes here
})
public class TestSuiteAll {
    // This class remains empty
}
