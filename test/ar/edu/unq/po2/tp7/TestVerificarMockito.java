package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Carta;

class TestVerificarMockito {
	
	PokerStatus verificador;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		verificador = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}

	@Test
	void testPoker() {
		when(carta1.valor()).thenReturn(8);
		when(carta2.valor()).thenReturn(8);
		when(carta3.valor()).thenReturn(8);
		when(carta4.valor()).thenReturn(8);
		when(carta5.valor()).thenReturn(5);
		assertEquals("Poker", verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test 
	void Trio() {
		when(carta1.valor()).thenReturn(8);
		when(carta2.valor()).thenReturn(8);
		when(carta3.valor()).thenReturn(8);
		when(carta4.valor()).thenReturn(6);
		when(carta5.valor()).thenReturn(5);
		assertEquals("Trio", verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	void Color() {
		when(carta1.palo()).thenReturn("Picas");
		when(carta2.palo()).thenReturn("Picas");
		when(carta3.palo()).thenReturn("Picas");
		when(carta4.palo()).thenReturn("Picas");
		when(carta5.palo()).thenReturn("Picas");
		assertEquals("Color", verificador.verificar(carta1, carta2, carta3, carta4, carta5));
	}

}
