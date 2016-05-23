package main;

import java.io.IOException;

import clase.Bieleta;
import clase.BieletaBuilder;
import clase.Chiulasa;
import clase.Client;
import clase.FacadeFabrica;
import clase.FactoryClass;
import clase.Inginer;
import clase.Motor;
import clase.Piston;
import clase.PlataViramentBancar;
import clase.ReprezentantVanzari;
import clase.Volanta;
import enumerari.ProduseFabrica;
import interfete.IProdFabrica;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*SINGLETON + FACTORY*/
//		System.out.println("Singleton + Factory");
//		System.out.println("--------------------------------------------------------\n");
//	
//		FactoryClass factory=FactoryClass.getInstanta("Fabrica Componente YAZAKI\n");
//		System.out.println(factory.toString());
//		IProdFabrica produs;
//		    		
//		produs=factory.creareProd(ProduseFabrica.Piston);
//		produs.descriereComponenta();
//		    		
//		produs=factory.creareProd(ProduseFabrica.Chiulasa);
//		produs.descriereComponenta();
//		
//		produs=factory.creareProd(ProduseFabrica.Bieleta);
//		produs.descriereComponenta();
//		    		
//		produs=factory.creareProd(ProduseFabrica.Volanta);
//		produs.descriereComponenta();
		
		/*BUILDER*/
//		try{
//			Bieleta b=new Bieleta();
//			b.setCodComponenta("XXRR");
//			System.out.println(b.toString());
//			
//			Bieleta b1=new BieletaBuilder().setCodComp("XXRR").setCodPiesa(321).build();
//			System.out.println(b1.toString());
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
//		/*COMPOSITE*/
//		Motor m1=new Motor("1.4 16V","diesel");
//		
//		Bieleta b1=new Bieleta();
//		Chiulasa c1=new Chiulasa();
//		Piston p1=new Piston();
//		Volanta v1=new Volanta();
//		
//		m1.adaugaPiesa(b1);
//		m1.adaugaPiesa(c1);
//		m1.adaugaPiesa(p1);
//		m1.adaugaPiesa(v1);
//		
//		m1.descriere();
		
//		/*COMMAND*/
//		Inginer ing1=new Inginer("Alexandru Ionut");
//		
//		int nrClient=100;
//		
//		ReprezentantVanzari reprezV=new ReprezentantVanzari(nrClient);
//		
//		reprezV.preiaComenzi(new Motor(ing1,"1.4 16V","benzina"));
//		
//		reprezV.trimiteComenzi();
		
		/*FACADE*/
		//FacadeFabrica.procesFabricare("Alexandru Lucian", 100, "1.4 16V", "Diesel");
		
		/*STRATEGY*/
		Client c1=new Client("Alexandru Lucian","0765636434", new PlataViramentBancar());
		//c1.plateste();
		
		/*Observer*/
		Motor m1=new Motor("1.9 TDCI", "Diesel");
		
		m1.adauga(c1);
		
		m1.anuntaModificari();
//		System.out.println("--------------------------------------------------------\n");
//		
//		produs=factory.creareProd(ProduseFabrica.Piston);
//		produs.descriereComponenta();
//		
//		produs=factory.creareProd(ProduseFabrica.Chiulasa);
//		produs.descriereComponenta();
//		
//		produs=factory.creareProd(ProduseFabrica.Bieleta);
//		produs.descriereComponenta();
//		
//		produs=factory.creareProd(ProduseFabrica.Volanta);
//		produs.descriereComponenta();
//		
//		System.out.println("--------------------------------------------------------\n");
	}

}
