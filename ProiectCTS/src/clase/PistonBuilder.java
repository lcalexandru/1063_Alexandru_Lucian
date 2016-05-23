package clase;

import java.io.IOException;

import interfete.IPiston;

public class PistonBuilder implements IPiston{
	
	private Piston piston;
	
	public PistonBuilder() {
		this.piston = new Piston();
	}

	public PistonBuilder setCodComp(String codComp) throws IOException{
		this.piston.setCodComponenta(codComp);
		return this;
	}
	
	public PistonBuilder setCodPiesa(int codPiesa){
		this.piston.setCodPiesa(codPiesa);
		return this;
	}

	@Override
	public Piston build() {
		return this.piston;
	}
}
