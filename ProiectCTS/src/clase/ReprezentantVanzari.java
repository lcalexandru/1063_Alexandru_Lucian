package clase;

import java.util.ArrayList;

import interfete.ComandaFabrica;

public class ReprezentantVanzari {
	public ArrayList<ComandaFabrica> comenzi;
	private int idClient;
	
	public ReprezentantVanzari(int idClient) {
		this.comenzi=new ArrayList<>();
		this.idClient = idClient;
	}
	
	public void preiaComenzi(ComandaFabrica comanda){
		comenzi.add(comanda);
	}
	
	public void trimiteComenzi(){
		for(ComandaFabrica comanda:comenzi)
			comanda.fabricaMotor();
	}
}
