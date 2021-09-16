import java.util.*;
public class randonLowercaseLetters {

	public static void main(String[] args) {
		
		//Create array list to hold 100 numbers
		int[] numbersArr = new int[100];
		//Create array list hold characters
		char[] charArr = new char[100];
		//create random class
		Random rand = new Random();
		
		//Run for loop to assign 100 random numbers
		for(int i= 0;i < numbersArr.length;i++) {
			
			//Subtract min from max to set range
			// then add min number 
			numbersArr[i]=(rand.nextInt(26) + 97); 
			//Print out all numbers
			System.out.print(numbersArr[i] + ",");
		}
		//
		System.out.println();
		System.out.println();
		//Run for loop to take numbers from last array
		//insert into new char array
		for (int i=0; i< charArr.length;i++) {
		//typecast them into char to convert to ascii 
			charArr[i]= (char) numbersArr[i];
		//Print out all characters	
			System.out.println((i+1) +"." + charArr[i]);
			
		}
		
	}
}
