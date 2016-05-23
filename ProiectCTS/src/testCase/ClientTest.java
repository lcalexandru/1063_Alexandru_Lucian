package testCase;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import clase.Client;
import clase.PlataCash;

public class ClientTest {
	
	private Client c1;
	
	@Before
	public void setUp(){
		c1=new Client("Lucian", "0765636434", new PlataCash());
	}
	
	@Test
	public void testCheckTelefon() throws IOException {
		c1.verificaTelefon();
		assertTrue(c1.verificaTelefon());
	}
	
	@Test
	public void testTipNrMob(){
		c1.verificaNumarMobil();
		assertTrue(c1.verificaNumarMobil());
	}
	
	@Test
	public void verifLungime(){
		c1.verificaLungime();
		assertTrue(c1.verificaLungime());
	}
	
	@Test
	public void testTipNrFix(){
		c1.verificaNumarFix();
		assertFalse(c1.verificaNumarFix());
	}
	
	@Test
	public void checkNumb(){
		c1.checkContaining();
		assertTrue(c1.checkContaining());
	}

}
