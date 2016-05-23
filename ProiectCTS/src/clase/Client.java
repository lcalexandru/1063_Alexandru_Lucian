package clase;

import java.io.IOException;

import interfete.ModDePlata;
import interfete.Observer;

public class Client implements Observer{
	ModDePlata modDePlata;
	public String nume;
	public String telefon;

	public Client(String nume,String telefon,ModDePlata modDePlata) {
		this.nume=nume;
		this.telefon=telefon;
		this.modDePlata = modDePlata;
	}

	public void setModDePlata(ModDePlata modDePlata) {
		this.modDePlata = modDePlata;
	}
	
	public String getNume() {
		return nume;
	}

	public void plateste(){
		modDePlata.execute();
	}

	@Override
	public void update(String mesaj) {
		System.out.println("Aveti o notificare noua: "+mesaj);
	}
	
	public boolean verificaTelefon() throws IOException{
		if(telefon==null)
			throw new IOException("Telefonul nu poate avea valoarea null");
		else
			return true;
	}
	
	public boolean verificaNumarMobil(){
		if(telefon.startsWith("07"))
			return true;
		else
			return false;
	}
	
	public boolean verificaLungime(){
		if(telefon.length()==10)
			return true;
		else
			return false;
	}
	
	public boolean verificaNumarFix(){
		if(telefon.startsWith("021")||telefon.startsWith("0239")||telefon.startsWith("0233"))
			return true;
		else 
			return false;
	}
	
	public boolean checkContaining(){
		if(telefon.matches("[0-9]{3,}")&&telefon.length()==10)
			return true;
		else
			return false;
	}
}
