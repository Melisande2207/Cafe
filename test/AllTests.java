
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CustomerInfoTest.class, 
	ItemTest.class,
	OrderTest.class})
public class AllTests {

}
