package cs162;

public class driverForCar {

	public static void main(String[] args) {
		
		Car c1 = new Car("Tesla", 2021);
		c1.setYear(2022);
		
		System.out.println(c1);
		c1.setModel("Ford");
		
		System.out.println(c1);

	}

}
