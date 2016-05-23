package clase;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import interfete.IProdFabrica;
import interfete.Piese;

public class Volanta implements IProdFabrica,Piese{
	
	private String codComponenta;
	private int codPiesa;
	private static final AtomicInteger contor=new AtomicInteger(400);
	
	public Volanta(){
		this.codComponenta="XXTT";
		this.codPiesa = contor.incrementAndGet();;
	}
	
	public String getCodComponenta() {
		return codComponenta;
	}

	public void setCodComponenta(String codComponenta) throws IOException {
		if(codComponenta!="XXTT")
			throw new IOException("Cod invalid");
		else{
			this.codComponenta = codComponenta;
		}
	}

	public int getCodPiesa() {
		return codPiesa;
	}

	public void setCodPiesa(int codPiesa) {
		this.codPiesa = codPiesa;
	}

	@Override
	public void descriereComponenta() {
		System.out.println("S-a realizat o componenta de tip "+codComponenta+" cu codul unic: "+codPiesa);
	}

	@Override
	public void descriere() {
		System.out.println("Volanta: "+codComponenta+" "+codPiesa+".");
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

	@Override
	public String toString() {
		return "Volanta-> cod componenta: " + codComponenta + ", cod piesa: " + codPiesa + ".";
	}
	
}
