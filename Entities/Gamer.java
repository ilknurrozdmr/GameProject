package Entities;

import java.time.LocalDate;

public class Gamer extends Customer{
private String username;

public Gamer(int id, String firstName, String lastName, String email, LocalDate dateOfBirth, String nationalityId,
		String username) {
	super(id, firstName, lastName, email, dateOfBirth, nationalityId);
	this.username = username;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}



}
