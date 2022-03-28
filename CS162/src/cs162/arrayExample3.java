package cs162;
import java.util.Scanner;
public class arrayExample3 {

	public static void main(String[] args) {

		//1. ask user how many int numbers the user needs
		//2. create an array for those numbers
		//3. go into a loop, ask user to enter
		//   n numbers in turn, and insert them
		//   into the array
		//4. print thanks
		//5. loop in, calculate the average, print it
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers you need? ");
		int numbers = input.nextInt();
		
		int[] userNumbers = new int[numbers];
		
		for(int i = 0; i < numbers; i++) {
			System.out.print("Enter the value of cell #" + i + " ");
			userNumbers[i] = input.nextInt();
		}
		
		printArray(userNumbers); //just print the array on screen
		
		//calculate the sum and average, and print...
		System.out.println();
		System.out.println(calculateAverage(userNumbers));
		
		int[] minMax = calculateMinMax(userNumbers);
		System.out.println("Min: " + minMax[0]);
		System.out.println("Max: " + minMax[1]);
		
	}
	
	private static int[] calculateMinMax(int[] arr){
		int min = arr[0];
		int max = arr[0];
		
		for(int theItem: arr) {
			if(theItem < min)
				min = theItem;
			if(theItem > max)
				max = theItem;
		} 
		int[] theResult = {min, max};
		return theResult;
	}
	
	private static double calculateAverage(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	
	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
