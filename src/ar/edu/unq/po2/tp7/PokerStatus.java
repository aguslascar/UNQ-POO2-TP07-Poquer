package ar.edu.unq.po2.tp7;

import java.util.HashSet;
import java.util.Set;

public class PokerStatus {
	
 
	public Jugada verificar(Jugada mano1, Jugada mano2) {
		if(this.esEmpate(mano1,mano2)) {
			return this.desempate(mano1,mano2);
		}
		else if (this.esMayorJugada(mano1, mano2)) {
			return mano1;
		}
		else return mano2;
		
		/*
		if (this.cantIgualValor(carta1, carta2, carta3, carta4, carta5) == 2) {
			return "Poker";
		}
		else if (this.cantIgualValor(carta1, carta2, carta3, carta4, carta5) == 3) {
			return "Trio";
		}
		else if (this.tienenMismoPalo(carta1, carta2, carta3, carta4, carta5)) {
			return "Color";
		}
		else return null;
		*/
	}
	
	private boolean esEmpate(Jugada mano1, Jugada mano2) {
		return mano1.tipoDeJugada() == mano2.tipoDeJugada();
	}
	
	private boolean esMayorJugada(Jugada mano1, Jugada mano2) {
		String jugada1 = mano1.tipoDeJugada();
		String jugada2 = mano2.tipoDeJugada();
		return (jugada1 == "Poker" 
				&& (jugada2 == "Color" || jugada2 == "Trio")) 
				|| (jugada1 == "Color" && jugada2 == "Trio");
			
	}
	
	private Jugada desempate(Jugada mano1, Jugada mano2) {
		if(mano1.valorDeMano() < mano2.valorDeMano()) {
			return mano1;
		}
		else return mano2;
	}
	
	private int cantIgualValor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		Set<Integer> cartas = new HashSet<Integer>();
		cartas.add(carta1.valor());
		cartas.add(carta2.valor());
		cartas.add(carta3.valor());
		cartas.add(carta4.valor());
		cartas.add(carta5.valor());
		return cartas.size();
	}

	
	private boolean tienenMismoPalo(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		Set<String> cartas = new HashSet<String>();
		cartas.add(carta1.palo());
		cartas.add(carta2.palo());
		cartas.add(carta3.palo());
		cartas.add(carta4.palo());
		cartas.add(carta5.palo());
		return cartas.size() == 1;
	}
	
	private String removerPalo(String carta) {
		return carta.substring(0, carta.length() - 1);
	}
	
	private String removerValor(String carta) {
		return carta.substring(carta.length() - 1);
	}
	
}
