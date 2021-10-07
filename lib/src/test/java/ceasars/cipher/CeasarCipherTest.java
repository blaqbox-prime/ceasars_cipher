package ceasars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarCipherTest {
	
	private CeasarCipher ceasarCipher = new CeasarCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", ceasarCipher.cipher("how are you doing today",12));
	}
	
//	@Test
//	void testCipheredMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmk", ceasarCipher.cipher("how are you doing today",11));
//	}
	
	@Test
	void testEmptyString() {
		assertEquals("", ceasarCipher.cipher("",12));
	}

}
