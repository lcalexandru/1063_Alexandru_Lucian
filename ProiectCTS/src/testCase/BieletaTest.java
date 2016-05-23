package testCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Bieleta;

public class BieletaTest {
	
	private Bieleta bieleta;
	
	@Before
	public void setUp(){
		bieleta=new Bieleta();
	}
	
	@Test
	public void returnValidOutput() {
		String result=bieleta.toString();
		assertNotNull(result);
		assertEquals("Bieleta-> cod componenta: XXRR, cod piesa: 302.", result);
	}
	
	@Test(expected=IllegalArgumentException.class)//Testing for expected exceptions
	public void throwExceptionForDimensiuneZero(){
		bieleta.arataDimensiune(0);
	}
	
	@Test(expected=IllegalArgumentException.class)//Testing for expected exceptions
	public void throwExceptionForDimensiuneGreaterThan100(){
		bieleta.arataDimensiune(101);
	}
	
	@After
	public void tearDown(){
		bieleta=null;
	}
}
