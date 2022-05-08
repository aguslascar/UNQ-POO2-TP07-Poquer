package ar.edu.unq.po2.tp7;

import java.util.HashSet;
import java.util.Set;

public class PokerStatus {
	
 
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
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
