package cs162;

public class DynamicArrayTester {

	public static void main(String[] args) {
		
		int [] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30; //the array is full!!!
		printArray(arr);
		
		arr = add(arr, 40); //insert new item...
		System.out.println();
		printArray(arr);

	}
	
	private static void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i + ",");
		}
	}
	private static int[] add(int[] theOriginal, int item) {
		//when adding new items,
		//if the array is full, 
		//expand automatically
		//create a larger array
		int lastIndex = theOriginal.length - 1;
		
		if(theOriginal[lastIndex] != 0) {
			//System.out.println();
			//System.out.println(theOriginal[lastIndex]);
			//the array is full
			int[] temp = new int[theOriginal.length + 5];
			//copy the elements from the actual original arr
			for(int i = 0; i < theOriginal.length; i++) {
				temp[i] = theOriginal[i];
			}
			System.out.println("temp");
			
			theOriginal = temp;
			theOriginal[lastIndex + 1] = item;
			printArray(theOriginal);
			
		}
		return theOriginal;
		
		
		
		
	}

}
