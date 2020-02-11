package edu.elsmancs.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignationTableTest {

	@Test
	public void getCharacterTest() {
		AssignationTable regularTable = new AssignationTable();
		assertEquals(regularTable.getCharacter(0), "T");
		assertEquals(regularTable.getCharacter(1), "R");
		assertEquals(regularTable.getCharacter(2), "W");
		assertEquals(regularTable.getCharacter(3), "A");
		assertEquals(regularTable.getCharacter(4), "G");
		assertEquals(regularTable.getCharacter(5), "M");
		assertEquals(regularTable.getCharacter(6), "Y");
		assertEquals(regularTable.getCharacter(7), "F");
		assertEquals(regularTable.getCharacter(8), "P");
		assertEquals(regularTable.getCharacter(9), "D");
		assertEquals(regularTable.getCharacter(10), "X");
		assertEquals(regularTable.getCharacter(11), "B");
		assertEquals(regularTable.getCharacter(12), "N");
		assertEquals(regularTable.getCharacter(13), "J");
		assertEquals(regularTable.getCharacter(14), "Z");
		assertEquals(regularTable.getCharacter(15), "S");
		assertEquals(regularTable.getCharacter(16), "Q");
		assertEquals(regularTable.getCharacter(17), "V");
		assertEquals(regularTable.getCharacter(18), "H");
		assertEquals(regularTable.getCharacter(19), "L");
		assertEquals(regularTable.getCharacter(20), "C");
		assertEquals(regularTable.getCharacter(21), "K");
		assertEquals(regularTable.getCharacter(22), "E");
	}

}
