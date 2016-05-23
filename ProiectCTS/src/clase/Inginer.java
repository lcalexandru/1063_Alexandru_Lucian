package clase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Inginer {
	
	private String nume;
	private String prenume;
	private String anNastere;

	public Inginer(String nume,String prenume,String anNastere) throws IOException {
		if(nume.length()>10||prenume.length()>10) {
			throw new IOException();
		}else{
			this.prenume=prenume;
			this.nume = nume;
			this.anNastere=anNastere;
		}
	}
	
	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getAnNastere() {
		return anNastere;
	}

	public void setAnNastere(String anNastere) {
		this.anNastere = anNastere;
	}

	public void setNume(String nume) {
		if(nume.equals(null)){
			throw new NullPointerException();
		}
		else if(nume.equals("")){
			throw new IllegalArgumentException();
		}
		else{
			this.nume = nume;
		}
	}

	public void fabricaMotor(String tip,String denumire){
		System.out.println("A fost realizat un motor de tip: "+tip+" cu denumirea: "+denumire);
	}

	@Override
	public String toString() {
		return "Inginer:-> "+nume;
	}
	
	public boolean checkNume(){
		if(Character.isUpperCase(nume.charAt(0)))
			return true;
		else 
			return false;
	}
	
	public boolean nrParDeLitereNume(){
		if(nume.length()%2==0)
			return true;
		else
			return false;
	}
	
	public boolean nrImparLiterePrenume(){
		if(prenume.length()%2!=0)
			return true;
		else
			return false;
	}
	
	public boolean checkYearLength(){
		if(anNastere.length()==4)
			return true;
		else
			return false;
	}
}
