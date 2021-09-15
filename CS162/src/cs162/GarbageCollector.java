package cs162;

public class GarbageCollector {

	public static void main(String[] args) {
		Student s2 = new Student("Jack", "Smith", 
				"jsmith@abc.com", 123);
		System.out.println(s2);
		
		s2 = null;
		System.out.println(s2);

	}

}
