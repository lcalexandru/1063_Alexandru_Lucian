package clase;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import interfete.IProdFabrica;
import interfete.Piese;

public class Piston implements IProdFabrica,Piese{

	@Override
	public String toString() {
		return "Piston-> cod componenta: " + codComponenta + ", cod piesa: " + codPiesa + ".";
	}

	private String codComponenta;
	private int codPiesa;
	private static final AtomicInteger contor=new AtomicInteger(100);
	
	public Piston(){
		this.codComponenta="XXWW";
		this.codPiesa = contor.incrementAndGet();
	}
	
	public String getCodComponenta() {
		return codComponenta;
	}

	public void setCodPiesa(int codPiesa) {
		this.codPiesa = codPiesa;
	}

	public void setCodComponenta(String codComponenta) throws IOException {
		if(codComponenta!="XXWW")
			throw new IOException("Cod invalid");
		else{
			this.codComponenta = codComponenta;
		}
	}

	public int getCodPiesa() {
		return codPiesa;
	}

	@Override
	public void descriereComponenta() {
		System.out.println("S-a realizat o componenta de tip "+codComponenta+" cu codul unic: "+codPiesa);
	}

	@Override
	public void descriere() {
		System.out.println("Piston: "+codComponenta+" "+codPiesa+".");
	}

	@Override
	public void adaugaPiesa(Piese doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stergePiesa(Piese doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Piese getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
