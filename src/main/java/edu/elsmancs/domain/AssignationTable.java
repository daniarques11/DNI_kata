package edu.elsmancs.domain;

import java.util.Hashtable;

public class AssignationTable {

	private String[] charactersVector;
	static Hashtable<Integer, String> assignationTable = new Hashtable<Integer, String>();
	
	public AssignationTable() {
		 this.charactersVector = new String[] {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	}
	
	public AssignationTable(String[] charactersVector) {
		this.charactersVector = charactersVector;
	}
	
	
	public String[] getCharactersVector() {
		return charactersVector;
	}
	
	public int vectorLength() {
		return this.charactersVector.length;
	}
	
	
	private void buildAssignationTable(){
		for (int i = 0; i < vectorLength(); i++)
			assignationTable.put(i, getCharactersVector()[i]);
	}
	
	public String getCharacter(int number) {
		buildAssignationTable();
		int remainder = number % vectorLength();
		return assignationTable.get(remainder);
	}
	
	
}
