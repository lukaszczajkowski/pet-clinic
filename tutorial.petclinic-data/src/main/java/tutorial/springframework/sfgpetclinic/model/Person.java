package tutorial.springframework.sfgpetclinic.model;

public class Person {
	
	private String firstName;
	private String lastName;
	private Long id;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getId() {
		return this.id;
	}
}
