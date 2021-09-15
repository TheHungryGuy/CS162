package cs162;

public class Car {

	//attributes
	private String model;
	private int year;
	
	//constructors
	public Car(String initModel,
			int initYear) {
		model = initModel;
		year = initYear;
	}

	//methods
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		String result;
		result = model + "-" + year;
		return result;
	}

	
}
