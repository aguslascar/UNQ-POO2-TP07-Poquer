package ar.edu.unq.po2.tp7;

public class Carta {
	private int valor;
	private String palo;
	
	public Carta(int valor, String palo) {
		/**
		 * Represento las cartas con valor del 1 al 13 y con un palo.
		 * J = 11
		 * Q = 12
		 * K = 13
		 */
		this.valor = valor;
		this.palo = palo;
	}
	
	public String palo() {
		return palo;
	}
	public int valor() {
		return valor;
	}
	
	public boolean esMismoPalo(Carta carta) {
		return this.palo().equals(carta.palo());
	}
	
	public boolean esMayor(Carta carta) {
		return this.valor() > carta.valor();
	}
}
