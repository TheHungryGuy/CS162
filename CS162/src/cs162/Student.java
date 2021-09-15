package cs162;

public class Student {

	//attributes
	String firstName, lastName, email;
	int studentID;
	
	//constructors
	//default constructor
	public Student() {
		//don't do anything here
		//bec, it's just an empty object...
	} 
	
	public Student(String initFName, String initLName, 
			String initEmail, int initStudentID){
		firstName = initFName;
		lastName = initLName;
		email = initEmail;
		studentID = initStudentID;
	}

	//methods
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String toString() {
		return lastName + ", " + firstName + '\n' 
				+ email + '\n' +
				studentID;
	}
	
}
