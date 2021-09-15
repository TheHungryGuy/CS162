package cs162;

public class ArrayOfStudents {

	public static void main(String[] args) {
		
		Student s1 = new Student(); //using default constructor
		Student s2 = new Student("Jack", "Smith", 
				"jsmith@abc.com", 123);//using the other const.
		s1.setFirstName("Kelly");
		s1.setLastName("Brown");
		s1.setEmail("kbrown@abc.com");
		s1.setStudentID(4532);
		//System.out.println(s1);
		//System.out.println(s2);
		Student s3 = new Student("Peter", "Smith", 
				"psmith@abc.com", 124);
		//create a student array, named cs162
		//then, process the array in a loop,
		//print out information for each student
		//int [] arr = new int[10];
		Student[] cs162 = new Student[5];
		cs162[0] = s1;
		cs162[1] = s2;
		cs162[2] = s3;
		
		for(int i = 0; i < cs162.length; i++) {
			System.out.println(cs162[i]);
		}
	}

}
