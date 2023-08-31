package s23backend.modelandview.domain;

public class Student {
	private String firstName;
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return firstName + " " +  lastName ;
	}
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
