package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.ComandaFabrica;
import interfete.Observer;
import interfete.Piese;
import interfete.Subject;

public class Motor implements Piese,ComandaFabrica,Subject {
	
	Inginer inginer;
	public String denumire;
	public String tip;
	public ArrayList<Observer> listaObserver=new ArrayList<Observer>();
	public List<Piese> listaPiese=new ArrayList<Piese>();
	
	public Motor(Inginer inginer, String denumire, String tip) {
		super();
		this.inginer = inginer;
		this.denumire = denumire;
		this.tip = tip;
	}

	public Motor(String denumire,String tip) {
		this.denumire = denumire;
		this.tip=tip;
	}

	@Override
	public void descriere() {
		System.out.println("Motorul : "+denumire+" contine:");
		for(Piese piesa:listaPiese){
			piesa.descriere();
		}
	}

	@Override
	public void adaugaPiesa(Piese piesa) {
		listaPiese.add(piesa);
	}

	@Override
	public void stergePiesa(Piese piesa) {
		listaPiese.remove(piesa);
	}

	@Override
	public Piese getChild(int i) {
		return listaPiese.get(i);
	}

	@Override
	public void fabricaMotor() {
		this.inginer.fabricaMotor(tip,denumire);
	}

	@Override
	public void adauga(Observer o) {
		listaObserver.add(o);
	}

	@Override
	public void notifica(String mesaj) {
		for(Observer o:listaObserver){
			o.update(mesaj);
		}
	}
	
	public void anuntaModificari(){
		notifica("Motorul "+denumire+" de tip: "+tip+" a suferit o modificare pe linia de productie!");
	}
}
