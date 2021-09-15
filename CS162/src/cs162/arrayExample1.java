package cs162;

public class arrayExample1 {

	public static void main(String[] args) {
		
		//create the array reference,
		//and point it to a new array object
		//with 4 numbers...
		int[] ages = new int[4];
		
		ages[0] = 10;
		ages[1] = 20;
		ages[2] = 30;
		ages[3] = 40;
		
		System.out.println(ages);
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}

	}

}
