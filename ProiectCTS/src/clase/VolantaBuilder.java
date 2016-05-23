package clase;

import java.io.IOException;

import interfete.IVolanta;

public class VolantaBuilder implements IVolanta{
	
	private Volanta volanta;
	
	public VolantaBuilder() {
		this.volanta = new Volanta();
	}

	public VolantaBuilder setCodComp(String codComp) throws IOException{
		this.volanta.setCodComponenta(codComp);
		return this;
	}
	
	public VolantaBuilder setCodPiesa(int codPiesa){
		this.volanta.setCodPiesa(codPiesa);
		return this;
	}

	@Override
	public Volanta build() {
		return this.volanta;
	}
	
	
}
