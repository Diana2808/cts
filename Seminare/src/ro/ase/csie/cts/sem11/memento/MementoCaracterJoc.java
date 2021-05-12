package ro.ase.csie.cts.sem11.memento;

import java.util.Date;

public class MementoCaracterJoc {
	String denumire;
	int puncteViata;
	String abilitatiMagice;
	
	Date momentSalvare;

	public MementoCaracterJoc(String denumire, int puncteViata, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncteViata = puncteViata;
		this.abilitatiMagice = abilitatiMagice;
		momentSalvare = new Date();
	}
}
