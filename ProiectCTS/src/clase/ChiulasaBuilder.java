package clase;

import java.io.IOException;

import interfete.IChiulasa;

public class ChiulasaBuilder implements IChiulasa{
	
	private Chiulasa chiulasa;
	
	public ChiulasaBuilder() {
		this.chiulasa = new Chiulasa();
	}

	public ChiulasaBuilder setCodComp(String codComp) throws IOException{
		this.chiulasa.setCodComponenta(codComp);
		return this;
	}
	
	public ChiulasaBuilder setCodPiesa(int codPiesa){
		this.chiulasa.setCodPiesa(codPiesa);
		return this;
	}

	@Override
	public Chiulasa build() {
		return this.chiulasa;
	}
	
}
