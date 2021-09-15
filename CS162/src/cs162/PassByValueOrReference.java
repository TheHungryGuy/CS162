package cs162;

public class PassByValueOrReference {

	public static void main(String[] args) {
		
		int x = 1;
		int[] y = new int[10];
		System.out.println(x + ";" + y[0]);
		m(x, y);
		System.out.println(x + ";" + y[0]);

	}
	
	private static void m(int number, int[] numbers) {
		number = 1001;
		numbers[20] = 5555;
	}
	

}
