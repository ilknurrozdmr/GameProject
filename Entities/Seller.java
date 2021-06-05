package Entities;

import java.time.LocalDate;

public class Seller extends Customer{
private String number;

public Seller(int id, String firstName, String lastName, String email, LocalDate dateOfBirth, String nationalityId,
		String number) {
	super(id, firstName, lastName, email, dateOfBirth, nationalityId);
	this.number = number;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

}
