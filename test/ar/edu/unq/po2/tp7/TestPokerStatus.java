package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	
	private PokerStatus verificador;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		verificador = new PokerStatus();
	}

	@Test
	void testMazoCon3CartasMismoValor() {
		//Exercise 
		carta1 = new Carta(8, "Diamantes");
		carta2 = new Carta(8, "Corazones");
		carta3 = new Carta(8, "Treboles");
		carta4 = new Carta(4, "Corazones");
		carta5 = new Carta(13, "Treboles");
		// Verify
		assertEquals("Trio", verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testMazoConTodasCartasDistintas() {
		//Exercise 
		carta1 = new Carta(8, "Diamantes");
		carta2 = new Carta(3, "Treboles");
		carta3 = new Carta(8, "Picas");
		carta4 = new Carta(4, "Picas");
		carta5 = new Carta(11, "Corazones");
		// Verify
		assertNull(verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}

	@Test 
	void testMazoCon2CartasMismoValor() {
		//Exercise 
		carta1 = new Carta(5, "Diamantes");
		carta2 = new Carta(8, "Diamantes");
		carta3 = new Carta(10, "Treboles");
		carta4 = new Carta(4, "Picas");
		carta5 = new Carta(4, "Treboles");
		// Verify
		assertNull(verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testMazoPoquer() {
		//Exercise 
		carta1 = new Carta(8, "Corazones");
		carta2 = new Carta(8, "Diamantes");
		carta3 = new Carta(8, "Treboles");
		carta4 = new Carta(8, "Picas");
		carta5 = new Carta(5, "Diamantes");
		// Verify
		assertEquals("Poker", verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testMazoConTodasMismoPalo() {
		//Exercise 
		carta1 = new Carta(2, "Corazones");
		carta2 = new Carta(3, "Corazones");
		carta3 = new Carta(4, "Corazones");
		carta4 = new Carta(5, "Corazones");
		carta5 = new Carta(6, "Corazones");
		// Verify
		assertEquals("Color", verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
}