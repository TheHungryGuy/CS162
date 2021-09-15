
import java.math.*;
import java.util.*;
public class randonLowercaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myList = new int[100];
		Random rand = new Random();
		
		// define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;
		
		for(int i= 0;i < myList.length;i++) {
			myList[i]=(rand.nextInt(93) + 1);
			System.out.print(myList[i] + ",");
		}
		

	}

}
