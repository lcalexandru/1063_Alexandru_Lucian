package clase;

import java.io.IOException;

import interfete.IBieleta;

public class BieletaBuilder implements IBieleta{
	private Bieleta bieleta;
	
	public BieletaBuilder() {
		this.bieleta = new Bieleta();
	}

	public BieletaBuilder setCodComp(String codComp) throws IOException{
		this.bieleta.setCodComponenta(codComp);
		return this;
	}
	
	public BieletaBuilder setCodPiesa(int codPiesa){
		this.bieleta.setCodPiesa(codPiesa);
		return this;
	}

	@Override
	public Bieleta build() {
		return this.bieleta;
	}
}
