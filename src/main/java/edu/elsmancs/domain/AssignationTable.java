package edu.elsmancs.domain;

import java.util.Hashtable;

public class AssignationTable {

	private static String[] charactersVector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	static Hashtable<Integer, String> assignationTable = new Hashtable<Integer, String>();
	
	
	private static void buildAssignationTable(){
		for (int i = 0; i < charactersVector.length; i++)
			assignationTable.put(i, charactersVector[i]);
	}
	
	public static String getCharacter(int number) {
		buildAssignationTable();
		int remainder = number % charactersVector.length;
		return assignationTable.get(remainder);
	}
	
	
}
