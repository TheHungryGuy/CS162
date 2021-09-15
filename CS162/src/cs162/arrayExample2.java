package cs162;

public class arrayExample2 {

	public static void main(String[] args) {
		
		//creating arrays in two ways...
		//1. regular way...
		double[] myBudget = new double[3]; //empty!!!
		
		//2. create and initialize!!!
		double[] yourBudget = {20.45, 100.67, 89.45};
		
		for(int i=0; i<myBudget.length; i++) {
			System.out.println("+ : " + myBudget[i]);
			System.out.println("*: " + yourBudget[i]);
		}

		
	}

}
