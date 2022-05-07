package ar.edu.unq.po2.tp7;

import java.util.HashSet;
import java.util.Set;

public class PokerStatus {
	
	private Set<String> cartas;
 
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
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
	
	private int cantIgualValor(String carta1, String carta2, String carta3, String carta4, String carta5) {
		String c1 = this.removerPalo(carta1);
		String c2 = this.removerPalo(carta2);
		String c3 = this.removerPalo(carta3);
		String c4 = this.removerPalo(carta4);
		String c5 = this.removerPalo(carta5);
		cartas = new HashSet<String>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		return cartas.size();
	}

	
	private boolean tienenMismoPalo(String carta1, String carta2, String carta3, String carta4, String carta5) {
		String c1 = this.removerValor(carta1);
		String c2 = this.removerValor(carta2);
		String c3 = this.removerValor(carta3);
		String c4 = this.removerValor(carta4);
		String c5 = this.removerValor(carta5);
		cartas = new HashSet<String>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		return cartas.size() == 1;
	}
	
	private String removerPalo(String carta) {
		return carta.substring(0, carta.length() - 1);
	}
	
	private String removerValor(String carta) {
		return carta.substring(carta.length() - 1);
	}
}
