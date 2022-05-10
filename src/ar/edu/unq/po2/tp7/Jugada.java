package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Jugada {
	List<Carta> mano = new ArrayList<Carta>();
	
	public Jugada(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		mano.add(c1);
		mano.add(c2);
		mano.add(c3);
		mano.add(c4);
		mano.add(c5);
	}
	
	
	public int valorDeMano() {
		int total = 0;
		for(Carta c : mano) {
			total += c.valor();
		}
		return total;
	}
	
	public String tipoDeJugada() {		
		if(this.esPoker()) {
			return "Poker";
		}
		else if (this.esTrio()) {
			return "Trio";
		}
		else if (this.esColor()) {
			return "Color";
		}
		else return null;
	}
	
	private boolean esPoker() {
		return mano.stream().map(c -> c.valor()).collect(Collectors.toSet()).size() == 2;
	}
	
	private boolean esTrio() {
		return mano.stream().map(c -> c.valor()).collect(Collectors.toSet()).size() == 3;
	}
	
	private boolean esColor() {
		return mano.stream().map(c -> c.palo()).collect(Collectors.toSet()).size() == 1;
	}
}
