package testCase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.FactoryClass;
import enumerari.ProduseFabrica;
import interfete.IProdFabrica;

public class FactoryClassTest {

	@Test
	public void testSingleton() {
		FactoryClass f1=FactoryClass.getInstanta("Fabrica");
		FactoryClass f2=FactoryClass.getInstanta("Fabrica2");
		assertEquals(f1, f2);
	}
	
	@Test
	public void testSwitch(){
		FactoryClass f1=FactoryClass.getInstanta("Fabrica");
		IProdFabrica produs;
		
		produs=f1.creareProd(ProduseFabrica.Bieleta);
		assertEquals("Bieleta-> cod componenta: XXRR, cod piesa: 305.", produs.toString());
		
		produs=f1.creareProd(ProduseFabrica.Chiulasa);
		assertEquals("Chiulasa-> cod componenta: XXEE, cod piesa: 201.", produs.toString());
		
		produs=f1.creareProd(ProduseFabrica.Piston);
		assertEquals("Piston-> cod componenta: XXWW, cod piesa: 101.", produs.toString());
		
		produs=f1.creareProd(ProduseFabrica.Volanta);
		assertEquals("Volanta-> cod componenta: XXTT, cod piesa: 401.", produs.toString());
	}
	
	@Test
	public void testInstOfInterface(){
		FactoryClass f1=FactoryClass.getInstanta("Fabrica");
		IProdFabrica produs;
		
		produs=f1.creareProd(ProduseFabrica.Bieleta);
		assertTrue(produs instanceof IProdFabrica);
	}
	
	@Test
	public void testOrar(){
		FactoryClass fact=FactoryClass.getInstanta("Fabrica");
		ArrayList<String > lista=fact.creareListaOrar("10:00-17:00", "10:00-17:00", "10:00-17:00", "10:00-17:00", "10:00-17:00");
		assertNull(lista);
	}
	
	@Test
	public void testOrar_NotNull(){
		FactoryClass fact=FactoryClass.getInstanta("Fabrica");
		ArrayList<String > lista=fact.creareListaOrar("Luni:10:00-17:00", "Marti:10:00-17:00", "Miercuri:10:00-17:00", "Joi:10:00-17:00", "Vineri:10:00-17:00");
		assertNotNull(lista);
	}
	
	@Test
	public void testListSize(){
		FactoryClass fact=FactoryClass.getInstanta("Fabrica");
		ArrayList<String > lista=fact.creareListaOrar("Luni:10:00-17:00", "Marti:10:00-17:00", "Miercuri:10:00-17:00", "Joi:10:00-17:00", "Vineri:10:00-17:00");
		assertEquals(5,lista.size());
	}
}
