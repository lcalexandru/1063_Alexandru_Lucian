package clase;

import interfete.ModDePlata;
import clase.Client;

public class PlataViramentBancar implements ModDePlata{
	
	@Override
	public void execute() {
		System.out.println("Plata aferenta acestui motor se realizeaza prin VIRAMENT BANCAR!");
	}

}
