package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	
	private PokerStatus verificador;
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		verificador = new PokerStatus();
	}

	@Test
	void testMazoCon3CartasMismoValor() {
		//Exercise 
		carta1 = "8d";
		carta2 = "8c";
		carta3 = "8t";
		carta4 = "4c";
		carta5 = "kt";
		// Verify
		assertFalse(verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testMazoConTodasCartasDistintas() {
		//Exercise 
		carta1 = "8d";
		carta2 = "3t";
		carta3 = "8p";
		carta4 = "4p";
		carta5 = "jc";
		// Verify
		assertFalse(verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}

	@Test 
	void testMazoCon2CartasMismoValor() {
		//Exercise 
		carta1 = "5d";
		carta2 = "8d";
		carta3 = "10t";
		carta4 = "4p";
		carta5 = "4t";
		// Verify
		assertFalse(verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testMazoPoquer() {
		//Exercise 
		carta1 = "8c";
		carta2 = "8d";
		carta3 = "8t";
		carta4 = "8p";
		carta5 = "5d";
		// Verify
		assert(verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void testMazoConTodasMismoPalo() {
		
	}
}
