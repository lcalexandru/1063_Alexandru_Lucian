package testCase;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Inginer;

public class InginerTest {
	
	private Inginer inginer;
	
	@Before
	public void setUp()throws Exception{
		inginer=new Inginer("Alexandru","Lucian","1984");
	}
	
	@Test
	public void testObject(){
		assertTrue(Inginer.class.isInstance(inginer));
	}
	
	@Test
	public void TestCheckNume() throws IOException{
		inginer.checkNume();
		assertTrue(inginer.checkNume());
		//assertTrue("Numele si prenume au fost validate", true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNumeEmpty() {
		inginer.setNume("");
	}
	
	@Test(expected=NullPointerException.class)
	public void testNumeNull() {
		inginer.setNume(null);
	}
	
	@Test
	public void nrParLitere(){
		boolean rez=inginer.nrParDeLitereNume();
		assertFalse(rez);
	}
	
	@Test
	public void nrImparLitere(){
		boolean rez=inginer.nrImparLiterePrenume();
		assertFalse(rez);
	}
	
	@After
	public void tearDown()throws Exception{
		inginer=null;
	}
	
	public void NumeNotNull() throws IOException{
		Inginer ing=new Inginer("Alexandru", "Lucian","1984");
		assertNotNull(ing.getNume());
	}
	
	@Test
	public void checkYear(){
		inginer.checkYearLength();
		assertTrue(true);
	}
}
