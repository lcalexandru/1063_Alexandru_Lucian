import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testCase.BieletaTest;
import testCase.ClientTest;
import testCase.FactoryClassTest;
import testCase.InginerTest;

@RunWith(Suite.class)
@SuiteClasses({BieletaTest.class,ClientTest.class,FactoryClassTest.class,InginerTest.class})
public class AllTests {
	
}
