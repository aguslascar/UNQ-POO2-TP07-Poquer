package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	
	private PokerStatus verificador;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		verificador = new PokerStatus();
	}

	@Test
	void testMazoCon3CartasMismoValor() {
		//Exercise y Verify
		assertFalse(verificador.verificar("8d", "8c", "8t", "4c", "kt"));
	}
	
	@Test
	void testMazoConTodasCartasDistintas() {
		assertFalse(verificador.verificar("8d", "3t", "8p", "4p", "jc"));
	}

	@Test 
	void testMazoCon2CartasMismoValor() {
		assertFalse(verificador.verificar("5d", "8d", "10t", "4p", "4t"));
	}
	
	@Test
	void testMazoPoquer() {
		assert(verificador.verificar("8c", "8d", "8t", "8p", "5d"));
	}
	
	@Test
	void testMazoConTodasMismoPalo() {
		
	}
}
