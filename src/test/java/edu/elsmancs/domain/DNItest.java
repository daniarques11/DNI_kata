package edu.elsmancs.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DNItest {

	@Test
	public void crearDNItest() {
		DNI DNI_Dani = new DNI(43462005);
		assertEquals(DNI_Dani.getDNI_Number(), 43462005, 0);
	}

	@Test
	public void calculateCharacterTest() {
		DNI DNI_Dani = new DNI(43462005);
		assertEquals(DNI_Dani.calculateCharacter(), "D");
	}

}
