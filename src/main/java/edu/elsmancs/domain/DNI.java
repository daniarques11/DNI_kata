package edu.elsmancs.domain;

public class DNI {

	private final int DNI_Number;
	private final AssignationTable regularTable = new AssignationTable();
	
	public DNI(int DNI_Number) {
		this.DNI_Number = DNI_Number;
	}
	
	public int getDNI_Number() {
		return DNI_Number;
	}
	
	public String calculateCharacter() {
		return regularTable.getCharacter(getDNI_Number());
	}
}
