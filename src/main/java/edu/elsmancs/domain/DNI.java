package edu.elsmancs.domain;

public class DNI {

	private final int DNI_Number;
	
	public DNI(int DNI_Number) {
		this.DNI_Number = DNI_Number;
	}
	
	public int getDNI_Number() {
		return DNI_Number;
	}
	
	public String calculateCharacter() {
		return AssignationTable.getCharacter(getDNI_Number());
	}
}
