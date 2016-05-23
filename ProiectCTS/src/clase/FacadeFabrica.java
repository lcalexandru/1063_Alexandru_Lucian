package clase;

import java.io.IOException;

public class FacadeFabrica {
	
	 public static void procesFabricare(String numeIng,String prenume,String anNastere,int nrClient,String denumireMot,String tipMot) throws IOException{
		 	Inginer ing1=new Inginer(numeIng,prenume,anNastere);
		 	System.out.println(ing1.toString());
			System.out.println("S-a creat un inginer");
			ReprezentantVanzari reprezV=new ReprezentantVanzari(nrClient);
			reprezV.preiaComenzi(new Motor(ing1,"1.4 16V","benzina"));
			System.out.println("S-a preluat comanda cu urmatoarele caracteristici: "+denumireMot+" "+tipMot);
			
			Bieleta b1=new BieletaBuilder().build();
			Chiulasa c1=new ChiulasaBuilder().build();
			Piston p1=new PistonBuilder().build();
			Volanta v1=new VolantaBuilder().build();
			b1.descriereComponenta();
			c1.descriereComponenta();
			p1.descriereComponenta();
			v1.descriereComponenta();
			System.out.println("S-au creat piesele necesare");
			Motor m1=new Motor(denumireMot,tipMot);
			m1.adaugaPiesa(b1);
			m1.adaugaPiesa(c1);
			m1.adaugaPiesa(p1);
			m1.adaugaPiesa(v1);
			m1.descriere();
			
			reprezV.trimiteComenzi();
			System.out.println("S-a fabricat motorul!");
	 }
	
}
