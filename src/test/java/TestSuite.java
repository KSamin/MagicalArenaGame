import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)


@Suite.SuiteClasses({
        PlayerTest.class,
        ArenaTest.class,
        DiceTest.class
})

public class TestSuite {
    // Run this TestSuite class for all the testcase at a time.
}
