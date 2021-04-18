package ro.ase.csie.cts.sem8.dp.decorator;

import ro.ase.cise.cts.sem8.dp.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter {

	int nivelScut;

	public DecoratorScut(ACMECaracterJoc caracter, int nivel) {
		super(caracter);
		this.nivelScut = nivel;
	}

	@Override
	public void esteLovit(int puncte) {
		int puncteLovitura = puncte - this.nivelScut;
		if (puncteLovitura > 0)
			super.caracter.esteLovit(puncteLovitura);
	}
}
