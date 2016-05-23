package clase;

import java.util.ArrayList;

import enumerari.ProduseFabrica;
import interfete.IProdFabrica;

public class FactoryClass {
	
	private String nume;
	
	private FactoryClass(String nume){
		this.nume=nume;
	}
	
	private static FactoryClass instanta=null;
	
	public static FactoryClass getInstanta(String nume){
		if(instanta==null){
			instanta=new  FactoryClass(nume);
		}
		return instanta;
	}
	
	public IProdFabrica creareProd(ProduseFabrica tip){
		switch(tip){
		case Piston:
			return new Piston();
		case Chiulasa:
			return new Chiulasa();
		case Bieleta:
			return new Bieleta();
		case Volanta:
			return new Volanta();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Numele fabricii este: "+nume;
	}
	
	public ArrayList<String> creareListaOrar(String orarLuni,String orarMarti,String orarMiercuri
			,String orarJoi,String orarVineri){

		ArrayList<String> listaOrar=null;
		if(orarLuni.length()>11||orarMarti.length()>11||orarMiercuri.length()>11||orarJoi.length()>11||orarVineri.length()>11){
				listaOrar=new ArrayList<String>();
				listaOrar.add(orarLuni);
				listaOrar.add(orarMarti);
				listaOrar.add(orarMiercuri);
				listaOrar.add(orarJoi);
				listaOrar.add(orarVineri);
		}
		return listaOrar;
	}
}
