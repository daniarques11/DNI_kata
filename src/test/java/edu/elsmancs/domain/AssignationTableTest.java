package edu.elsmancs.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignationTableTest {

	@Test
	public void getCharacterTest() {
		assertEquals(AssignationTable.getCharacter(0), "T");
		assertEquals(AssignationTable.getCharacter(1), "R");
		assertEquals(AssignationTable.getCharacter(2), "W");
		assertEquals(AssignationTable.getCharacter(3), "A");
		assertEquals(AssignationTable.getCharacter(4), "G");
		assertEquals(AssignationTable.getCharacter(5), "M");
		assertEquals(AssignationTable.getCharacter(6), "Y");
		assertEquals(AssignationTable.getCharacter(7), "F");
		assertEquals(AssignationTable.getCharacter(8), "P");
		assertEquals(AssignationTable.getCharacter(9), "D");
		assertEquals(AssignationTable.getCharacter(10), "X");
		assertEquals(AssignationTable.getCharacter(11), "B");
		assertEquals(AssignationTable.getCharacter(12), "N");
		assertEquals(AssignationTable.getCharacter(13), "J");
		assertEquals(AssignationTable.getCharacter(14), "Z");
		assertEquals(AssignationTable.getCharacter(15), "S");
		assertEquals(AssignationTable.getCharacter(16), "Q");
		assertEquals(AssignationTable.getCharacter(17), "V");
		assertEquals(AssignationTable.getCharacter(18), "H");
		assertEquals(AssignationTable.getCharacter(19), "L");
		assertEquals(AssignationTable.getCharacter(20), "C");
		assertEquals(AssignationTable.getCharacter(21), "K");
		assertEquals(AssignationTable.getCharacter(22), "E");
	}

}
