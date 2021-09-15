package cs162;

public class SearchInArray {

	public static void main(String[] args) {
		int[] arr = {10, 3, 20, 5, 65, 100};
		System.out.println("found at: " + search(599, arr));

	}

	private static int search(int target, int[] arr) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == target)
				return i;
		
		//it's not found...
		return -1;
	}
}
