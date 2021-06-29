package userChallenge;

//import java.util.ArrayList;
import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String phoneNumber;
	private List<String> middleNames;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<String> getMiddleNames() {
		return this.middleNames;
	}
	
	public void setMiddleNames(List<String> middleNames) {
		this.middleNames = middleNames;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", middleNames=" + middleNames + "]";
	}
	
	
	
//	@Override
//	public String toString() {
//		return firstName + lastName + age + email + phoneNumber + middleNames;
//	}
	
}
