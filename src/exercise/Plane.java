package exercise;

public class Plane {
	private String manufacturer; // 제작사
	private String model; // 비행기 모델명
	private int maxNumberOfPassengers; // 최대 승객수
	static int numberOfPlanes; 
	
	public Plane() {
		this.manufacturer = "0";
		this.model = "0";
		this.maxNumberOfPassengers = 0;
		this.numberOfPlanes ++;
	}
	public Plane(String manufacturer,String model,int maxNumberOfPassengers) {
		this.numberOfPlanes ++;
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	void setModel(String model) {
		this.model = model;
	}
	void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers < 0) {
			this.maxNumberOfPassengers = 0;
			return;
		}
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	String getManufacturer() {
		return manufacturer;
	}
	String getModel() {
		return model;
	}
	int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
}
