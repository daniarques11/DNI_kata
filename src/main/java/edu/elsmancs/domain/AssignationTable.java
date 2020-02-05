package edu.elsmancs.domain;

import java.util.Hashtable;

public class AssignationTable {

	private static String[] charactersVector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	static Hashtable<Integer, String> assignationTable = new Hashtable<Integer, String>();
	
	public AssignationTable(String[] charactersVector) {
		this.setCharactersVector(charactersVector);
	}
	
	public static String[] getCharactersVector() {
		return charactersVector;
	}
	
	public void setCharactersVector(String[] charactersVector) {
		AssignationTable.charactersVector = charactersVector;
	}
	
	private static void buildAssignationTable(){
		for (int i = 0; i < getCharactersVector().length; i++)
			assignationTable.put(i, getCharactersVector()[i]);
	}
	
	public static String getCharacter(int number) {
		buildAssignationTable();
		int remainder = number % getCharactersVector().length;
		return assignationTable.get(remainder);
	}
	
	
}
